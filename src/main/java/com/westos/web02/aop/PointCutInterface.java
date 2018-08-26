package com.westos.web02.aop;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/8/25.
 */
public interface PointCutInterface {
    //用于检查我们的方法是否需要执行动态代理
    boolean canProxy(Method method);
}
