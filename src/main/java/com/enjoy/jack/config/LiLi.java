package com.enjoy.jack.config;

import com.enjoy.jack.bean.Jack;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


public class LiLi implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Jack();
    }

    @Override
    public Class<?> getObjectType() {
        return Jack.class;
    }
}
