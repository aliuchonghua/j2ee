package com.westos.web02.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Teacher {
    private String name;
    @Autowired
    //@Qualifier("stu")
    //@Resource(name = "stu")
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void init(){
        System.out.println("Teacher的初始化,"+this.getName());
    }
}
