package com.enjoy.jack.aware;

import com.enjoy.jack.Config;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class ResourseLoaderPro implements ResourceLoaderAware {
    static ResourceLoader resourceLoader;
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        Resource c;
    }
    static void getMeta() throws IOException {
        CachingMetadataReaderFactory cmrf = new CachingMetadataReaderFactory(resourceLoader);
        MetadataReader metadataReader = cmrf.getMetadataReader(Config.class.getName());
        System.out.println(metadataReader);
        MergedAnnotations annotations = metadataReader.getAnnotationMetadata().getAnnotations();
        System.out.println(annotations);
        MergedAnnotation<Component> componentMergedAnnotation = annotations.get(Component.class);

        System.out.println(componentMergedAnnotation);
    }

    public static void main(String[] args) throws IOException {
        getMeta();
    }
}
