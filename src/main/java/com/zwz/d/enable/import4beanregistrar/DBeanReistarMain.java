package com.zwz.d.enable.import4beanregistrar;

import com.zwz.d.enable.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@SpringBootApplication
@EnableWordUseRegistar(name="a")
public class DBeanReistarMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBeanReistarMain.class, args);
        System.err.println(ctx.getBean(A.class));
        ctx.close();
    }
}
