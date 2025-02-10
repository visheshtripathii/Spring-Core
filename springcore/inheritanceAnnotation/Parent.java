package com.springcore.inheritanceAnnotation;

import org.springframework.beans.factory.annotation.Value;
/*
 No need to declare @Component on this class because it's object will be automatically created when Child's object is getting created.
when you create an object of the Child class, the Parent class object is created as part of the initialization because the child class
inherits from the parent class, and Java ensures the parent class is properly initialized before the child class.
 */
public class Parent {
    @Value("102")
    int parenId;
    @Value("Father")
    String parentName;

    public Parent() {
        System.out.println("Parent class default constructor called");
    }
    void doWork(){
        System.out.println("Work done by parent");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parenId=" + parenId +
                ", parentName='" + parentName + '\'' +
                '}';
    }
}
