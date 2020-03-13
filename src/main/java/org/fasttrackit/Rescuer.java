package org.fasttrackit;

public class Rescuer {

    String name;
    int age;
    String gender;
    double finance;
    boolean availability;
    boolean transportation;

    public void feed (Animal animal1, Food food1) {

        System.out.println(name + " just gave some " + food1.name+ " food to " + animal1.name);

        animal1.hungerLevel = animal1.hungerLevel - 5;

        System.out.println( animal1.name + " is feeling less hungry: " + animal1.hungerLevel);

    }

    public void entertain (Animal animal1, Activity activity1) {

        System.out.println(name + " is taking " + animal1.name+ " for a " + activity1.name);

        animal1.contentmentLevel = animal1.contentmentLevel + 2;

        System.out.println("After every " + activity1.name + " " + animal1.name + " is feeling very happy: " + animal1.contentmentLevel);

    }

    }

