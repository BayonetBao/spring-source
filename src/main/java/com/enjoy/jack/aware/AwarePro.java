package com.enjoy.jack.aware;

import com.enjoy.jack.beanDefinitionPostProcessor.BeanPro;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AwarePro implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AnnotationConfigApplicationContext applicationContext1 = (AnnotationConfigApplicationContext) applicationContext;
        BeanDefinitionRegistry beanDefinitionRegistry = applicationContext1;
        DefaultListableBeanFactory defaultListableBeanFactory =  applicationContext1.getDefaultListableBeanFactory();
        System.out.println(applicationContext);
    }
}