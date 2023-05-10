package com.codegym.service;

import com.codegym.model.Order;
import com.codegym.model.OrderItem;
import com.codegym.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderItemServiceInFile implements IOrderItemService {
    private final String path = "./data/orderitem.csv";
    public List<OrderItem> findAllOrderItems(){
        return FileUtils.readFile(path, OrderItem.class);
    }
    public List<OrderItem> findAllOrderItemsByOrderId(long idOrder){
        List<OrderItem> list = findAllOrderItems();

        List<OrderItem> result = new ArrayList<>();
        for (OrderItem item : list) {
            if (item.getIdOrder() == idOrder) {
                result.add(item);
            }
        }
        return result;
    }


    public void saveOrderItemByOrder(Order order) {
        List<OrderItem> orderItems = findAllOrderItems();
        orderItems.addAll(order.getOrderItems());

        FileUtils.writeFile(path, orderItems);
    }
}
