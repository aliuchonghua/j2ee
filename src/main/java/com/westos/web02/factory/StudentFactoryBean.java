package com.westos.web02.factory;

import com.westos.web02.bean.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2018/8/24.
 */
public class StudentFactoryBean implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
