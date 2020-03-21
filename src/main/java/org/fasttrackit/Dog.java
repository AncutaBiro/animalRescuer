package org.fasttrackit;

public class Dog extends Animal {

    private boolean bite;

    public Dog(String name, int contentmentLevel, boolean bite) {
        super(name, contentmentLevel);
        this.bite = bite;
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }
}

