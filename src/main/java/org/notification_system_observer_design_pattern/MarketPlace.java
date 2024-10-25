package org.notification_system_observer_design_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketPlace {

    protected Map<EventType,List<Subscriber>> subscribers;
    protected List<Product>products;
    protected List<Offer>offers;

    // constructor to initiate fields
    public MarketPlace() {
        this.subscribers = new HashMap<>();
        initSubscribersEvent();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    private void initSubscribersEvent(){
        subscribers.put(EventType.NEW_PRODUCT,new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER,new ArrayList<>());
        subscribers.put(EventType.JOB_OPENING,new ArrayList<>());
    }

    // helper methods
    public void subscribe(EventType eventType,Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);
    }

    public void unsubscribe(EventType eventType,Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Notify customer for a new product");
        subscribers.get(EventType.NEW_PRODUCT).forEach(customer -> customer.notify("New product added : "+product.getName()));
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        System.out.println("Notify customer for a new offer");
        subscribers.get(EventType.NEW_OFFER).forEach(customer -> customer.notify("New offer added : "+offer.getTitle()+" with message "+offer.getOfferMessage()));
    }

    public void addOpeningJob(String jobTitle){
        System.out.println("Notify users for a new job");
        subscribers.get(EventType.JOB_OPENING).forEach(customer -> customer.notify("a new job opened : "+jobTitle));
    }

}
