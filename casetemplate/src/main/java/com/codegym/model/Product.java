package com.codegym.model;

import com.codegym.model.ECategory;
import com.codegym.utils.DateUtils;

import java.util.Date;

public class Product implements IModel<Product>{
    private long id;
    private String name;
    private String description;
    private float price;
    private Date createAt;

    private ECategory eCategory;



    public Product() {

    }

    public Product(long id, String name, String description,float price, Date createAt, ECategory eCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.eCategory = eCategory;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s", this.id, this.name, this.description, this.price,
                DateUtils.format(this.createAt), this.eCategory);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void seteCategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }


    @Override
    public void parseData(String line) {
        String[] items = line.split(",");
        //1683514051,Iphone 11,dep lam 11,1000.0,08-05-2023 10:40,PHONE
        long idProduct = Long.parseLong(items[0]);
        float priceProduct = Float.parseFloat(items[3]);
        Date createAt = DateUtils.parse(items[4]);
        ECategory eCategory = ECategory.getECategoryByName(items[5]);
//        Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
        this.setId(idProduct);
        this.setName(items[1]);
        this.setDescription(items[2]);
        this.setPrice(priceProduct);
        this.setCreateAt(createAt);
        this.seteCategory(eCategory);
    }
}
