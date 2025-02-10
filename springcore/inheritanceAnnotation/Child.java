package com.springcore.inheritanceAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Child extends Parent{
    @Value("101")
    int childId;
    @Value("Son")
    String childName;

    public Child() {
        System.out.println("Child class default constructor called");
    }

    @Override
    public void doWork(){
        super.doWork();
        System.out.println("Work done by Child");
    }

    public void doMoreWork(){
        System.out.println("More work done by Parent");
    }

    @Override
    public String toString() {
        return "Child{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                ", parenId=" + parenId +
                ", parentName='" + parentName + '\'' +
                '}';
    }
}
