package com.zwz.e.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

/**
 *
 */
@SpringBootApplication
public class EMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(EMain.class, args);

        ctx.publishEvent(new MyApplicationEvent(new Object()));
       // ctx.publishEvent(new MyApplicationEvent2(new Object(),"2222222"));
        ctx.close();
    }


    /**
     * 使用evnetListener注解，可以让一个普通方法称为任何事件的监听器
     * 具体逻辑是EventListenerMethodProcessor 和EventListenerFactory
     */
    @EventListener
    public  void event(MyApplicationEvent2 event2){

        System.err.println(event2.getName());
    }
}
