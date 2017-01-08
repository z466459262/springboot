package com.zwz.g.scan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/18.
 * 默认扫描的是当前包和子包的内容,所以加上scanBasePackages可以扫指定包内容
 */
@SpringBootApplication(scanBasePackages={"com.zwz.g.scan"})
public class GScanMain {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(GScanMain.class);
        ConfigurableApplicationContext ctx = sa.run(args);
        System.err.println(ctx.getBean("scanMe"));
        ctx.close();

    }
}
