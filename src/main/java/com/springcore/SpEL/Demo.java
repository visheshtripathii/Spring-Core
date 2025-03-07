package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{101+4}") // parsing basic expression and Arithmetic operator
    private int var1;

    @Value(" #{ T(java.lang.Math).sqrt(25) } ") // invoking static method sqrt() of java.long.Math class.
    private double var2;

    @Value(" #{T(com.springcore.SpEL.Demo1).meth1()} ")  //invoking static method meth1() of com.springcore.SpEL.Demo1 class
    private String var3;

    @Value(" #{T(java.lang.Math).PI} ") // invoking a static variable PI of java.lang.Math class
    private double var4;

    @Value(" #{T(com.springcore.SpEL.Demo1).x} ") // invoking a static variable x of com.springcore.SpEL.Demo1 class
    private int var5;

    @Value(" #{ new java.lang.String('Vishesh') }")
    private String var6;

    //@Value(" #{ new com.springcore.SpEL.Demo1(25) } ")
    private Demo1 var7;

    @Value(" #{ 10-2 > 6 } ")
    private boolean var8;

    @Override
    public String toString() {
        return "Demo{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                ", var3='" + var3 + '\'' +
                ", var4=" + var4 +
                ", var5=" + var5 +
                ", var6='" + var6 + '\'' +
                ", var7=" + var7 +
                ", var8=" + var8 +
                '}';
    }
}
