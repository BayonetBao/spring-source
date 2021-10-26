package com.enjoy.jack.scopeproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    @Autowired
    ScopedProxyBean scopedProxyBean;
    void test(){
        scopedProxyBean.code();
    }
}
