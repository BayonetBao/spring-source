package com.enjoy.jack.interfaces;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;

public class MyScans extends ClassPathBeanDefinitionScanner implements ImportAware {
    public MyScans(BeanDefinitionRegistry registry) {
        super(registry);
    }

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        MergedAnnotations annotations = importMetadata.getAnnotations();

    }
}
