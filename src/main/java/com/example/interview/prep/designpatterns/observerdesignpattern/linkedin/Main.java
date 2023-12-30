package com.example.interview.prep.designpatterns.observerdesignpattern.linkedin;

public class Main {
    public static void main(String[] args) {
        Product computer = new Product("Computer", 120);
        Customer customer1 = new Customer("Prashanth");
        Customer customer2 = new Customer("Pachi");

        computer.addPropertyChangeListener(customer1);
        computer.addPropertyChangeListener(customer2);

        computer.setDiscountedPrice(110);
    }
}
