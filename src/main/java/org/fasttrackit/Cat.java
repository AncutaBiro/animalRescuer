package org.fasttrackit;

public class Cat extends Animal {

    private boolean purr;

    public Cat(int hungerLevel, int contentmentLevel, boolean purr) {
        super(hungerLevel, contentmentLevel);
        this.purr = purr;
    }

    public void translateContentmentLevel(int inputContentmentLevel) {

        if (inputContentmentLevel <= 1) {
            inputContentmentLevel = 1;
        }
        if (inputContentmentLevel <= 10) {
            if (inputContentmentLevel <= 5) {
                System.out.println(getName() + " is feeling alright : " + inputContentmentLevel);
            } else {
                System.out.println(getName() + " is purring: " + inputContentmentLevel);
            }
        } else {
            System.out.println("Please enter a number between 1-10");
        }
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }

}
