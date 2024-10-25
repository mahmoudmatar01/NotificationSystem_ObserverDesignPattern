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

    
    // helper methods 
    public void addUser(User user) {
        users.add(user);
    }
    
    public void addNewProduct(Product product){
        products.add(product);
        notifyUsers(product);
    }

    private void notifyUsers(Product product) {
        System.out.println("Notify users for new product added");
        users.forEach(user -> {
            if(user.isSubscribedToProduct())
                user.notifyNewProduct(product);
        });
    }

    public void addNewOffer(Offer offer){
        offers.add(offer);
        notifyUsers(offer);
    }

    private void notifyUsers(Offer offer) {
        System.out.println("Notify users for new product added");
        users.forEach(user -> {
            if(user.isSubscribedToOffer())
                user.notifyNewOffer(offer);
        });
    }

}
