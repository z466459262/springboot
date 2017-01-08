package com.zwz.c.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@SpringBootApplication
public class CProfileMain {
    public static void main(String[] args) {
        //        编程方式制定profile,启动参数制定就是 --spring.profile.active=dev,test，--spring.profiles=dev 表示激活注解@profiles,没配置的不激活
        SpringApplication app = new SpringApplication(CProfileMain.class);
        app.setAdditionalProfiles("dev");//可以拿到application-dev.properties
        ConfigurableApplicationContext ctx = app.run(args);
        System.err.println(ctx.getBean("devProfileBean"));
        ctx.close();
    }
}
