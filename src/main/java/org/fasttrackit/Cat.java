package org.fasttrackit;

public class Cat extends Animal {

    private boolean purr;

    public Cat(String name, int contentmentLevel, boolean purr) {
        super(name, contentmentLevel);
        this.purr = purr;
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }
}
