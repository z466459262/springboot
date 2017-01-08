package com.zwz.d.enable.autoConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这玩意在META-INF/spring.factories 中配置，然后就会被默认的扫描到。
 *
 */
@Configuration
public class RunnableConfiguration {

    @Bean
    public  Runnable aautoconfig(){
        return () ->{};
    }
}
