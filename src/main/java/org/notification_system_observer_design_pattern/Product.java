package org.notification_system_observer_design_pattern;

public class Product {

    protected String name;
    protected double price;

    // all arguments constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter method
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
