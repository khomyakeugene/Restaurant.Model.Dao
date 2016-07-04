package com.company.restaurant.model;

/**
 * Created by Yevhen on 04.07.2016.
 */
public class CourseIngredient {
    private Course course = new Course();
    private Ingredient ingredient = new Ingredient();
    private Portion portion = new Portion();
    private Float amount;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
