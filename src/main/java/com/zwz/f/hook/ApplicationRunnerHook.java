package com.zwz.f.hook;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhouwenzhe on 16/12/18.
 * 和CommandLineRunner作用相同，但对象是ApplicationArguments，好处是如在启动参数中写了--javaargs.a=127.0.0.1
 * 那么可以args.getOptionValues("tomcat.host") 拿到值
 */
@Component
public class ApplicationRunnerHook implements ApplicationRunner,Ordered {
    @Override public void run(ApplicationArguments args) throws Exception {

        List<String> optionValues = args.getOptionValues("javaargs.a");
        System.err.println("ApplicationRunnerHook called , values:"+optionValues);
    }

    @Override public int getOrder() {
        return 2;
    }
}
