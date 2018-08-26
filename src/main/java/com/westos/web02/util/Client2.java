package com.westos.web02.util;

import com.westos.web02.bean.Student;
import com.westos.web02.bean.Teacher;
import com.westos.web02.dao.HaohanDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Client2 {

    public static void main(String[] args){
        //单例和多例的演示
        Teacher teacher2 = SpringUtil.getInstance().getContext().getBean("teacher2", Teacher.class);
        Teacher teacher21 = SpringUtil.getInstance().getContext().getBean("teacher2", Teacher.class);
        Teacher teacher3 = SpringUtil.getInstance().getContext().getBean("teacher3", Teacher.class);
        Teacher teacher31 = SpringUtil.getInstance().getContext().getBean("teacher3", Teacher.class);
        Student stu4 = SpringUtil.getInstance().getContext().getBean("stu4", Student.class);
        Student stu5 = SpringUtil.getInstance().getContext().getBean("stu5", Student.class);
        System.out.println("teacher2:"+teacher2);
        System.out.println("teacher21:"+teacher21);
        System.out.println("teacher3:"+teacher3);
        System.out.println("teacher31:"+teacher31);
        System.out.println("stu4:"+stu4);
        System.out.println("stu5:"+stu5);
        SqlSessionFactory sqlsessionFactory = SpringUtil.getInstance().getContext().getBean(SqlSessionFactory.class);
        SqlSession sqlsession = sqlsessionFactory.openSession();
        HaohanDao dao = sqlsession.getMapper(HaohanDao.class);
        System.out.println(dao.listNews());
        sqlsession.close();
    }
}
