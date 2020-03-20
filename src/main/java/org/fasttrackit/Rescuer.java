package org.fasttrackit;


public class Rescuer {

    String name;
    int age;
    String gender;
    double finance;
    boolean availability;
    boolean transportation;

    public Rescuer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feed (Animal animal1, Food food1) {

        if (food1.name.equals(animal1.favoriteFood)) {
            animal1.contentmentLevel ++;
                System.out.println(animal1.name + " is feeling happy for receiving his favorite food: " + animal1.contentmentLevel);
        }
//        else {}

        System.out.println(name + " just gave some " + food1.name+ " food to " + animal1.name);

        animal1.hungerLevel = animal1.hungerLevel - 5;

        System.out.println( animal1.name + " is feeling less hungry: " + animal1.hungerLevel);

    }

    public void entertain (Animal animal1, Activity activity1) {

        if (activity1.name.equals(animal1.favoriteActivity)) {
            animal1.contentmentLevel = animal1.contentmentLevel + 2;
            System.out.println( animal1.name + " is super excited for taking a " + animal1.favoriteActivity + ": " + animal1.contentmentLevel);
        }
            else {
            animal1.contentmentLevel++;
        }

        System.out.println(name + " is taking " + animal1.name+ " for a " + activity1.name);

        animal1.contentmentLevel = animal1.contentmentLevel + 2;

        System.out.println("After every " + activity1.name + " " + animal1.name + " is feeling more content: " + animal1.contentmentLevel);

    }

    }

