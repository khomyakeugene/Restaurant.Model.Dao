package com.company.restaurant.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Yevhen on 23.05.2016.
 */
public class CookedCourseView extends FloatLinkObject implements Serializable {
    private Timestamp cookDatetime;
    private int courseCategoryId;
    private String courseName;
    private Float courseWeight;
    private Float courseCost;
    private int employeeJobPositionId;
    private String employeeFirstName;
    private String employeeSecondName;
    private String employeePhoneNumber;
    private Float employeeSalary;

    public int getCourseId() {
        return getFirstId();
    }

    public void setCourseId(int courseId) {
        setFirstId(courseId);
    }

    public int getEmployeeId() {
        return getSecondId();
    }

    public void setEmployeeId(int employeeId) {
        setSecondId(employeeId);
    }

    public Float getCookWeight() {
        return getFloatLinkData();
    }

    public void setCookWeight(Float cookWeight) {
        setFloatLinkData(cookWeight);
    }

    public Timestamp getCookDatetime() {
        return cookDatetime;
    }

    public void setCookDatetime(Timestamp cookDatetime) {
        this.cookDatetime = cookDatetime;
    }

    public int getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(int courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Float getCourseWeight() {
        return courseWeight;
    }

    public void setCourseWeight(Float courseWeight) {
        this.courseWeight = courseWeight;
    }

    public Float getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Float courseCost) {
        this.courseCost = courseCost;
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
}

