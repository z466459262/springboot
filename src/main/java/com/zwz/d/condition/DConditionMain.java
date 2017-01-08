package com.zwz.d.condition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/16.
 */
@SpringBootApplication
public class DConditionMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DConditionMain.class, args);
        System.err.println(run.getBeansOfType(Runnable.class));
        run.close();

    }
}
