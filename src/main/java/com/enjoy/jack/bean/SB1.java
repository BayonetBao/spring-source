package com.enjoy.jack.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SB1 {
    @Value("${name}")
    String name;
    @Value("${age}")
    int age;
}
