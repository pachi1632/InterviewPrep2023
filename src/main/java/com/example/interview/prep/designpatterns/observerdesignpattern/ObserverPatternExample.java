package com.example.interview.prep.designpatterns.observerdesignpattern;

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
    void update(String weather);
}

// Concrete Observer
class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " Display: Weather has been updated to " + weather);
    }
}

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String currentWeather;

    public void setWeather(String weather) {
        this.currentWeather = weather;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentWeather);
        }
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create weather displays (observers)
        Observer display1 = new WeatherDisplay("Display 1");
        Observer display2 = new WeatherDisplay("Display 2");

        // Register observers with the weather station
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Simulate weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");

        // Unregister an observer
        weatherStation.removeObserver(display1);

        // Simulate another weather change
        weatherStation.setWeather("Cloudy");
    }
}

