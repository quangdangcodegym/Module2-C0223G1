package com.codegym.service;

import com.codegym.model.ECategory;
import com.codegym.model.Product;
import com.codegym.utils.DateUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceInFile {
    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("./data/product.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] items = line.split(",");
                //1683514051,Iphone 11,dep lam 11,1000.0,08-05-2023 10:40,PHONE
                long idProduct = Long.parseLong(items[0]);
                float priceProduct = Float.parseFloat(items[3]);
                Date createAt = DateUtils.parse(items[4]);
                ECategory eCategory = ECategory.getECategoryByName(items[5]);

                Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
                products.add(p);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return products;
    }

    public void addProduct(Product p) {
        List<Product> products = findAllProducts();
        products.add(p);

        try {
            FileWriter fileWriter = new FileWriter("./data/product.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Product item : products) {
                bufferedWriter.write(item.toString() +"\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
