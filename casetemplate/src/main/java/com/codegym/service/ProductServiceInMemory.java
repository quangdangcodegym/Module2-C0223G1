package com.codegym.service;

import com.codegym.utils.DateUtils;
import com.codegym.model.Product;
import com.codegym.model.ECategory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceInMemory {

    private List<Product> products;

    public ProductServiceInMemory() {
        products = new ArrayList<>();
        // "08-05-2023 10:40" => Date: date

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
        products.add(new Product(System.currentTimeMillis()/1000, "Iphone 11", "dep lam 11",
                1000.0f, DateUtils.parse("08-05-2023 10:40"), ECategory.PHONE));

        products.add(new Product(System.currentTimeMillis()/1000, "Iphone 12", "dep lam 12",
                3000.0f, DateUtils.parse("15-05-2023 10:40"), ECategory.PHONE));
        products.add(new Product(System.currentTimeMillis()/1000, "Ipad 2", "dep lam Ipad 2",
                2000.0f, DateUtils.parse("10-05-2023 10:40"), ECategory.TABLE));

    }
    public List<Product> findAllProducts() {
        return this.products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }
}
