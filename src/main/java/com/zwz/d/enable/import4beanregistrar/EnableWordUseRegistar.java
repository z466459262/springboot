package com.zwz.d.enable.import4beanregistrar;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(BeanDefinitionRegistar4Word.class)
public @interface EnableWordUseRegistar {
    String name();
}
