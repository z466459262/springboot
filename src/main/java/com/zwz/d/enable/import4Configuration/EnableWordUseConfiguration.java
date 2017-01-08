package com.zwz.d.enable.import4Configuration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Enable注解是手动启用 selector 来加载 类到spring 容器中
 */
@Target({ ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WordConfiguration.class)
public @interface EnableWordUseConfiguration {
}
