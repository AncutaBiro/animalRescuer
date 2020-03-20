package org.fasttrackit;

public class Cat extends Animal {

    boolean activeByNight;
    boolean purr;

    public Cat(String name, int contentmentLevel, boolean purr) {
        super(name, contentmentLevel);
        this.purr = purr;
    }
}
