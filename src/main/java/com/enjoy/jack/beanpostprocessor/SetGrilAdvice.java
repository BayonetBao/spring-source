package com.enjoy.jack.beanpostprocessor;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class SetGrilAdvice implements BeanPostProcessor, PriorityOrdered {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof AnnotationAwareAspectJAutoProxyCreator){
            AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator = (AnnotationAwareAspectJAutoProxyCreator)bean;
            annotationAwareAspectJAutoProxyCreator.setInterceptorNames("grilAdvice");
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 45;
    }
}
