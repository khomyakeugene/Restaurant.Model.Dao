package com.company.restaurant.model;

/**
 * Created by Yevhen on 21.05.2016.
 */
public class MenuCourseView extends MenuCourse {
    private int courseCategoryId;
    private String courseName;
    private float courseWeight;
    private float courseCost;
    private String courseCategoryName;

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

    public float getCourseWeight() {
        return courseWeight;
    }

    public void setCourseWeight(float courseWeight) {
        this.courseWeight = courseWeight;
    }

    public float getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(float courseCost) {
        this.courseCost = courseCost;
    }

    public String getCourseCategoryName() {
        return courseCategoryName;
    }

    public void setCourseCategoryName(String courseCategoryName) {
        this.courseCategoryName = courseCategoryName;
    }
}
