package com.company.restaurant.model;

import java.util.List;

/**
 * Created by Yevhen on 30.06.2016.
 */
public class Waiter extends Employee {
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
