package org.notification_system_observer_design_pattern;

public class User {

    protected String name;
    protected boolean isSubscribedToProduct;
    protected boolean isSubscribedToOffer;

    // all arguments constructor
    public User(String name, boolean isSubscribedToProduct, boolean isSubscribedToOffer) {
        this.name = name;
        this.isSubscribedToProduct = isSubscribedToProduct;
        this.isSubscribedToOffer = isSubscribedToOffer;
    }

    // getter method
    public String getName() {
        return name;
    }

    public boolean isSubscribedToProduct() {
        return isSubscribedToProduct;
    }

    public boolean isSubscribedToOffer() {
        return isSubscribedToOffer;
    }

    // helper methods
    public void notifyNewProduct(Product product) {
        System.out.println("Hello " + getName() + " Notifying new product added with name : " + product.getName() );
    }

    public void notifyNewOffer(Offer offer) {
        System.out.println("Hello " + getName() + " Notifying new offer added with title : " + offer.getTitle() +" and with message "+offer.getOfferMessage());
    }
}

