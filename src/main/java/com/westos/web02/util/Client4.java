package com.westos.web02.util;

import com.westos.web02.bean.Student;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Client4 {
    public static void main(String[] args){
        ExpressionParser parser = new SpelExpressionParser();
        String strel="";
        strel="'Hello World'+(1+2)";
        String result=(String)parser.parseExpression(strel).getValue();
        System.out.println(result);

        strel="#stu.xuhao"; //访问对象的属性
        strel="#stu.aihao[0]"; //访问对象属性中的列表

        EvaluationContext context=new StandardEvaluationContext();
        context.setVariable("stu",SpringUtil.getInstance().getBean("stu"));
        result=(String)parser.parseExpression(strel).getValue(context);
        System.out.println(result);
        strel="#stu.chengji[english]"; //访问对象属性中的map
        System.out.println(parser.parseExpression(strel).getValue(context));
        strel="{1,2,3,4}"; //访问对象属性中的map
        System.out.println(parser.parseExpression(strel).getValue(context));

        Object bean = parser.parseExpression("#stu").getValue(SpringUtil.getInstance().getContext().getBeansOfType(Student.class));
        System.out.println(bean);
    }
}
