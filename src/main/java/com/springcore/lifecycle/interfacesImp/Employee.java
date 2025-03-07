package com.springcore.lifecycle.interfacesImp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
    private int employeeID;
    private String employeeName;

    @Override
    public void afterPropertiesSet() {
        System.out.println("Initialization code : Creating connection with the database..");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying connection with the database..");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        System.out.println("Setting employee id");
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        System.out.println("Setting employee name");
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
