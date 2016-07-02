package com.company.restaurant.model;

import java.util.Set;

/**
 * Created by Yevhen on 03.07.2016.
 */
public class CookAndWaiter extends Employee {
    private CookProperty cookProperty = new CookProperty();
    private WaiterProperty waiterProperty = new WaiterProperty();

    public CookProperty getCookProperty() {
        return cookProperty;
    }

    public WaiterProperty getWaiterProperty() {
        return waiterProperty;
    }

    public Set<CookedCourse> getCookedCourses() {
        return cookProperty.getCookedCourses();
    }

    public void setCookedCourses(Set<CookedCourse> cookedCourses) {
        cookProperty.setCookedCourses(cookedCourses);
    }

    public Set<Order> getOrders() {
        return waiterProperty.getOrders();
    }

    public void setOrders(Set<Order> orders) {
        waiterProperty.setOrders(orders);
    }
}
