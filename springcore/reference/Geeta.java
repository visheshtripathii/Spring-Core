package com.springcore.reference;

public class Geeta {
    private int age;

    public void doWork(){
        System.out.println("Geeta is doing work......");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Geeta{" +
                "age=" + age +
                '}';
    }
}
