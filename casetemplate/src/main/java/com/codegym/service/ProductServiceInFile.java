package com.codegym.service;

import com.codegym.model.ECategory;
import com.codegym.model.Product;
import com.codegym.utils.DateUtils;
import com.codegym.utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceInFile {
    private final String path = "./data/product.csv";
    public List<Product> findAllProducts() {
        List<Product> products = FileUtils.readFile(path, Product.class);
        return products;
    }

    public Product findProduct(long idProduct) {
        List<Product> list = findAllProducts();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idProduct) {
                return list.get(i);
            }
        }
        return null;
    }

    public void editProduct(long idProduct, Product product) {
        List<Product> list = findAllProducts();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idProduct) {
                list.get(i).setPrice(product.getPrice());
                list.get(i).setDescription(product.getDescription());
                list.get(i).setCreateAt(product.getCreateAt());
                list.get(i).seteCategory(product.geteCategory());
                list.get(i).setName(product.getName());

            }
        }
        FileUtils.writeFile(path, list) ;
    }

    public void addProduct(Product p) {
        List<Product> products = findAllProducts();
        products.add(p);

        FileUtils.writeFile(path, products);

    }
}
