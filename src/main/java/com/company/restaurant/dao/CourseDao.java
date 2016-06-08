package com.company.restaurant.dao;

import com.company.restaurant.model.Course;

import java.util.List;

/**
 * Created by Yevhen on 19.05.2016.
 */
public interface CourseDao {
    Course addCourse(Course course);

    String delCourse(Course course);

    String delCourse(String name);

    Course findCourseByName(String name);

    Course findCourseById(int courseId);

    List<Course> findAllCourses();

}
