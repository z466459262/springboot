package com.zwz.d.enable.defaultenable;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhouwenzhe on 16/12/17.
 */
@Component
public class Runner {

    @Async
     public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("========"+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
