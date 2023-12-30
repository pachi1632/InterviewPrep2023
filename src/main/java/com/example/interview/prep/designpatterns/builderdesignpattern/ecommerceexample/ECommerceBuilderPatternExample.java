package com.example.interview.prep.designpatterns.builderdesignpattern.ecommerceexample;

/*

Builder Design Pattern:

The Builder Design Pattern is a creational pattern that provides a way to construct a complex object step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

Intent:
Separate the construction of a complex object from its representation so that the same construction process can create different representations.
Make the construction process more flexible, allowing different representations to be constructed using the same process.

Participants:
Director: This is the class that directs the construction process. It works with a builder to build a product.
Builder: This is an interface or an abstract class that declares the construction steps for building the product. Concrete builders implement this interface to construct and assemble parts of the product.
ConcreteBuilder: This is a concrete class implementing the builder interface. It provides specific implementations for constructing and assembling the parts of the product.
Product: This is the complex object being constructed.

Key Concepts:
Director controls the construction process: The director orchestrates the construction process by directing the builder to build each part of the product.
Separation of concerns: The client code interacts with the director to construct the product without worrying about the details of the construction process. The details are encapsulated within the builder.
Product construction: The product is constructed step by step. Different builders can provide different implementations for constructing the same type of product.

UML Diagram:

+------------------+          +------------------+
|      Director    |          |      Builder     |
+------------------+          +------------------+
| Construct()      |<>------->|                  |
|                  |          | +constructCPU()  |
|                  |          | +constructRAM()  |
|                  |          | +constructStorage|
+------------------+          |                  |
                              +------------------+
                                      |
                                      |
                              +------------------+
                              | ConcreteBuilder  |
                              +------------------+
                              |                  |
                              | +constructCPU()  |
                              | +constructRAM()  |
                              | +constructStorage|
                              +------------------+
                                      |
                                      |
                              +------------------+
                              |     Product      |
                              +------------------+

Usage Guidelines:
When the construction of an object is complex and involves multiple steps.
When you want to construct different representations of the same object.
When you want to have finer control over the construction process.

Benefits:
Separation of concerns: The construction process is separated from the representation, making it easier to create different representations.
Reusability: The same construction process can be used to create different products.
Flexibility: The director can vary the construction process, leading to different variations of the product.

Drawbacks:
Complexity: The pattern introduces more classes and interfaces, which might be overkill for simpler construction processes.
Increased Code: The client code needs to interact with the director and builder, leading to more code.


Builder Design Patter is used to construct complex objects step by step.

It's main components are

1. Complex Object to be built
2. Builder
3. Concrete Builder
4. Director

Builder is an interface or abstract class which declares the step for constructing complex object.
Concrete Builder is a class which which implements Builder interface or abstract class.
Director consists of builder object and is responsible for directing the construction process.

In Builder all methods return Builder except build() method, it returns Complex Object.
Director class consists of Builder object and construct() method, construct() method returns Builder object.

* */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Product class (the complex object to be built)
class Order {
    public List<String> items;
    public String shippingAddress;
    public String paymentMethod;

    public Order(List<String> items, String shippingAddress, String paymentMethod) {
        this.items = items;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    // Getters for the components
    public List<String> getItems() {
        return items;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}

// Abstract builder interface
interface OrderBuilder {
    OrderBuilder setItems(List<String> items);
    OrderBuilder setShippingAddress(String shippingAddress);
    OrderBuilder setPaymentMethod(String paymentMethod);
    Order build();
}

// Concrete builder implementing the builder interface
class ConcreteOrderBuilder implements OrderBuilder {
    private Order order;

    public ConcreteOrderBuilder() {
        this.order = new Order(Collections.emptyList(), "Default Address", "Default Payment");
    }

    @Override
    public OrderBuilder setItems(List<String> items) {
        order.items = items;
        return this;
    }

    @Override
    public OrderBuilder setShippingAddress(String shippingAddress) {
        order.shippingAddress = shippingAddress;
        return this;
    }

    @Override
    public OrderBuilder setPaymentMethod(String paymentMethod) {
        order.paymentMethod = paymentMethod;
        return this;
    }

    @Override
    public Order build() {
        return order;
    }
}

// Director class responsible for constructing the product using a builder
class OrderDirector {
    private OrderBuilder builder;

    public OrderDirector(OrderBuilder builder) {
        this.builder = builder;
    }

    public OrderBuilder construct() {
        return builder;
    }
}

public class ECommerceBuilderPatternExample {
    public static void main(String[] args) {
        // Creating a builder
        ConcreteOrderBuilder builder = new ConcreteOrderBuilder();

        // Creating a director
        OrderDirector director = new OrderDirector(builder);

        // Constructing an order with specific components
        Order order = director.construct()
                .setItems(Arrays.asList("Product A", "Product B"))
                .setShippingAddress("123 Main Street, City")
                .setPaymentMethod("Credit Card")
                .build();

        // Displaying the constructed order
        System.out.println(order);
    }
}

