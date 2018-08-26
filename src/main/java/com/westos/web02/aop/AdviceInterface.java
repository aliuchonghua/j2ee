package com.westos.web02.aop;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/8/25.
 */
public interface AdviceInterface {
    void before(Object proxy, Method method, Object[] args);
    void after(Object proxy, Method method, Object[] args);

}
