package com.zwz.d.enable.import4importselector;

import com.zwz.d.enable.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/17.
 * EnableConfigurationProperties 用来启动一个特性，这个特性可以把配置文件的属性注入到bean里面去
 * Import 用来导入类或配置类，导入类表示被spring托管，导入配置类表示里面的bean都会被spring容器托管
 *
 */
@EnableWord(name="b")
@SpringBootApplication
public class DSelfEnableMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DSelfEnableMain.class, args);

        System.err.println(ctx.getBean(B.class));

        ctx.close();
    }
}
