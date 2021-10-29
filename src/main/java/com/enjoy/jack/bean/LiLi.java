package com.enjoy.jack.bean;

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
