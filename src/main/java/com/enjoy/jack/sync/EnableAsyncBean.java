package com.enjoy.jack.sync;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

import java.util.concurrent.ThreadPoolExecutor;


@EnableAsync
public class EnableAsyncBean {
    int corePoolSize = 10;
    int maxPoolSize = 200;
    int queueCapacity = 10;
    String ThreadNamePrefix = "JackExecutor-";
    @Bean
    public Executor executor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix(ThreadNamePrefix);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;



    }
}
