package org.fasttrackit;

public class Food {

    String name;
    double price;
    int quantity;
    java.time.LocalDate expirationDate;
    boolean stockAvailability;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
