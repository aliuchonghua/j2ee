package com.westos.web02.util;

import com.westos.web02.dao.HaohanDao;

import java.util.Map;


/**
 * Created by Administrator on 2018/8/25.
 */
public class Client5 {
    public static void main(String[] args){
        Map mymap= SpringUtil.getInstance().getContext().getBean("mymap", Map.class);
        System.out.println(mymap);
        MyAware myaware = SpringUtil.getInstance().getContext().getBean("myaware", MyAware.class);
        System.out.println(myaware.getContext().getBean("mymap"));
        HaohanDao dao = SpringUtil.getInstance().getContext().getBean("haohandao", HaohanDao.class);
        System.out.println(dao.listNews());

        HaohanDao dao2 = SpringUtil.getInstance().getContext().getBean("haohanDao", HaohanDao.class);
        System.out.println(dao2.listNews());
        Map<String, HaohanDao> amap = SpringUtil.getInstance().getContext().getBeansOfType(HaohanDao.class);
        for(String key:amap.keySet()){
            System.out.println(key);
        }
    }
}
