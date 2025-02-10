package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo = (Demo) context.getBean("demo");
        System.out.println(demo);

        System.out.println("********************************************************");

        SpelExpressionParser spel = new SpelExpressionParser();
        Expression expression = spel.parseExpression("20+5");
        System.out.println(expression.getValue());

    }
}
