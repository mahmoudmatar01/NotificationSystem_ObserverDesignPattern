package org.notification_system_observer_design_pattern;

public class Customer implements Subscriber {

    protected String name;

    // all arguments constructor
    public Customer(String name) {
        this.name = name;
    }

    // helper methods
    @Override
    public void notify(String message) {
        System.out.println("Notifying customer " + name + " : " + message);
    }

}

