package com.example.productservice;

public class Product {
    private String name;
    private double price;

    public Product(double price, String name) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
