package com.zwz.d.enable.import4Configuration.main;

import com.zwz.d.enable.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@SpringBootApplication
@EnableCaching
public class DConfigurationMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DConfigurationMain.class, args);
        System.err.println(ctx.getBean(A.class));

        ctx.close();
    }
}
