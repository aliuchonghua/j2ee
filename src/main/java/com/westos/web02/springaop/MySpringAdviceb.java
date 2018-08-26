package com.westos.web02.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Administrator on 2018/8/26.
 */
@Aspect
public class MySpringAdviceb {
    @Before("execution(* com.westos.web02.aop.HelloInterface.say*(..))")
    private void doBefore(JoinPoint joinPoint){
        System.out.println("方法执行前666");
    }

    @After("execution(* com.westos.web02.aop.HelloInterface.say*(..))")
    private void doAfter(JoinPoint joinPoint){
        System.out.println("方法执行后555");
    }

    private Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行时555");
        Object result=joinPoint.proceed(joinPoint.getArgs());
        return result;
    }
}
