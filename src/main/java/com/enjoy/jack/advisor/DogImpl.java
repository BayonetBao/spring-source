package com.enjoy.jack.advisor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DogImpl implements Dog {

    @DogProxy
    public void eat(String string) {
        System.out.println("狗吃骨头！！！");
    }
}
