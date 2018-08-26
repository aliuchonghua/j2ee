package com.westos.web02.util;

import com.westos.web02.bean.Student;
import com.westos.web02.bean.Teacher;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Client {
    public static void main(String[] args){
        Student stu = SpringUtil.getInstance().getContext().getBean("stu",Student.class);
        System.out.println(stu.hashCode());
        Student stu2 = SpringUtil.getInstance().getContext().getBean("stu",Student.class);
        System.out.println(stu2.hashCode());
        Teacher teacher=SpringUtil.getInstance().getContext().getBean("teacher",Teacher.class);
        Teacher teacher3=SpringUtil.getInstance().getContext().getBean("teacher",Teacher.class);
        Teacher teacher4=SpringUtil.getInstance().getContext().getBean("teacher",Teacher.class);
        System.out.println(teacher.getStudent());
        System.out.println(teacher3);
        System.out.println(teacher4);
        Teacher teacher2=SpringUtil.getInstance().getContext().getBean("teacher2",Teacher.class);
        System.out.println(teacher2.getStudent());
    }
}
