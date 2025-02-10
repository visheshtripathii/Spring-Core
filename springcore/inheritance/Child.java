package com.springcore.inheritance;

public class Child extends Parent{
    String onlyForChild;

    public String getOnlyForChild() {
        return onlyForChild;
    }

    public void setOnlyForChild(String onlyForChild) {
        System.out.println("Using setter method of Child");
        this.onlyForChild = onlyForChild;
    }

    @Override
    public String toString() {
        return "Child{" +
                "onlyForChild='" + onlyForChild + '\'' +
                ", commonData='" + commonData + '\'' +
                '}';
    }


}
