package com.zwz.a.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by zhouwenzhe on 16/12/14.
 */
@SpringBootApplication
public class AMain {

    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("spring boot is running..................");
        };
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(AMain.class, args);
        ctx.getBean(Runnable.class).run();
    }
}
