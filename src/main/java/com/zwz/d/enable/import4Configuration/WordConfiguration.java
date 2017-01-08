package com.zwz.d.enable.import4Configuration;

import com.zwz.d.enable.A;
import com.zwz.d.enable.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhouwenzhe on 16/12/25.
 */
@Configuration
public class WordConfiguration {

    @Bean
    @ConditionalOnClass
    public A a(){
        return new A();
    }

    @Bean
    @ConditionalOnClass
    public B b(){
        return new B();
    }
}
