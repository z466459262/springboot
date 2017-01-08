package com.zwz.d.enable;

import com.zwz.d.enable.import4beanregistrar.BeanDefinitionRegistar4Word;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by zhouwenzhe on 16/12/17.
 * EnableConfigurationProperties 用来启动一个特性，这个特性可以把配置文件的属性注入到bean里面去
 * Import 用来导入类或配置类，导入类表示被spring托管，导入配置类表示里面的bean都会被spring容器托管
 *
 */
@ComponentScan
@EnableAsync
@EnableConfigurationProperties
@Import(BeanDefinitionRegistar4Word.class)
@EnableAutoConfiguration
public class DEnableMain2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DEnableMain2.class, args);

        System.out.println(ctx.getBean("bbb"));

        ctx.close();
    }
}
