package com.westos.web02.aop;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2018/8/25.
 */
public class MyPointCut implements PointCutInterface {
    //需要执行动态代理的方法名单，凡是在该名单内的方法均执行动态代理
    private List<String> methodlist;

    public List<String> getMethodlist() {
        return methodlist;
    }

    public void setMethodlist(List<String> methodlist) {
        this.methodlist = methodlist;
    }

    @Override
    public boolean canProxy(Method method) {
        String methodname=method.getName();
        methodname=method.getDeclaringClass().getName()+"."+methodname;
        return methodlist.contains(methodname);
    }
}
