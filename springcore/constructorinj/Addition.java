package com.springcore.constructorinj;

public class Addition {
    int a;
    int b;

    public Addition(double a, double b){
        System.out.println("double,double");
        this.a= (int) a;
        this.b= (int )b;
    }

    public Addition(int a, int b){
        System.out.println("int,int");
        this.a=a;
        this.b=b;
    }

    public Addition(String a, String b){
        System.out.println("String,String");
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
    }


    public int doSum(){
        System.out.println("doing sum : ");
        return this.a+this.b;
    }


}
