package com.springcore.lifecycle.annotationImpl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    @PostConstruct
    public void start(){
        System.out.println("Initialization code : creating a connection with the database");
    }

    @PreDestroy
    public void stop(){
        System.out.println("Clean-up code : Destroying connection with the database");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        System.out.println("Setting subject");
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
