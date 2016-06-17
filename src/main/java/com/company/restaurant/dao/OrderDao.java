package com.company.restaurant.dao;

import com.company.restaurant.model.Order;

import java.util.List;

/**
 * Created by Yevhen on 13.06.2016.
 */
public interface OrderDao {
    String orderEntityName();

    Order addOrder(Order order);

    void delOrder(Order order);

    Order findOrderById(int orderId);

    List<Order> findOrderByNumber(String orderNumber);

    List<Order> findAllOrders();

    List<Order> findAllOrders(String stateType);

    Order updOrderState(Order order, String stateType);
}
