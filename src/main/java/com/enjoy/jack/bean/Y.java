package com.enjoy.jack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {
//    @Autowired
//    X x;

    public Y() {
        System.out.println("Y被创建。。。。");
    }
}
