package com.zwz.d.enable.defaultenable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@SpringBootApplication
@EnableAsync
public class DDefaultMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DDefaultMain.class, args);
        ctx.getBean(Runner.class).run();
        System.err.println(" i am first ");
        ctx.close();
    }
}

