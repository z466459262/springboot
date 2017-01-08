package com.zwz.g.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/18.
 */
@SpringBootApplication
public class GMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(GMain.class, args);
        ctx.close();
    }
}
