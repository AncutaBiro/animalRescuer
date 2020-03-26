package org.fasttrackit;

public class Dog extends Animal {

    private boolean bite;

    public Dog(String type, String name, int contentmentLevel, boolean bite) {
        super(type, name, contentmentLevel);
        this.bite = bite;
    }

    public void translateContentmentLevel(int inputContentmentLevel) {

        if (inputContentmentLevel <= 1) {
            inputContentmentLevel = 1;
        }
        if (inputContentmentLevel <= 10) {
            if (inputContentmentLevel <= 5) {
                System.out.println(getName() + " is feeling alright : " + inputContentmentLevel);
            } else {
                System.out.println(getName() + " is shaking the tail: " + inputContentmentLevel);
            }
        } else {
            System.out.println("Please enter a number between 1-10");
        }
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }

}

