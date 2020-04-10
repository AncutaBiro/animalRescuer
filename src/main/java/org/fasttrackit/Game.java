package org.fasttrackit;


import org.fasttrackit.Utils.ScannerUtils;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Game {
//    Rescuer rescuer;
//    Animal animal;
//    MedicalStaff medicalStaff;

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[3];

    public void start() {

        initAnimal();
        initRescuer();

        initFood();
        displayFood();
        initActivities();
        displayActivities();
    }

    private void initAnimal () {

        System.out.println("Please select the preferred animal for the game: dog or cat.");
        String preferredAnimal = ScannerUtils.nextLine();

        if (preferredAnimal.equalsIgnoreCase("cat")) {
            Animal cat = new Cat ("birman", "Pissy", 4, true);
            cat.setAge(3);
            cat.setHealthLevel(2);
            cat.setHungerLevel(5);
            cat.setMoodLevel(5);
            cat.setFavoriteFood("Purina");
            cat.setEnergyLevel(3);
            cat.setFavoriteActivity("sleeping");
            System.out.println(cat);
        }

            if (preferredAnimal.equalsIgnoreCase("dog")) {
            Animal dog = new Dog("labrador", "Blacks", 5, true);
            dog.setAge(9);
            dog.setHealthLevel(3);
            dog.setHungerLevel(4);
            dog.setMoodLevel(6);
            dog.setFavoriteFood("Royal Canin");
            dog.setEnergyLevel(5);
            dog.setFavoriteActivity("walking");
            System.out.println(dog);
        }

        }

    private String getNameFromUser () {
        System.out.println("Please enter your name.");

        // nu functioneaza recursivitatea si nu inteleg de ce??????

        try {
            return ScannerUtils.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again.");
            return getNameFromUser();
        }
    }

        private void initRescuer () {
            Rescuer rescuer = new Rescuer(20);
            String name = getNameFromUser();
            rescuer.setName(name);
        }

        private void initFood() {
        Food food1 = new Food("Pet Food", 50);
        availableFood.add(food1);

        Food food2 = new Food("Royal Canin", 50);
        availableFood.add(food2);
    }

        private void displayFood () {
            System.out.println("The available foods for your animal are: ");

            // for-each
            for (Food food : availableFood) {
                { System.out.println(food.getName()); }
            }
            // classic for loop
            for (int i = 0; i < availableFood.size(); i++) {
                { System.out.println(availableFood.get(i).getName());}
            }
        }

        private void initActivities () {
            Activity activity1 = new Activity("walk");
            activity1.setName("Play");
            availableActivities[0] = activity1;

            Activity activity2 = new Activity("walk");
            activity2.setName("Run");
            availableActivities[1] = activity2;
        }

        private void displayActivities () {

            System.out.println("The available activities for your animal are: ");

            // classic for loop
        for (int i=0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
             // for-each
            for (Activity activity : availableActivities) {
                if (activity != null) {
                    System.out.println(activity.getName());
                }
            }
        }
    }