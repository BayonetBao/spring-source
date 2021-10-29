package com.enjoy.jack.advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogImplAdvisor implements PointcutAdvisor {
    @Autowired
    DogImplPointCut dogImplPointCut;
    @Autowired
    DogImplAdvice dogImplAdvice;
    @Override
    public Advice getAdvice() {
        return dogImplAdvice;
    }

    @Override
    public boolean isPerInstance() {
        return false;
    }

    @Override
    public Pointcut getPointcut() {
        return dogImplPointCut;
    }
}
