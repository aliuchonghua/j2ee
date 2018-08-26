package com.westos.web02.dao;

import com.westos.web02.bean.News;
import com.westos.web02.bean.Subject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/8/19.
 */
@Repository
public interface HaohanDao {

    //查询所有新闻
    List<News> listNews();
    //查询所有新闻类别
    List<Subject> listSubjects();
}
