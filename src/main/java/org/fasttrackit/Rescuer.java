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

    public void feed (Animal animalRef, Food foodRef) {

        if (foodRef.getName().equals(animalRef.getFavoriteFood())) {
            animalRef.setContentmentLevel(animalRef.getContentmentLevel() +1);
                System.out.println(animalRef.getName() + " is feeling happy for receiving his favorite food: " +
                        animalRef.getContentmentLevel());
        }

        System.out.println(name + " just gave some " + foodRef.getName() + " food to " + animalRef.getName());

        animalRef.setHungerLevel(animalRef.getHungerLevel() - 5);

        System.out.println( animalRef.getName() + " is feeling less hungry: " + animalRef.getHungerLevel());

    }

    public void entertain (Animal animalRef, Activity activityRef) {

        if (activityRef.getName().equals(animalRef.getFavoriteActivity())) {
            animalRef.setContentmentLevel(animalRef.getContentmentLevel() + 2);
            System.out.println( animalRef.getName() + " is super excited for taking a " +
                    animalRef.getFavoriteActivity() + ": " + animalRef.getContentmentLevel());
        }
            else {
            animalRef.setContentmentLevel(animalRef.getContentmentLevel() +1);
        }

        System.out.println(name + " is taking " + animalRef.getName() + " for a " + activityRef.getName());

        animalRef.setContentmentLevel(animalRef.getContentmentLevel() + 2);

        System.out.println("After every " + activityRef.getName() + " " + animalRef.getName() + " is feeling more content: " +
                animalRef.getContentmentLevel());

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

