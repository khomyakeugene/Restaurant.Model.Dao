package com.company.restaurant.dao;

import com.company.restaurant.model.Course;
import com.company.restaurant.model.Menu;

import java.util.List;
import java.util.Set;

/**
 * Created by Yevhen on 20.05.2016.
 */
public interface MenuDao {
    Menu addMenu(String name);

    void delMenu(String name);

    void delMenu(Menu menu);

    Menu findMenuByName(String name);

    Menu findMenuById(int menuId);

    List<Menu> findAllMenus();

    void addCourseToMenu(Menu menu, Course course);

    void delCourseFromMenu(Menu menu, Course course);

    Set<Course> findMenuCourses(Menu menu);

    Course findMenuCourseByCourseId(Menu menu, int courseId);
}
