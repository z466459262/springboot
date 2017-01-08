package com.zwz.f.hook;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by zhouwenzhe on 16/12/18.
 */
public class ApplicationInitHook implements ApplicationContextInitializer {
    @Override public void initialize(ConfigurableApplicationContext a) {
        System.err.println(" ApplicationInit  called ");

    }
}
