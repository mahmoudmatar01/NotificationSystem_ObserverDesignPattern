package org.notification_system_observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace {
    protected List<User> users;
    protected List<Product>products;
    protected List<Offer>offers;

    // constructor to initiate fields
    public MarketPlace() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }
    
    // getter methods
    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Offer> getOffers() {
        return offers;
    }
    
    // helper methods 
    public void addUser(User user) {
        users.add(user);
    }
    
    public void addNewProduct(Product product){
        products.add(product);
        notifyUsers();
    }

    private void notifyUsers() {

    }
}
