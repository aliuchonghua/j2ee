package com.westos.web02.util;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Client3 {
    public static void main(String[] args){
        ExpressionParser parser = new SpelExpressionParser();

        Map context=new HashMap<>();

        context.put("name","你好");
        String str="'hello'+#root.get('name')";
        String strb="'HELLO,'+#data.get('name')";
        StandardEvaluationContext contextb = new StandardEvaluationContext();
        contextb.setVariable("data",context);
        String result = (String) parser.parseExpression(str).getValue(context);
        String result2 = (String) parser.parseExpression(strb).getValue(contextb);
        System.out.println(result);
        System.out.println(result2);
    }
}
