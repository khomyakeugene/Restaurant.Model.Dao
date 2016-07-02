package com.company.restaurant.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yevhen on 02.07.2016.
 */
public class CookProperty {
    private Set<CookedCourse> courses = new HashSet<>();

    public Set<CookedCourse> getCourses() {
        return courses;
    }

    public void setCourses(Set<CookedCourse> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CookProperty{" +
                "courses=" + courses +
                '}';
    }
}
