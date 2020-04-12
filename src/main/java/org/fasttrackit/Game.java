package org.fasttrackit;

import org.fasttrackit.Utils.ScannerUtils;
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

    public void start() {
        System.out.println("Animal Rescue Game!");
        System.out.println("A helpless dog needs your help. Take good care of him!");

        initAnimal();
        initRescuer();
        nameAnimal();
        initAnimal();
        initFood();
        initActivities();

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n" + i + " Round");
            requireFeeding();
            requireActivity();
        }

        if (dog.getHungerLevel() <= 1 || dog.getContentmentLevel() >= 10) {
        System.out.println("\nCongratulations " + rescuer.getName() + "! You've rescued the dog.");}
        else {
        System.out.println("\nUnfortunately, you lost.");}

    }

       private void initAnimal () {
            dog.setType("Labrador");
            dog.setAge(2);
            dog.setHealthLevel(3);
            dog.setMoodLevel(6);
            dog.setFavoriteFood("Pedigree");
            dog.setEnergyLevel(5);
            dog.setFavoriteActivity("Walk");
        }

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

        private void initFood() {
        Food food1 = new Food(50);
        food1.setName("Pedigree");
        availableFood.add(food1);

        Food food2 = new Food(50);
        food2.setName ("Pet Food");
        availableFood.add(food2);

        Food food3 = new Food(30);
        food3.setName("Cesar");
        availableFood.add(food3);
    }

        private void requireFeeding () {
            System.out.println("It's time to feed the dog. The available foods for "+ dog.getName() + " are: ");

            for (Food food : availableFood) {
                System.out.println(food.getName());
            }

            System.out.println("\nPlease select the food and feed the dog: ");
            String chosenFood = ScannerUtils.nextLine();

            food.setName(chosenFood);
            rescuer.feed(dog, food);
            }

        private void initActivities() {
            Activity activity1 = new Activity(20);
            activity1.setName("Walk");
            availableActivities[0] = activity1;

            Activity activity2 = new Activity(10);
            activity2.setName("Run");
            availableActivities[1] = activity2;

            Activity activity3 = new Activity(10);
            activity3.setName("Play");
            availableActivities[2] = activity3;
    }

        private void requireActivity () {

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
