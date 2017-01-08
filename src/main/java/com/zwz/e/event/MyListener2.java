package com.zwz.e.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by zhouwenzhe on 16/12/17.
 */

public class MyListener2 implements ApplicationListener<MyApplicationEvent> {

    @Override public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.err.println("2222222222222222222");

    }
}
