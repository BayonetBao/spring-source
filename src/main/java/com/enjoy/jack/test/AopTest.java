package com.enjoy.jack.test;

import com.enjoy.jack.Config;
import com.enjoy.jack.bean.SB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SB bean = context.getBean(SB.class);
        bean.say();
    }
}
