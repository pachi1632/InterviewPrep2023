package com.example.interview.prep.designpatterns.observerdesignpattern.ecommerceexample;

/*

Observer Design Pattern:

Observer Design Pattern mainly consists 4 components

1. Observer
2. Subject (Observable)
3. Concrete Observer
4. Concrete Subject (Concrete Observable)

Where Subject maintains list of Observers
and provides methods to register, unregister and notify observers.

Whenever a subject is notified Concrete Subject calls update method on each Observer.

And Observer declares method to update itself.

Concrete Observer implements the method update.

* */

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String productName, double discountedPrice);
}

// ConcreteObserver class representing a customer
class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, double discountedPrice) {
        System.out.println(name + ", a product you are interested in (" + productName +
                ") is now available at a discounted price: $" + discountedPrice);
    }
}

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName, double discountedPrice);
}

// ConcreteSubject class representing a product in the e-commerce context
class Product implements Subject {
    private String productName;
    private double regularPrice;
    private double discountedPrice;
    private List<Observer> observers = new ArrayList<>();

    public Product(String productName, double regularPrice) {
        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discountedPrice = regularPrice; // Initially, set the discounted price to the regular price
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
        notifyObservers(productName, discountedPrice);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName, double discountedPrice) {
        for (Observer observer : observers) {
            observer.update(productName, discountedPrice);
        }
    }
}

public class ECommerceExample {
    public static void main(String[] args) {
        // Creating customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Creating a product
        Product laptop = new Product("Laptop", 1000.0);

        // Customers subscribe to notifications for the laptop
        laptop.addObserver(customer1);
        laptop.addObserver(customer2);

        // Notify customers about a discount on the laptop
        laptop.setDiscountedPrice(900.0);
    }
}

