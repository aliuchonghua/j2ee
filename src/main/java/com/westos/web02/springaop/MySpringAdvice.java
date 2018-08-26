package com.westos.web02.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2018/8/26.
 */
public class MySpringAdvice {
    private void doBefore(JoinPoint joinPoint){
        System.out.println("方法执行前555");
    }

    private void doAfter(JoinPoint joinPoint){
        System.out.println("方法执行后555");
    }

    private Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行时555");
        Object result=joinPoint.proceed(joinPoint.getArgs());
        return result;
    }
}
