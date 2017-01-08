package com.zwz.a.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhouwenzhe on 16/12/13.
 */
public class BMain {
    public static void main(String[] args) {
        firstEntry(args);

        secondEntry(args);

        oldEntry();
    }

    private static void oldEntry() {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext("com.zwz");
        c.getBean(Runnable.class).run();
    }

    private static void secondEntry(String[] args) {
        SpringApplication app = new SpringApplication();
        Set<Object> sets = new HashSet<>();
        sets.add(BConfig.class);
        app.setSources(sets);
        ConfigurableApplicationContext ctx1 = app.run(args);
        ctx1.getBean(Runnable.class).run();
    }

    private static void firstEntry(String[] args) {
        //入口改了
        ConfigurableApplicationContext ctx = SpringApplication.run(BConfig.class, args);
        ctx.getBean(Runnable.class).run();
    }
}
