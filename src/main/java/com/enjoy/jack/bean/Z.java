package com.enjoy.jack.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Z {
    @Autowired(required = false)
    public Z(X x,Y y){
    }
}
