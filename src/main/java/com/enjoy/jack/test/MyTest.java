package com.enjoy.jack.test;

import com.enjoy.jack.Config;
import com.enjoy.jack.bean.*;
import com.enjoy.jack.config.Lison;
import com.enjoy.jack.config.LisonFactory;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Queue;

/**
 * @Classname MyTest
 * @Description TODO
 * @Author Jack
 * Date 2020/12/7 15:42
 * Version 1.0
 */
public class MyTest {
    public static void main(String[] args) {

        Tomcat tomcat = new Tomcat();
        Queue queue = null;
        int[] x = {1,2,3};
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student bean = applicationContext.getBean(Student.class);
        Map map;
        
        System.out.println(bean.getUsername());


    }
    @Test
    public void test2() {
       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory)beanFactory;
//        System.out.println(defaultListableBeanFactory.getBeanNamesForType(Jack.class));
        String[] beanDefinitionNames = defaultListableBeanFactory.getBeanDefinitionNames();
        Object x = applicationContext.getBean(Student.class);
        System.out.println(x);

    }
    @Test
    public void test3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SB bean = applicationContext.getBean(SB.class);
        SB bean1 = (SB) applicationContext.getBean("sB");
        System.out.println(bean.getName() + "=======" + bean.getAge());


    }
    @Test
    public void test4() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SB bean = applicationContext.getBean(SB.class);
        System.out.println(bean.getName() + "=======" + bean.getAge());
    }
    @Test
    public void testFactoryBean() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        Object x2 = applicationContext.getBean("SB1");
        System.out.println(x2);
        Object x = applicationContext.getBean("factoryBeanPro");
        System.out.println(x);
        Object x1 = applicationContext.getBean("&factoryBeanPro");
        System.out.println(x1);


    }
    @Test
    public void testConfigurationAndComponent() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        Lison bean = applicationContext.getBean(Lison.class);
        System.out.println(bean.hashCode()+"lison");
        LisonFactory bean1 = applicationContext.getBean(LisonFactory.class);
        System.out.println(bean1.getLison().hashCode()+"lison");

        Jack liLi = applicationContext.getBean(Jack.class);
        System.out.println(liLi.hashCode());

    }
}
