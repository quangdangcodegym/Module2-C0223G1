package com.codegym.service;

import com.codegym.model.Order;
import com.codegym.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> findAllOrderItems();
    List<OrderItem> findAllOrderItemsByOrderId(long idOrder);
    void saveOrderItemByOrder(Order order);
}
