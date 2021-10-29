package com.enjoy.jack.advisor;

import com.enjoy.jack.Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogAdvisorTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Dog bean = applicationContext.getBean(Dog.class);
        bean.eat("骨头");
    }

}
