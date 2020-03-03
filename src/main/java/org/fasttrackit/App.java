package org.fasttrackit;

/// ??? ///
import static java.time.Month.*;

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
        animal1.healthLevel = 3;
        animal1.moodLevel = 3;
        animal1.energyLevel = 4;
        animal1.favoriteFood = "bone";
        animal1.hungerLevel = 8;
        animal1.favoriteActivity = "chewing bones";

        System.out.println("The adopted animal: " + animal1.type);
        System.out.println("name: " + animal1.name);
        System.out.println("health level: " + animal1.healthLevel);
        System.out.println("age: " + animal1.age);
        System.out.println("mood level: " + animal1.moodLevel);
        System.out.println("energy level: " + animal1.energyLevel);
        System.out.println("favorite food: " + animal1.favoriteFood);
        System.out.println("hunger level: " + animal1.hungerLevel);
        System.out.println("favorite activity: " + animal1.favoriteActivity);

        Activity activity1 = new Activity();
        activity1.name = "walking";
        activity1.durationMin = 40;
        activity1.contentmentLevel = 8;
        activity1.energySpent = 60;

        animal1.activity = activity1;

        System.out.println("animal activity: " + activity1.name);
        System.out.println("animal activity: " + animal1.activity.name);
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
        food1.expirationDate = java.time.LocalDate.of (2020, DECEMBER, 31);
        food1.price = 50;

        System.out.println("favorite food: " + food1.name);
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

        Home home1 = new Home();
        home1.type = "house";
        home1.address = "str Olt, nr 30, Cluj Napoca";
        home1.squareMeters = 200;
        home1.roomNumber = 5;

        System.out.println("Home sweet home: " + home1.type);
        System.out.println("home address: " + home1.address);
        System.out.println("home square meters: " + home1.squareMeters);
        System.out.println("home room number: " + home1.roomNumber);

        PetShop petShop1 = new PetShop();
        petShop1.name = "Animax";
        petShop1.address = "str Mures, nr 20, Cluj Napoca";
        petShop1.distance = 600;

        System.out.println("The Pet Shop: " + petShop1.name);
        System.out.println("pet shop address: " + petShop1.address);
        System.out.println("pet shop distance from home: " + petShop1.distance);

        PetPark petPark1 = new PetPark();
        petPark1.name = "Dog Park";
        petPark1.address = "str Primaverii, nr 15-30, Cluj Napoca";
        petPark1.distance = 1000;

        System.out.println("The Pet Park: " + petPark1.name);
        System.out.println("pet park address: " + petPark1.address);
        System.out.println("pet park distance from home: " + petPark1.distance);

        Game game1 = new Game();
        game1.animal = animal1;
        game1.rescuer = rescuerReference;
        game1.medicalstaff = medicalStaffReference;

        System.out.println("This game has an animal: " + game1.animal.name);
        System.out.println("This game has a rescuer: " + game1.rescuer.name);
        System.out.println("This game has a medical staff: " + game1.medicalstaff.name);



    }
}
