package com.enjoy.jack.annotationMeta;

import com.enjoy.jack.bean.Student;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class AnnotatiomMetaDataDemo implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    public void meta() {
        CachingMetadataReaderFactory cachingMetadataReaderFactory = new CachingMetadataReaderFactory(resourceLoader);
        try {
            MetadataReader metadataReader = cachingMetadataReaderFactory.getMetadataReader(Student.class.getName());
            MergedAnnotations annotations = metadataReader.getAnnotationMetadata().getAnnotations();
            MergedAnnotation<Component> componentMergedAnnotation = annotations.get(Component.class);
            componentMergedAnnotation.asAnnotationAttributes(MergedAnnotation.Adapt.ANNOTATION_TO_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
