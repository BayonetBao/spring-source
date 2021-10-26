package com.enjoy.jack.bean;

import org.springframework.beans.factory.FactoryBean;

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
