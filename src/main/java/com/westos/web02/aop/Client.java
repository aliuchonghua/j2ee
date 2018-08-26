package com.westos.web02.aop;

import com.westos.web02.util.SpringUtil;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/8/25.
 */
public class Client {

    public static void main(String[] args){
        HelloInterface realsubject=new HelloInterfaceImpl();
        PointCutInterface myPointCut= SpringUtil.getInstance().getContext().getBean(PointCutInterface.class);
        HelloInterface proxy=(HelloInterface) Proxy.newProxyInstance(realsubject.getClass().getClassLoader(),
                new Class[]{HelloInterface.class},
                new ProxyHello(realsubject,new MyAdvice(),myPointCut));

        proxy.sayHello();

        proxy.sayHi();
    }
}
