package com.codegym.views;

import com.codegym.model.ERole;
import com.codegym.model.Order;
import com.codegym.model.OrderItem;
import com.codegym.model.Product;
import com.codegym.service.*;
import com.codegym.utils.AppUtils;
import com.codegym.utils.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    private Scanner scanner = new Scanner(System.in);
    private IOrderService oderServiceInFile;
    private IProductService productService;

    public OrderView() {
        oderServiceInFile = new OderServiceInFile();
        productService = new ProductServiceInMemory();
    }



    public void launcher() {
        do{
            AppUtils.menuOrderView(ERole.ADMIN);
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showOrders(oderServiceInFile.findAllOrder());
                    break;
                case 3:
                    showOrderDetail();
                    break;
                case 2:
                    createOrder();
                    break;
            }
        }while (true);

    }

    private void createOrder() {
        Order order = new Order();
        order.setIdOrder(System.currentTimeMillis() / 1000);

        boolean checkContinueAddOrderItem = false;
        do {
            Product product = inputIdProduct();
            System.out.println("Nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            if (order.getOrderItems() == null) {
                List<OrderItem> orderItems = new ArrayList<>();
                //OrderItem(long idOrderItem, long idOrder, long idProduct, int quantity, float price
                OrderItem orderItem = new OrderItem(System.currentTimeMillis() % 1000,
                        order.getIdOrder(), product.getId(), quantity, product.getPrice());
                orderItems.add(orderItem);

                order.setOrderItems(orderItems);
            }else{
                if (checkProductExistOrder(order, product)) { // san pham da co trong order
                    for(OrderItem orderItem : order.getOrderItems()){
                        if (orderItem.getIdProduct() == product.getId()) {
                            orderItem.setQuantity(quantity);
                        }
                    }
                }else{
                    OrderItem orderItem = new OrderItem(System.currentTimeMillis() % 1000,
                            order.getIdOrder(), product.getId(), quantity, product.getPrice());
                    order.getOrderItems().add(orderItem);
                }
            }
            System.out.println("Bạn có muốn thêm sản phẩm không");
            System.out.println("Nhập 1: Yes");
            System.out.println("Nhập 2: No");
            int actionAddOrderItem = Integer.parseInt(scanner.nextLine());
            switch (actionAddOrderItem) {
                case 1:
                    checkContinueAddOrderItem = true;
                    break;
                case 2:
                    checkContinueAddOrderItem = false;
                    break;
            }
        } while (checkContinueAddOrderItem);


        order.updateTotal();
        System.out.println("Nhập thông tin khách hàng: ");
        String fullName = scanner.nextLine();
        order.setFullName(fullName);
        order.setCreateAt(new Date());

        oderServiceInFile.createOrder(order);

        System.out.println("Tao order thanh cong");

    }

    private boolean checkProductExistOrder(Order order, Product product) {
        if (order.getOrderItems() == null) {
            return false;
        }else{
            for (OrderItem orderItem : order.getOrderItems()) {
                if (orderItem.getIdProduct() == product.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    private Product inputIdProduct() {
        Product product = null;
        boolean checkEditProductValid = false;
        do{
            try {
                System.out.println("Nhập id san pham:");
                long idProduct = Long.parseLong(scanner.nextLine());
                product = productService.findProduct(idProduct);
                if (product == null) {
                    System.out.println("Id sản phẩm không hợp lệ");
                    System.out.println("Chọn 1. Nhập lại");
                    System.out.println("Chọn 2. Quay lại");
                    int actionEditId = Integer.parseInt(scanner.nextLine());
                    switch (actionEditId) {
                        case 1:
                            checkEditProductValid = true;
                            break;
                        case 2:
                            checkEditProductValid = false;
                            break;
                    }
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Id không đúng định dạng vui lòng nhập lại");
                checkEditProductValid = true;
            }

        }while (checkEditProductValid);

        return product;
    }


    private void showOrderDetail() {
        System.out.println("Nhập mã hóa đơn cần xem:");
        long idOrder = Long.parseLong(scanner.nextLine());
        Order order = oderServiceInFile.findOrder(idOrder);
        if (order != null) {
            System.out.printf("%-10s | %-20s\n", order.getIdOrder(), order.getFullName());
            System.out.printf("%-10s | %-20s\n", "Tổng tiền" , order.getTotal());


            for (OrderItem orderItem : order.getOrderItems()) {
                Product p = productService.findProduct(orderItem.getIdProduct());
                System.out.printf("%-10s  %-10s %-10s\n", p.getName(), orderItem.getQuantity(), orderItem.getPrice());
            }

        }else{
            System.out.println("Không tìm thấy order");
        }
    }

    private void showOrders(List<Order> allOrder) {
        System.out.printf("%-10s | %-20s | %-20s | %-20s\n", "ID", "FULL NAME", "PRICE", "CREATE AT");
        for (Order order : allOrder) {
            System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                    order.getIdOrder(), order.getFullName(), order.getTotal(), DateUtils.format(order.getCreateAt()));
        }
    }
}
