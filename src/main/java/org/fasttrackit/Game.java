package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Game {
//    Rescuer rescuer;
//    Animal animal;
//    MedicalStaff medicalStaff;

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[3];

    public void start() {
        initFood();
        displayFood();
        initActivities();
        displayActivities();
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