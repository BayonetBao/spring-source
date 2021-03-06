package com.enjoy.jack.cache;

import lombok.Data;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.SerializationUtils;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.concurrent.Callable;
@Data
public class RedisCache implements Cache {
    private RedisTemplate<String,Object> restTemplate;
    private String name;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public ValueWrapper get(Object key) {
        System.out.println("=======缓存获取======"+key.toString());
        final String keyf = key.toString();
        Object object = null;
        object = restTemplate.execute(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                byte[] key = keyf.getBytes();
                byte[] value = redisConnection.get(key);
                if(value == null){
                    System.out.println("缓存不存在========");
                    return null;
                }
                return SerializationUtils.deserialize(value);
            }
        });
        ValueWrapper obj = (object != null ?new SimpleValueWrapper(object):null);
        System.out.println("获取到内容========"+(obj != null ? obj.get() : ""));
        return obj;
    }

    @Override
    public <T> T get(Object key, Class<T> type) {
        return null;
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        System.out.println("加入缓存======");
        System.out.println("key======"+key);
        System.out.println("value======"+value);
        final String keyString = key.toString();
        final Object valuef = value;
        final long liveTime = 86400;
        restTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection redisConnection) throws DataAccessException {
                byte[] keyb = keyString.getBytes();
                byte[] valueb = SerializationUtils.serialize((Serializable)valuef);
                redisConnection.set(keyb,valueb);
                if(liveTime > 0){
                    redisConnection.expire(keyb,liveTime);
                }
                return 1L;
            }
        });
    }

    @Override
    public void evict(Object key) {
        System.out.println("缓存删除=====");
        final String keyf = key.toString();
        restTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection.del(keyf.getBytes());
            }
        });
    }

    @Override
    public void clear() {
        System.out.println("缓存清理=======");
        restTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.flushDb();
                return "ok";
            }
        });
    }
}
