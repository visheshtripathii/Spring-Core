package com.springcore.inheritance;

public class Parent {
    String commonData;

    public String getCommonData() {
        return commonData;
    }

    public void setCommonData(String commonData) {
        System.out.println("Using setter method of Parent");
        this.commonData = commonData;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "commonData='" + commonData + '\'' +
                '}';
    }
}
