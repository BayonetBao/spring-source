package com.enjoy.jack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircleA {
    CircleB circleB;
    @Lazy
    @Autowired
    public CircleA(CircleB circleB){
        this.circleB = circleB;
    }
}
