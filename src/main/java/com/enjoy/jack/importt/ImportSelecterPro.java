package com.enjoy.jack.importt;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportSelecterPro implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回类的全限定名，核心目标是获取MetaData对象
        return new String[0];
    }
}
