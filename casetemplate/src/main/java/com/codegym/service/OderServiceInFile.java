package com.codegym.service;

import com.codegym.model.Order;
import com.codegym.model.OrderItem;
import com.codegym.utils.FileUtils;

import java.util.List;

public class OderServiceInFile implements IOrderService {
    private final String path = "./data/order.csv";
    private IOrderItemService orderItemServiceInFile;
    public OderServiceInFile() {
        orderItemServiceInFile = new OrderItemServiceInFile();
    }
    public List<Order> findAllOrder() {
        List<Order> orders = FileUtils.readFile(path, Order.class);
        for (Order order : orders) {
            List<OrderItem> orderItems = orderItemServiceInFile.findAllOrderItemsByOrderId(order.getIdOrder());
            order.setOrderItems(orderItems);
        }
        return orders;
    }

    public void createOrder(Order order) {
        List<Order> orders = findAllOrder();

        orderItemServiceInFile.saveOrderItemByOrder(order);
        orders.add(order);
        FileUtils.writeFile(path, orders);
    }

    public Order findOrder(long idOrder) {
        List<Order> list = findAllOrder();
        for (Order order : list) {
            if (order.getIdOrder() == idOrder) {
                return order;
            }
        }
        return null;
    }
}
