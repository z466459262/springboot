package com.zwz.b.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhouwenzhe on 16/12/25.
 * PropertySource，那么扫描后就会纳入到property的寻找路径里面去
 * 注意：PropertySource 注解要配合Configuration 注解使用，声明他是个配置类
 */
@PropertySource("classpath:b.config/classpathproperties.txt")
@Configuration
public class PropertySource4ClassPathProperties {
}
