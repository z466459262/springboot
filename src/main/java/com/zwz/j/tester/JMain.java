package com.zwz.j.tester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



/**
 * springboot测试步骤
 * 直接在测试类上面加上如下2个注解
 *  @RunWith(SpringRunner.class)
    @SpringBootTest
 */
@SpringBootApplication
public class JMain {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(JMain.class, args);
        //	context.close();
    }
}
