package com.enjoy.jack.interfaces;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyScans.class)
public @interface MyComponentScans {
    String value() default "";
}
