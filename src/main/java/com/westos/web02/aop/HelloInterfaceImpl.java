package com.westos.web02.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/25.
 */

public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("sayHello:hello");
    }

    @Override
    @Deprecated
    public void sayHi() {
        System.out.println("sayHi:hi");
    }


}
