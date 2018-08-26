package com.westos.web02.springaop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * spring aop的实现
 * Created by Administrator on 2018/8/26.
 */
public class HelloAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法执行后3");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法执行前3");
    }
}
