package com.enjoy.jack.customTargetSource;

import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;

public class CustomTargetSource extends AbstractBeanFactoryBasedTargetSource {
    @Override
    public Object getTarget() throws Exception {
        //这里不会生成代理，因为没有AOP入口类
        return getBeanFactory().getBean(getTargetBeanName());
    }
}
