package org.notification_system_observer_design_pattern;

public class Offer {

    protected String title;
    protected String offerMessage;

    // all arguments constructor
    public Offer(String title, String offerMessage) {
        this.title = title;
        this.offerMessage = offerMessage;
    }

    public String getTitle() {
        return title;
    }

    public String getOfferMessage() {
        return offerMessage;
    }
}
