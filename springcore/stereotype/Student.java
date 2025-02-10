package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
    @Value("101")
    private int studentId;
    @Value("Vishesh Tripathi")
    private String studentName;
    @Value("Noida")
    private String studentCity;

    //Ioc container does not need getter and setters/ parameterized constructor to inject values into the fields
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getStudentCity() {
//        return studentCity;
//    }
//
//    public void setStudentCity(String studentCity) {
//        this.studentCity = studentCity;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
