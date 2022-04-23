package com.enjoy.jack.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JackFactory {
    @Bean
    public Jack init(){
        return new Jack();
    }
}
