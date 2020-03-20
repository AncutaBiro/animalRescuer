package org.fasttrackit;

public class Dog extends Animal {

    boolean activeByDay;
    boolean bite;

    public Dog(String name, int contentmentLevel, boolean bite) {
        super(name, contentmentLevel);
        this.bite = bite;
    }
}

