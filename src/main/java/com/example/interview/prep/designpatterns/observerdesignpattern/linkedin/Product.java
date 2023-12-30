package com.example.interview.prep.designpatterns.observerdesignpattern.linkedin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// ConcreteSubject class representing a product in the e-commerce context
class Product{
    private String productName;
    private double price;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void setDiscountedPrice(double price) {
        support.firePropertyChange("price", this.price, price);
        this.price = price;
//        notifyObservers(productName, discountedPrice);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
