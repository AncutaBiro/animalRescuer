package org.fasttrackit;


import org.fasttrackit.Utils.ScannerUtils;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Game {

    Animal dog = new Dog (10, 1, true);
    Rescuer rescuer = new Rescuer(20);
    Food food =  new Food (50);
    Activity activity = new Activity(20);

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[3];
    private int roundsCount = 3;

    public void start() {

        System.out.println( "Animal Rescue Game!" );
        System.out.println("A helpless dog needs your help. Take good care of him!");

        initAnimal();
        initRescuer();
        nameAnimal();

        for (int i = 1; i <= roundsCount; i++) {

            if (dog.getHungerLevel() == 1 || dog.getContentmentLevel() == 10) {
                System.out.println("\nCongratulations, you won.");}

                else {
            System.out.println("\n" + i + " Round");
            requireFeeding();
            requireActivity(); }

            }
        }


    private void initAnimal () {
//        String preferredAnimal = ScannerUtils.nextLine();
            dog.setType("labrador");
            dog.setAge(9);
            dog.setHealthLevel(3);
            dog.setMoodLevel(6);
            dog.setFavoriteFood("Royal Canin");
            dog.setEnergyLevel(5);
            dog.setFavoriteActivity("Walk");
        }

        // vreau sa foloresc try catch cu recursivitate, ma poti ajuta te rog.
//        if (preferredAnimal.equalsIgnoreCase("cat")) {
//            cat.setName("to be named");
//            cat.setAge(3);
//            cat.setHealthLevel(2);
//            cat.setHungerLevel(5);
//            cat.setMoodLevel(5);
//            cat.setFavoriteFood("Purina");
//            cat.setEnergyLevel(3);
//            cat.setFavoriteActivity("sleeping");
//
//        }
//
//            try { if preferredAnimal== cat ; if preferredAnimal== dog}
//        } catch (InputMismatchException e) {
//            System.out.println("You have entered an invalid value. Please try again." );
//        } finally {
//            preferredAnimal = ScannerUtils.nextLine();
//        }

    private String getNameFromUser () {
        System.out.println("\nPlease enter your name: ");
        // nu functioneaza recursivitatea si nu inteleg de ce??????
        try {
            return ScannerUtils.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again.");
            return getNameFromUser();
        }
    }

        private void initRescuer () {
            String name = getNameFromUser();
            rescuer.setName(name);
        }

        private void nameAnimal () {
            System.out.println("\nPlease name your animal: ");
            String name = ScannerUtils.nextLine();

            dog.setName(name);
            System.out.println("These are the general information for " + dog.getName());
            System.out.println(dog);
            }

        private void requireFeeding () {
            Food food1 = new Food(50);
            food1.setName("Pet Food");
            availableFood.add(food1);

            Food food2 = new Food(50);
            food2.setName("Royal Canin");
            availableFood.add(food2);

            System.out.println("\nIt's time to feed the dog. The available foods for "+ dog.getName() + " are: ");

            for (Food food : availableFood) {
                System.out.println(food.getName());
            }

            System.out.println("\nPlease select the food and feed the dog: ");
            String chosenFood = ScannerUtils.nextLine();

            food.setName(chosenFood);
            rescuer.feed(dog, food);
            }

        private void requireActivity () {
            Activity activity1 = new Activity(30);
            activity1.setName("Play");
            availableActivities[0] = activity1;

            Activity activity2 = new Activity(10);
            activity2.setName("Walk");
            availableActivities[1] = activity2;

            System.out.println("\nIt's time to entertain the dog. The available activities for " + dog.getName() +  " are: ");

        for (int i=0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
            System.out.println("\nPlease select the activity and entertain the dog: ");
            String chosenActivity = ScannerUtils.nextLine();

            activity.setName(chosenActivity);
            rescuer.entertain(dog, activity);
        }

}
