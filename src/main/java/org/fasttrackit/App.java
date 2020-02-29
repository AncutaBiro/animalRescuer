package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Animal Rescue Game!" );

        Animal animal1 = new Animal();
        animal1.type = "dog";
        animal1.name = "Beethoven";
        animal1.age = 2;
        animal1.healthStatus = 3;
        animal1.mood = 3;
        animal1.energyLevel = 4;
        animal1.favoriteFood = "bone";
        animal1.appetite = 8;

        Activity activity1 = new Activity();
        activity1.name = "walking";
        activity1.durationMin = 40;
        activity1.contentmentLevel = 8;
        activity1.energySpent = 60;

        animal1.activity = activity1;

        System.out.println("The adopted animal: " + animal1.type);
        System.out.println("name: " + animal1.name);
        System.out.println("healthStatus: " + animal1.healthStatus);
        System.out.println("age: " + animal1.age);
        System.out.println("mood: " + animal1.mood);
        System.out.println("energyLevel: " + animal1.energyLevel);
        System.out.println("favoriteFood: " + animal1.favoriteFood);
        System.out.println("appetite: " + animal1.appetite);
        System.out.println("Favourite activity: " + activity1.name);
        System.out.println("Favourite activity: " + animal1.activity.name);
        System.out.println("activity duration: " + activity1.durationMin);
        System.out.println("activity contentment level: " + activity1.contentmentLevel);
        System.out.println("activity energy spent: " + activity1.energySpent);

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.name = "Jane";
        rescuerReference.age = 10;
        rescuerReference.gender = "female";
        rescuerReference.finance = 120.25;
        rescuerReference.availability = true;
        rescuerReference.transportation = false;

        System.out.println("The rescuer : " + rescuerReference.name);
        System.out.println("age: " + rescuerReference.age);
        System.out.println("gender: " + rescuerReference.gender);
        System.out.println("finance: " + rescuerReference.finance);
        System.out.println("availability: " + rescuerReference.availability);
        System.out.println("transportation: " + rescuerReference.transportation);

        Food food1 = new Food();
        food1.name = "pedigree";
        food1.foodStockAvailability = true;
        food1.quantity = 500;
        food1.expirationDate = new Date();
        java.util.Date date = new java.util.Date();
        food1.price = 50;

        System.out.println("favourite food: " + food1.name);
        System.out.println("food stock availability: " + food1.foodStockAvailability);
        System.out.println("food quantity: " + food1.quantity);
        System.out.println("food expiration date: " + food1.expirationDate);
        System.out.println("food price: " + food1.price);

        VeterinaryClinic veterinaryClinic1 = new VeterinaryClinic();
        veterinaryClinic1.name = "Vet for Pet";
        veterinaryClinic1.address = "Str. Bucegi, nr 1, Cluj Napoca";
        veterinaryClinic1.distance = 5;

        MedicalStaff medicalStaffReference = new MedicalStaff();
        medicalStaffReference.specialty = "Vet MD";
        medicalStaffReference.name = "Brad";
        medicalStaffReference.gender = "male";
        medicalStaffReference.availability = true;

        veterinaryClinic1.medicalstaff = medicalStaffReference;

        System.out.println("The Veterinary Clinic: " + veterinaryClinic1.name);
        System.out.println("vet clinic address: " + veterinaryClinic1.address);
        System.out.println("vet clinic distance from home: " + veterinaryClinic1.distance);
        System.out.println("The Medical Staff attending the vet clinic : " + medicalStaffReference.name);
        System.out.println("medical Staff specialty : " + medicalStaffReference.specialty);
        System.out.println("medical Staff gender : " + medicalStaffReference.gender);
        System.out.println("medical Staff availability : " + medicalStaffReference.availability);













    }
}
