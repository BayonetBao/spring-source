package com.enjoy.jack.beanDefinitionPostProcessor;

import com.enjoy.jack.bean.Student;
import com.enjoy.jack.bean.Z;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Classname BeanPro
 * @Description TODO
 * @Author Jack
 * Date 2020/12/8 21:17
 * Version 1.0
 */
//@Component
public class BeanPro1 implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory beanFactory1 = (DefaultListableBeanFactory)beanFactory;
        beanFactory1.setAllowCircularReferences(true);
        GenericBeanDefinition x = ((GenericBeanDefinition) beanFactory1.getBeanDefinition("x"));
        x.setBeanClass(Z.class);
    }
}
