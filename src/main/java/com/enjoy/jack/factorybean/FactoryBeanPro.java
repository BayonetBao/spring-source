package com.enjoy.jack.factorybean;

import com.enjoy.jack.bean.SB1;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanPro implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new SB1();
    }

    @Override
    public Class<?> getObjectType() {
        return SB1.class;
    }
}
