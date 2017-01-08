package com.zwz.g.scan;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by zhouwenzhe on 16/12/18.
 */
@SpringBootConfiguration
public class ScanTestConfig {

    @Bean
    public Runnable scanMe(){
        return ()->{};
    }
}
