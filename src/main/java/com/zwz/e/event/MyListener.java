package com.zwz.e.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhouwenzhe on 16/12/17.
 * s
 */
@Component
public class MyListener implements ApplicationListener<MyApplicationEvent> {

    @Override public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.err.println(".................");

    }
}
