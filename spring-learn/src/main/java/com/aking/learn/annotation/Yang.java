package com.aking.learn.annotation;

import java.lang.annotation.*;

/**
 * @author yangkang
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Yang {
	boolean required() default true;
}
