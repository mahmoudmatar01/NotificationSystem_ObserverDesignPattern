package org.notification_system_observer_design_pattern;


public class Main {
    public static void main(String[] args) {

        // create a new marketplace
        MarketPlace onlineMarketPlace = new MarketPlace();

        // create a new customers
        Subscriber mahmoud = new Customer("Mahmoud");
        Subscriber ahmed = new Customer("Ahmed");
        Subscriber mostafa = new Customer("Mostafa");
        Subscriber ziad = new JobFinder("Ziad");

        // make customer subscribe in different events
        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT,mahmoud);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,mahmoud);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,ahmed);
        onlineMarketPlace.subscribe(EventType.NEW_OFFER,mostafa);
        onlineMarketPlace.subscribe(EventType.NEW_PRODUCT,mostafa);
        onlineMarketPlace.subscribe(EventType.JOB_OPENING,ziad);

        // add a new product to our marketplace
        onlineMarketPlace.addProduct(new Product("Apple Watch",9500));  // will send a notify message to mahmoud and mostafa for new product
        onlineMarketPlace.addProduct(new Product("Mac book pro",40500)); // will send a notify message to mahmoud and mostafa for new product

        // add a new offer to our marketplace
        onlineMarketPlace.addOffer(new Offer("Black Friday Offer","There is 20% discount in all products")); // will send a notify message to mahmoud and ahmed and mostafa for new offer

        // add a new jon opening to our marketplace
        onlineMarketPlace.addOpeningJob("Junior java developer"); // will notify ziad for a new job position

        // customer unsubscribe from an event
        onlineMarketPlace.unsubscribe(EventType.JOB_OPENING,ziad);
    }
}