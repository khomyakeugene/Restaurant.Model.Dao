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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Waiter)) return false;
        if (!super.equals(o)) return false;

        Waiter waiter = (Waiter) o;

        return orders != null ? orders.equals(waiter.orders) : waiter.orders == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                super.toString() + "\n" +
                "orders=\n" + orders + "\n" +
                '}';
    }
}
