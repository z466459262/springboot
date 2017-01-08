package com.zwz.e.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhouwenzhe on 16/12/17.
 */
public class MyApplicationEvent2 extends ApplicationEvent {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyApplicationEvent2(Object source, String name) {
        super(source);
        this.name=name;
    }
}
