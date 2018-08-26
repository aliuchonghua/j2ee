package com.westos.web02.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/8/26.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentAnno {
   String key() default "westos";
   String value() default "hello";
}
