package com.springcore.noXmlFile.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee emp = context.getBean("getEmployee", Employee.class);
        System.out.println(emp);

        String line = emp.doWork();
        System.out.println(line);
    }
}
