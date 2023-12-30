package com.example.interview.prep.designpatterns.observerdesignpattern.linkedin;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/*
Connection - Observable
SocialMediaFeed - Observer
* */
class Customer implements PropertyChangeListener {
    private String name;

    public Customer(String name) {
        this.name = name;
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
            System.out.println("From customer "+name+" : Value of "+evt.getPropertyName()+
                    " Changed from "+evt.getOldValue()+" to "+evt.getNewValue());
    }
}
