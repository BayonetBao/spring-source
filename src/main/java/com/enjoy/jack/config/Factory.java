package com.enjoy.jack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class Factory {

    @Bean
    public Lison lison(){
        return new Lison();
    }
    @Bean
    public LisonFactory lisonFactory() throws Exception {
        LisonFactory lisonFactory = new LisonFactory();
        lisonFactory.setLison(lison());
        LiLi lili = lili();
        Object object = lili.getObject();
        System.out.println("object:====="+object.hashCode());
        return lisonFactory;
    }
    @Bean
    public LiLi lili(){
        return new LiLi();
    }
}
