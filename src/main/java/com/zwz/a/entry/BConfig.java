package com.zwz.a.entry;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by zhouwenzhe on 16/12/13.
 */
@SpringBootConfiguration
public class BConfig {

    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("spring boot is running..................");
        };
    }

}
