package com.westos.web02.springaop;

import com.westos.web02.aop.HelloInterface;
import com.westos.web02.util.SpringUtil;

/**
 * Created by Administrator on 2018/8/26.
 */
public class Client {

    public static void main(String[] args){
        HelloInterface helloInterface = (HelloInterface) SpringUtil.getInstance().getBean("helloInterface");
        helloInterface.sayHello();
        helloInterface.sayHi();
    }
}
