package com.springcore.constructorinj;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private Address address;

    public Student(int studentId, String studentName, String studentEmail, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", address=" + address +
                '}';
    }
}
