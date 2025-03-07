package com.springcore.noXmlFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // inform IOC Container to make a bean of this java class.
public class Student {
    @Value("8") // Add value inside the field at runtime
    private int id;
    @Value("Cris")
    private String name;

    public void doCoding(){
        System.out.println("Student is learning Spring framework");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
