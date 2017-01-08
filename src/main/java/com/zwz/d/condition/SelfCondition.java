package com.zwz.d.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * 自定义条件注入的判断条件类
 */
@Component
public class SelfCondition implements Condition {
    @Override public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding!=null){
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }
}
