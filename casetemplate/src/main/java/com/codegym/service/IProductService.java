package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProducts();
    Product findProduct(long idProduct);
    void editProduct(long idProduct, Product product);
    void addProduct(Product p);
}
