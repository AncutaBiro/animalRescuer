package org.fasttrackit;


import java.time.LocalDate;

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

        Animal animal1 = new Animal("Beethoven", 4);
        animal1.setType("dog");
        //animal1.setName("Beethoven");
        animal1.setAge(2);
        animal1.setHealthLevel(3);
        animal1.setMoodLevel(3);
        animal1.setEnergyLevel(4);
        animal1.setFavoriteFood("Pedigree");
        animal1.setHungerLevel(8);
        animal1.setFavoriteActivity("walk");
        //animal1.setContentmentLevel(4);

        System.out.println("The adopted animal: " + animal1.getType());
        System.out.println("name: " + animal1.getName());
        System.out.println("health level: " + animal1.getHealthLevel());
        System.out.println("age: " + animal1.getAge());
        System.out.println("mood level: " + animal1.getMoodLevel());
        System.out.println("energy level: " + animal1.getEnergyLevel());
        System.out.println("favorite food: " + animal1.getFavoriteFood());
        System.out.println("hunger level: " + animal1.getHungerLevel());
        System.out.println("favorite activity: " + animal1.getFavoriteActivity());
        System.out.println("contentment level: " + animal1.getContentmentLevel());

//        Dog dog = new Dog ("Blacks", 4, true);
//        Cat cat = new Cat ("Piss", 4, true);

        Activity activity1 = new Activity("walk");
        activity1.setName("walk");
        activity1.setDurationMin(40);
        activity1.setEnergySpent(60);

        animal1.activity = activity1;

        System.out.println("animal activity: " + activity1.getName());
        System.out.println("animal activity: " + animal1.activity.getName());
        System.out.println("activity duration: " + activity1.getDurationMin());
        System.out.println("activity energy spent: " + activity1.getEnergySpent());

        Rescuer rescuerReference = new Rescuer("Jane", 10);
        rescuerReference.setName("Jane");
        rescuerReference.setAge(10);
        rescuerReference.setGender("female");
        rescuerReference.setFinance(120.25);
        rescuerReference.setAvailability(true);
        rescuerReference.setTransportation(false);

        System.out.println("The rescuer : " + rescuerReference.getName());
        System.out.println("age: " + rescuerReference.getAge());
        System.out.println("gender: " + rescuerReference.getGender());
        System.out.println("finance: " + rescuerReference.getFinance());
        System.out.println("availability: " + rescuerReference.isAvailability());
        System.out.println("transportation: " + rescuerReference.isTransportation());

        Food food1 = new Food("Pedigree", 50);
        food1.setName("Pedigree");
        food1.setStockAvailability(true);
        food1.setQuantity(500);
        food1.setExpirationDate(LocalDate.of(2020, DECEMBER, 31));
        food1.setPrice(50);

        System.out.println("favorite food: " + food1.getName());
        System.out.println("food stock availability: " + food1.isStockAvailability());
        System.out.println("food quantity: " + food1.getQuantity());
        System.out.println("food expiration date: " + food1.getExpirationDate());
        System.out.println("food price: " + food1.getPrice());



        rescuerReference.feed (animal1, food1);
        rescuerReference.entertain(animal1, activity1);



        VeterinaryClinic veterinaryClinic1 = new VeterinaryClinic("Str. Bucegi, nr 1, Cluj Napoca");
        veterinaryClinic1.setName("Vet for Pet");
        veterinaryClinic1.setAddress("Str. Bucegi, nr 1, Cluj Napoca");
        veterinaryClinic1.setDistance(5);

        MedicalStaff medicalStaffReference = new MedicalStaff("Brad", true);
        medicalStaffReference.setSpecialty("Vet MD");
        medicalStaffReference.setName("Brad");
        medicalStaffReference.setGender("male");
        medicalStaffReference.setAvailability(true);

        Nurse nurse = new Nurse("Amalia", true, 100);
        nurse.setBill(100);

        veterinaryClinic1.medicalstaff = medicalStaffReference;

        System.out.println("The Veterinary Clinic: " + veterinaryClinic1.getName());
        System.out.println("vet clinic address: " + veterinaryClinic1.getAddress());
        System.out.println("vet clinic distance from home: " + veterinaryClinic1.getDistance());
        System.out.println("The Medical Staff attending the vet clinic : " + medicalStaffReference.getName());
        System.out.println("medical Staff specialty : " + medicalStaffReference.getSpecialty());
        System.out.println("medical Staff gender : " + medicalStaffReference.getGender());
        System.out.println("medical Staff availability : " + medicalStaffReference.isAvailability());
        System.out.println("medical bill: " + nurse.getBill());

        Home home1 = new Home("str Olt, nr 30, Cluj Napoca");
        home1.setType("house");
        home1.setAddress("str Olt, nr 30, Cluj Napoca");
        home1.setSquareMeters(200);
        home1.setRoomNumber(5);

        System.out.println("Home sweet home: " + home1.getType());
        System.out.println("home address: " + home1.getAddress());
        System.out.println("home square meters: " + home1.getSquareMeters());
        System.out.println("home room number: " + home1.getRoomNumber());

        PetShop petShop1 = new PetShop("str Mures, nr 20, Cluj Napoca");
        petShop1.setName("Animax");
        petShop1.setAddress("str Mures, nr 20, Cluj Napoca");
        petShop1.setDistance(600);

        System.out.println("The Pet Shop: " + petShop1.getName());
        System.out.println("pet shop address: " + petShop1.getAddress());
        System.out.println("pet shop distance from home: " + petShop1.getDistance());

        PetPark petPark1 = new PetPark("str Primaverii, nr 15-30, Cluj Napoca");
        petPark1.setName("Dog Park");
        petPark1.setAddress("str Primaverii, nr 15-30, Cluj Napoca");
        petPark1.setDistance(1000);

        System.out.println("The Pet Park: " + petPark1.getName());
        System.out.println("pet park address: " + petPark1.getAddress());
        System.out.println("pet park distance from home: " + petPark1.getDistance());

//        Game game1 = new Game();
//        game1.animal = animal1;
//        game1.rescuer = rescuerReference;
//        game1.medicalstaff = medicalStaffReference;
//
//        System.out.println("This game has an animal: " + game1.animal.getName());
//        System.out.println("This game has a rescuer: " + game1.rescuer.getName());
//        System.out.println("This game has a medical staff: " + game1.medicalstaff.getName());

    }
}
