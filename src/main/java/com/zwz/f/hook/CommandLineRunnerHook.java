package com.zwz.f.hook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by zhouwenzhe on 16/12/18.
 */
@Component
public class CommandLineRunnerHook implements CommandLineRunner,Ordered {
    @Override public void run(String... args) throws Exception {
        System.err.println("CommandLineRunnerHook called,args="+ Arrays.toString(args));
    }

    @Override public int getOrder() {
        return 0;
    }
}
