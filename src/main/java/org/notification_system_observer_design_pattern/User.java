package org.notification_system_observer_design_pattern;

public class User {

    protected String name;
    protected boolean isSubscribedToProduct;
    protected boolean isSubscribedToOffer;

    // all arguments constructor
    public User(String name, boolean isSubscribedToProduct, boolean isSubscribedToOffer) {
        this.name = name;
        this.isSubscribedToProduct = false;
        this.isSubscribedToOffer = false;
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
}
