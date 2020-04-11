package org.fasttrackit;


import java.sql.SQLOutput;
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
        Game game = new Game();
        game.start();


//        Animal animalRef = new Animal("dog", "Beethoven", 8);
//        animalRef.setType("dog");
//        //animalRef.setName("Beethoven");
//        animalRef.setAge(2);
//        animalRef.setHealthLevel(3);
//        animalRef.setMoodLevel(3);
//        animalRef.setEnergyLevel(4);
//        animalRef.setFavoriteFood("Pedigree");
//        animalRef.setHungerLevel(8);
//        animalRef.setFavoriteActivity("walk");
//        //animalRef.setContentmentLevel(4);
//
//        System.out.println(animalRef);
////        System.out.println("The adopted animal: " + animalRef.getType());
////        System.out.println("name: " + animalRef.getName());
////        System.out.println("health level: " + animalRef.getHealthLevel());
////        System.out.println("age: " + animalRef.getAge());
////        System.out.println("mood level: " + animalRef.getMoodLevel());
////        System.out.println("energy level: " + animalRef.getEnergyLevel());
////        System.out.println("favorite food: " + animalRef.getFavoriteFood());
////        System.out.println("hunger level: " + animalRef.getHungerLevel());
////        System.out.println("favorite activity: " + animalref.getFavoriteActivity());
////        System.out.println("contentment level: " + animalRef.getContentmentLevel());
//
//        animalRef.translateContentmentLevel(6);
//
//        Animal dog = new Dog ("dog", "Blacks", 4, true);
//        System.out.println(dog);
//        dog.translateContentmentLevel(6);
//
//        Animal cat = new Cat ("cat", "Pissy", 4, true);
//        System.out.println(cat);
//        cat.translateContentmentLevel(6);
//
//
//
//
//        Activity activityRef = new Activity("walk");
//        activityRef.setName("walk");
//        activityRef.setDurationMin(40);
//        activityRef.setEnergySpent(60);
//        animalRef.setActivity(activityRef);
//
//        System.out.println("animal activity: " + activityRef.getName());
//        System.out.println("animal activity: " + animalRef.getActivity().getName());
//        System.out.println("activity duration: " + activityRef.getDurationMin());
//        System.out.println("activity energy spent: " + activityRef.getEnergySpent());
//
//        Rescuer rescuerReference = new Rescuer("Jane", 10);
//        rescuerReference.setName("Jane");
//        rescuerReference.setAge(10);
//        rescuerReference.setGender("female");
//        rescuerReference.setFinance(120.25);
//        rescuerReference.setAvailability(true);
//        rescuerReference.setTransportation(false);
//
//        System.out.println("The rescuer : " + rescuerReference.getName());
//        System.out.println("age: " + rescuerReference.getAge());
//        System.out.println("gender: " + rescuerReference.getGender());
//        System.out.println("finance: " + rescuerReference.getFinance());
//        System.out.println("availability: " + rescuerReference.isAvailability());
//        System.out.println("transportation: " + rescuerReference.isTransportation());
//
//        Food foodRef = new Food("Pedigree", 50);
//        foodRef.setName("Pedigree");
//        foodRef.setStockAvailability(true);
//        foodRef.setQuantity(500);
//        foodRef.setExpirationDate(LocalDate.of(2020, DECEMBER, 31));
//        foodRef.setPrice(50);
//
//        System.out.println("favorite food: " + foodRef.getName());
//        System.out.println("food stock availability: " + foodRef.isStockAvailability());
//        System.out.println("food quantity: " + foodRef.getQuantity());
//        System.out.println("food expiration date: " + foodRef.getExpirationDate());
//        System.out.println("food price: " + foodRef.getPrice());
//
//
//
//        rescuerReference.feed (animalRef, foodRef);
//        rescuerReference.entertain(animalRef, activityRef);
//
//
//
//
//
//        VeterinaryClinic veterinaryClinic1 = new VeterinaryClinic("Str. Bucegi, nr 1, Cluj Napoca");
//        veterinaryClinic1.setName("Vet for Pet");
//        veterinaryClinic1.setAddress("Str. Bucegi, nr 1, Cluj Napoca");
//        veterinaryClinic1.setDistance(5);
//
//        MedicalStaff medicalStaffReference = new MedicalStaff("Brad", true);
//        medicalStaffReference.setSpecialty("Vet MD");
//        medicalStaffReference.setName("Brad");
//        medicalStaffReference.setGender("male");
//        medicalStaffReference.setAvailability(true);
//
//        Nurse nurse = new Nurse("Amalia", true, 100);
//        nurse.setBill(100);
//
//        veterinaryClinic1.setMedicalstaff(medicalStaffReference);
//
//        System.out.println("The Veterinary Clinic: " + veterinaryClinic1.getName());
//        System.out.println("vet clinic address: " + veterinaryClinic1.getAddress());
//        System.out.println("vet clinic distance from home: " + veterinaryClinic1.getDistance());
//        System.out.println("The Medical Staff attending the vet clinic : " + medicalStaffReference.getName());
//        System.out.println("medical Staff specialty : " + medicalStaffReference.getSpecialty());
//        System.out.println("medical Staff gender : " + medicalStaffReference.getGender());
//        System.out.println("medical Staff availability : " + medicalStaffReference.isAvailability());
//        System.out.println("medical bill: " + nurse.getBill());
//
//        Home home1 = new Home("str Olt, nr 30, Cluj Napoca");
//        home1.setType("house");
//        home1.setAddress("str Olt, nr 30, Cluj Napoca");
//        home1.setSquareMeters(200);
//        home1.setRoomNumber(5);
//
//        System.out.println("Home sweet home: " + home1.getType());
//        System.out.println("home address: " + home1.getAddress());
//        System.out.println("home square meters: " + home1.getSquareMeters());
//        System.out.println("home room number: " + home1.getRoomNumber());
//
//        PetShop petShop1 = new PetShop("str Mures, nr 20, Cluj Napoca");
//        petShop1.setName("Animax");
//        petShop1.setAddress("str Mures, nr 20, Cluj Napoca");
//        petShop1.setDistance(600);
//
//        System.out.println("The Pet Shop: " + petShop1.getName());
//        System.out.println("pet shop address: " + petShop1.getAddress());
//        System.out.println("pet shop distance from home: " + petShop1.getDistance());
//
//        PetPark petPark1 = new PetPark("str Primaverii, nr 15-30, Cluj Napoca");
//        petPark1.setName("Dog Park");
//        petPark1.setAddress("str Primaverii, nr 15-30, Cluj Napoca");
//        petPark1.setDistance(1000);
//
//        System.out.println("The Pet Park: " + petPark1.getName());
//        System.out.println("pet park address: " + petPark1.getAddress());
//        System.out.println("pet park distance from home: " + petPark1.getDistance());
//

    }
}
