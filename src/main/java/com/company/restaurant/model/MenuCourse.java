package com.company.restaurant.model;

/**
 * Created by Yevhen on 11.06.2016.
 */
public class MenuCourse extends IntegerLinkObject {
    public int getMenuId() {
        return getFirstId();
    }

    public void setMenuId(int orderId) {
        setFirstId(orderId);
    }

    public int getCourseId() {
        return getSecondId();
    }

    public void setCourseId(int courseId) {
        setSecondId(courseId);
    }

    public int getCourseNumber() {
        return getIntegerLinkData();
    }

    public void setCourseNumber(int courseNumber) {
        setIntegerLinkData(courseNumber);
    }
}
