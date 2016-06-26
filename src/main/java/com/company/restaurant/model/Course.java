package com.company.restaurant.model;

/**
 * Created by Yevhen on 19.05.2016.
 */
public class Course {
    private int courseId;
    private String name;
    private Float weight;
    private Float cost;
    private CourseCategory courseCategory = new CourseCategory();

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public CourseCategory getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(CourseCategory courseCategory) {
        this.courseCategory = courseCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        return courseId == course.courseId && (name != null ?
                name.equals(course.name) : course.name == null && (weight != null ?
                weight.equals(course.weight) : course.weight == null && (cost != null ?
                cost.equals(course.cost) : course.cost == null && (courseCategory != null ?
                courseCategory.equals(course.courseCategory) : course.courseCategory == null))));

    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (courseCategory != null ? courseCategory.hashCode() : 0);
        return result;
    }
}
