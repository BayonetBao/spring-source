package com.enjoy.jack.aspect;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.interceptor.ExposeInvocationInterceptor;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAspect {
    @Pointcut(value = "execution(* com.enjoy.jack.*.*.*(..))")
    public void pc(){}
    @Before(value = "pc()")
    public void before(){
        //通过ThreadLocal获取MethodInvocation
        MethodInvocation methodInvocation = ExposeInvocationInterceptor.currentInvocation();

        System.out.println("before===============");
    }
}
