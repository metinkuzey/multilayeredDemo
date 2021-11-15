package com.metinkuzey.multiLayeredDemo.entities.concretes;

import com.metinkuzey.multiLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private String categoryName;
    private  String name;
    private double price;
    private int unitsInStock;

    public Product() {
    }

    public Product(int id, int categoryId, String categoryName, String name, double price, int unitsInStock) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
