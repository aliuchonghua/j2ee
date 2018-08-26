package com.westos.web02.aop;

import com.alibaba.druid.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by Administrator on 2018/8/25.
 */
public class ProxyHello implements InvocationHandler {
    private Object realsubject;  //真实对象
    private AdviceInterface adviceInterface; //通知对象
    private PointCutInterface pointCutInterface; //在哪个方法中执行

    public ProxyHello(Object realsubject,AdviceInterface adviceInterface,PointCutInterface pointCutInterface){
        this.realsubject=realsubject;
        this.adviceInterface=adviceInterface;
        this.pointCutInterface=pointCutInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(pointCutInterface.canProxy(method)){
            this.adviceInterface.before(proxy,method,args);
        }
        Object result = method.invoke(realsubject, args);
        if(pointCutInterface.canProxy(method)){
            this.adviceInterface.after(proxy,method,args);
        }

        return result;
    }
}
