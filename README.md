# NotificationSystem_ObserverDesignPattern

This project demonstrates the **Observer Design Pattern** through a notification system that notifies subscribers about different events, such as new products, special offers, and job openings in a marketplace. The system enables dynamic subscription and notification of multiple event types.

---

## Table of Contents

1. [Features](#features)
2. [Technologies](#technologies)
3. [Design Pattern Explanation](#design-pattern-explanation)
4. [Usage](#usage)

---

## Features

- **Observer Design Pattern** implementation to manage subscriptions and notifications.
- Multiple **Event Types** for notifications: New Products, New Offers, and Job Openings.
- Support for dynamic **subscription** and **unsubscription** to specific event types.
- Notification of subscribers (customers and job seekers) with relevant messages when new events are triggered.

---

## Technologies

- **Language**: Java
- **Pattern**: Observer Design Pattern

---

## Design Pattern Explanation

In this project, the Observer Design Pattern allows multiple subscribers to receive notifications when an event occurs. The key classes involved are:

- **Subscriber Interface**: This interface represents the observer and has a `notify` method that each subscriber must implement.
- **Customer & JobFinder Classes**: Implement the `Subscriber` interface, acting as observers who are notified of relevant events.
- **MarketPlace Class**: Acts as the subject or publisher that manages event notifications and subscribers.
- **EventType Enum**: Defines the types of events to which subscribers can subscribe (e.g., NEW_PRODUCT, NEW_OFFER, JOB_OPENING).

### Classes Overview

- **`Subscriber`**: Interface for all subscribers, enforcing a `notify` method.
- **`Customer`** and **`JobFinder`**: Concrete implementations of `Subscriber` to handle notifications.
- **`Product`** and **`Offer`**: Represent different types of items or promotions that may trigger notifications.
- **`MarketPlace`**: Central class managing subscriptions and notifying subscribers upon event occurrences.
- **`EventType`**: Enum defining the types of events (new product, offer, job opening).

---

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `MarketPlace` class to interact with the observer design pattern system.

### Example Code

Here's a sample code snippet to see how the system works:

```java
public class Main {
    public static void main(String[] args) {
        MarketPlace marketPlace = new MarketPlace();

        // Create subscribers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        JobFinder jobSeeker1 = new JobFinder("Charlie");

        // Subscribe to different events
        marketPlace.subscribe(EventType.NEW_PRODUCT, customer1);
        marketPlace.subscribe(EventType.NEW_OFFER, customer2);
        marketPlace.subscribe(EventType.JOB_OPENING, jobSeeker1);

        // Trigger events
        marketPlace.addProduct(new Product("Smartphone", 999.99));
        marketPlace.addOffer(new Offer("Discount Week", "20% off all items!"));
        marketPlace.addOpeningJob("Software Developer");
    }
}
```

### Expected output:
```sql
Notify customer for a new product
Notifying customer Alice : New product added : Smartphone
Notify customer for a new offer
Notifying customer Bob : New offer added : Discount Week with message 20% off all items!
Notify users for a new job
Notify Charlie : a new job opened : Software Developer
```


