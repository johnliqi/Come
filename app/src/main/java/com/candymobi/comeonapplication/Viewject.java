package com.candymobi.comeonapplication;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// rention 保留期 target 作用域  接口注解
@Retention(RUNTIME) @Target(TYPE)
public @interface Viewject {
    int mainlayoutId() default  -1 ;
}
