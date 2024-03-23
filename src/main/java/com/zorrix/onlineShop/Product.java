package com.zorrix.onlineShop;

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;

    public Product(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(){
        this.id = 0;
        this.description = null;
        this.name = null;
        this.price = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
