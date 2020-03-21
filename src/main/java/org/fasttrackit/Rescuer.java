package org.fasttrackit;


public class Rescuer {

    private String name;
    private int age;
    private String gender;
    private double finance;
    private boolean availability;
    private boolean transportation;

    public Rescuer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feed (Animal animal1, Food food1) {

        if (food1.getName().equals(animal1.getFavoriteFood())) {
            animal1.setContentmentLevel(animal1.getContentmentLevel() +1);
                System.out.println(animal1.getName() + " is feeling happy for receiving his favorite food: " + animal1.getContentmentLevel());
        }

        System.out.println(name + " just gave some " + food1.getName() + " food to " + animal1.getName());

        animal1.setHungerLevel(animal1.getHungerLevel() - 5);

        System.out.println( animal1.getName() + " is feeling less hungry: " + animal1.getHungerLevel());

    }

    public void entertain (Animal animal1, Activity activity1) {

        if (activity1.getName().equals(animal1.getFavoriteActivity())) {
            animal1.setContentmentLevel(animal1.getContentmentLevel() + 2);
            System.out.println( animal1.getName() + " is super excited for taking a " + animal1.getFavoriteActivity() + ": " + animal1.getContentmentLevel());
        }
            else {
            animal1.setContentmentLevel(animal1.getContentmentLevel() +1);
        }

        System.out.println(name + " is taking " + animal1.getName() + " for a " + activity1.getName());

        animal1.setContentmentLevel(animal1.getContentmentLevel() + 2);

        System.out.println("After every " + activity1.getName() + " " + animal1.getName() + " is feeling more content: " + animal1.getContentmentLevel());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getFinance() {
        return finance;
    }

    public void setFinance(double finance) {
        this.finance = finance;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isTransportation() {
        return transportation;
    }

    public void setTransportation(boolean transportation) {
        this.transportation = transportation;
    }
}

