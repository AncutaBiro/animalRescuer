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

    }

