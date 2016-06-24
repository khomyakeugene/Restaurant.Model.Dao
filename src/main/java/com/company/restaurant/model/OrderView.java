package com.company.restaurant.model;

/**
 * Created by Yevhen on 22.05.2016.
 */
public class OrderView extends Order {
    private String stateTypeName;
    private int employeeJobPositionId;
    private String employeeFirstName;
    private String employeeSecondName;
    private String employeePhoneNumber;
    private Float employeeSalary;
    private String employeeJobPositionName;
    private int tableNumber;
    private String tableDescription;

    public String getStateTypeName() {
        return stateTypeName;
    }

    public void setStateTypeName(String stateTypeName) {
        this.stateTypeName = stateTypeName;
    }

    public int getEmployeeJobPositionId() {
        return employeeJobPositionId;
    }

    public void setEmployeeJobPositionId(int employeeJobPositionId) {
        this.employeeJobPositionId = employeeJobPositionId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }

    public void setEmployeeSecondName(String employeeSecondName) {
        this.employeeSecondName = employeeSecondName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public Float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeJobPositionName() {
        return employeeJobPositionName;
    }

    public void setEmployeeJobPositionName(String employeeJobPositionName) {
        this.employeeJobPositionName = employeeJobPositionName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTableDescription() {
        return tableDescription;
    }

    public void setTableDescription(String tableDescription) {
        this.tableDescription = tableDescription;
    }
}
