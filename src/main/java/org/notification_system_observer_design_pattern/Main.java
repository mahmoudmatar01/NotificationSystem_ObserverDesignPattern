package org.notification_system_observer_design_pattern;


public class Main {
    public static void main(String[] args) {

        // create a new marketplace
        MarketPlace onlineMarketPlace = new MarketPlace();

        // add users to marketplace
        onlineMarketPlace.addUser(new User("Mahmoud",true,true));
        onlineMarketPlace.addUser(new User("Ahmed",true,false));
        onlineMarketPlace.addUser(new User("Mostafa",false,true));
        onlineMarketPlace.addUser(new User("Ziad",false,false));

        // add a new product to our marketplace
        onlineMarketPlace.addNewProduct(new Product("Apple Watch",9500));  // will send a notify message to mahmoud and ahmed for new product
        onlineMarketPlace.addNewProduct(new Product("Mac book pro",40500)); // will send a notify message to mahmoud and ahmed for new product

        // add a new offer to our marketplace
        onlineMarketPlace.addNewOffer(new Offer("Black Friday Offer","There is 20% discount in all products")); // will send a notify message to mahmoud and mostafa for new offer

    }
}