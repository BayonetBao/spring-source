package com.enjoy.jack.bean;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class SB {
    String name;
    int age;
    String address;
    public void say(){
        System.out.println("I am SB lxc....");
    }
}
