package com.zwz.e.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhouwenzhe on 16/12/17.
 */
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
