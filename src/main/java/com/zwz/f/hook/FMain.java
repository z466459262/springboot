package com.zwz.f.hook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * refresed前执行ApplicationInit
 * 注册方法：1.sa.addInitializers
 * 2. 配置文件中： context.initializer.classes=com.zwz.f.extend.ApplicationInit 多个用,分割
 * 3. 通过spring.factories的机制
 */
@SpringBootApplication
public class FMain {
    public static void main(String[] args) {
        SpringApplication.run(FMain.class,args);

        SpringApplication sa = new SpringApplication(FMain.class);

        sa.addInitializers(new ApplicationInitHook());
        ConfigurableApplicationContext ctx = sa.run(args);

        ctx.close();

    }
}
