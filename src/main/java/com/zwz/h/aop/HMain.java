package com.zwz.h.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 17/1/8.
 */

@SpringBootApplication
public class HMain {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(HMain.class, args);

        ctx.getBean(User.class).a();

        ctx.close();
    }
}
