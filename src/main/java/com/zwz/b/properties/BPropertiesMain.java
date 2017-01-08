package com.zwz.b.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/14.
 * 加SpringBootApplication此时等于加ComponentScan
 */
@SpringBootApplication
public class BPropertiesMain {


    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(BPropertiesMain.class, args);


        ctx.close();
        //


    }
}
