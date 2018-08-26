package com.westos.web02.factory;

import com.westos.web02.bean.Student;

/**
 * Created by Administrator on 2018/8/24.
 */
public class StudentFactory {

    public static Student create(){
        return new Student();
    }
}
