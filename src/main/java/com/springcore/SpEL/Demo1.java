package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Demo1 {
    public static int x = 5;
    public int y;

    public Demo1() {
    }

    public Demo1(int y) {
        this.y=y;
    }

    public static String meth1(){
        return "Hi, I'm static method of Demo1 class :)";
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "y=" + y +
                '}';
    }
}
