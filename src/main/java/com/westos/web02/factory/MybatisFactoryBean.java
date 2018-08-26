package com.westos.web02.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/8/24.
 */
public class MybatisFactoryBean implements FactoryBean<SqlSessionFactory> {
    private String resource;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {

        SqlSessionFactory sqlSessionFactory=null;
        try{
            InputStream in = Resources.getResourceAsStream(resource);
            //初始化sqlSession
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
