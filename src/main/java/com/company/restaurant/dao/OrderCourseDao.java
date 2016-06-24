package com.company.restaurant.dao;

import com.company.restaurant.model.Course;
import com.company.restaurant.model.Order;

import java.util.List;

/**
 * Created by Yevhen on 13.06.2016.
 */
public interface OrderCourseDao {
    void addCourseToOrder(Order order, Course course);

    void takeCourseFromOrder(Order order, Course course);

    List<Course> findAllOrderCourses(Order order);

    Course findOrderCourseByCourseId(Order order, int courseId);
}
