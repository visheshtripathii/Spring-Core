package com.springcore.noXmlFile.beanAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
    @Value("10")
    private int id;

    @Value("Erling Haaland")
    private String name;

    public String doWork(){
        return "Employee is building a Spring application";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
