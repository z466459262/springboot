package com.zwz.d.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 使用默认的条件注解进行按需装载
 */
@Configuration
public class ConditionalConfiguration {

    /**
     * 在配置中有个配置名叫dcondition.defaultproperties.a,值是true,才装配
     */
    @Bean
    @ConditionalOnProperty(name="dcondition.defaultproperties.a",havingValue = "true")
    public Runnable conditionalOnProperty(){
        return ()->{
            System.out.println(" createRunnable ");
        };
    }

    /**
     * 如果有这个class 才装配
     */
    @Bean
    @ConditionalOnClass(name= "com.zwz.d.condition.ConditionalConfiguration")
    public Runnable conditionalOnClass(){
        return ()->{};
    }

    /**
     * 装载dconditionCBean,为dconditionC提供装载条件
     */
    @Bean
    public Runnable dconditionCBean(){
        return ()->{};
    }
    /**
     * 如果容器中有dconditionCBean就装配, 注意，这个注解要等dconditionCBean加载完才有效，
     * 如果把上面这个挪到此方法下面就会失效
     */
    @Bean
    @ConditionalOnBean(name="dconditionCBean")
    public Runnable conditionalOnBean(){
        return ()->{};
    }



    @Bean
    @Conditional(SelfCondition.class)
    public Runnable dconditionSelfBean(){
        return ()->{};
    }


}
