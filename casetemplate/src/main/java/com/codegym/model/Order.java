package com.codegym.model;

import com.codegym.utils.DateUtils;

import java.util.Date;
import java.util.List;

public class Order implements IModel<Order>{
    private long idOrder;
    private String fullName;
    private Date createAt;
    private float total;

    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        //1683514082,Nguyên,10-05-2023 10:40,200000
        return String.format("%s,%s,%s,%s", this.idOrder, this.fullName, DateUtils.format(this.createAt), this.total);
    }

    public Order() {

    }

    public Order(long idOrder, String fullName, Date createAt, float total) {
        this.idOrder = idOrder;
        this.fullName = fullName;
        this.createAt = createAt;
        this.total = total;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void updateTotal() {
        this.total = 0;
        for (OrderItem orderItem : orderItems) {
            this.total += orderItem.getPrice() * orderItem.getQuantity();
        }
    }
    @Override
    public void parseData(String line) {
        //1683514081,Quang,08-05-2023 10:40,100000
        String[] items = line.split(",");
        this.idOrder = Long.parseLong(items[0]);
        this.fullName = items[1];
        this.createAt = DateUtils.parse(items[2]);
        this.total = Float.parseFloat(items[3]);
    }
}
