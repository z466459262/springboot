package com.zwz.d.enable.autoConfiguration.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@SpringBootApplication
public class DAutoConfigMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DAutoConfigMain.class, args);
        System.err.println(ctx.getBean("aautoconfig"));
        ctx.close();
    }
}
