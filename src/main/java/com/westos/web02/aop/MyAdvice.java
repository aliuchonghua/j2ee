package com.westos.web02.aop;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/8/25.
 */
public class MyAdvice implements AdviceInterface {
    @Override
    public void before(Object proxy, Method method, Object[] args) {
        System.out.println("方法执行前111");
    }

    @Override
    public void after(Object proxy, Method method, Object[] args) {
        System.out.println("方法执行后111");
    }
}
