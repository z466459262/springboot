package com.zwz.h.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by zhouwenzhe on 17/1/8.
 */

@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.zwz.h.aop..*.*(..))")
    public void a(){

        System.err.println(" i am doing aspect logic...");
    }


    @After("execution(* com.zwz.h.aop..*.*(..))")
    public void logAfter(JoinPoint point){

        System.err.println("after method log done" + point.getTarget().getClass() + ",args=" + Arrays.asList(point.getArgs())+ ",method="+point.getSignature().getName());
    }
}
