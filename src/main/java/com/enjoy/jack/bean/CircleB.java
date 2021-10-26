package com.enjoy.jack.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircleB {
    public CircleA circleA;
    @Lazy
    @Autowired
    public CircleB(CircleA circleA){
        this.circleA = circleA;
    }
}
