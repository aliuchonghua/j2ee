package com.westos.web02.factory;

import com.westos.web02.dao.HaohanDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.config.AbstractFactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/25.
 */
public class MapperFactoryBean<T> extends AbstractFactoryBean<T> {
    private SqlSessionFactory sqlsessionFactory;
    private Class<T> targetMapClass;

    public void setTargetMapClass(Class<T> targetMapClass) {
        this.targetMapClass = targetMapClass;
    }

    public void setSqlsessionFactory(SqlSessionFactory sqlsessionFactory) {
        this.sqlsessionFactory = sqlsessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return targetMapClass;
    }

    @Override
    protected T createInstance() throws Exception {
        SqlSession sqlsession = sqlsessionFactory.openSession();
        T dao = sqlsession.getMapper(targetMapClass);
        //使用代理模式
        T result = (T)Proxy.newProxyInstance(dao.getClass().getClassLoader(), new Class[]{targetMapClass},
                new Mydaili(dao, sqlsession));
        return result;
    }

    private  class Mydaili implements InvocationHandler{

        private Object realobj;
        private SqlSession sqlSession;

        public Mydaili(Object realobj,SqlSession sqlSession){
            this.realobj=realobj;
            this.sqlSession=sqlSession;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(realobj, args);
            //事务提交的问题
            //关闭sqlsession
            sqlSession.close();
            return result;
        }
    }
}
