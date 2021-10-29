package com.enjoy.jack.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@Component
public class DogImplPointCut implements ClassFilter, MethodMatcher, Pointcut {
    @Override
    public boolean matches(Class<?> clazz) {
        return true;
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        Method mostSpecificMethod = AopUtils.getMostSpecificMethod(method, targetClass);
        if(AnnotatedElementUtils.hasAnnotation(mostSpecificMethod,DogProxy.class)){
            System.out.println("方法的hashCode=========="+method.hashCode());
            return true;
        }
        return false;
    }

    @Override
    public boolean isRuntime() {
        return false;
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        if(method.getName().equalsIgnoreCase("eat")){
            List<Object> objects = Arrays.asList(args);
            String parm = (String)objects.get(0);
            if("骨头".equals(parm)){
                return true;
            }
        }
        return false;
    }

    @Override
    public ClassFilter getClassFilter() {
        return this;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return this;
    }
}
