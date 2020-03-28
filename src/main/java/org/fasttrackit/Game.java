package org.fasttrackit;

public class Game {
//    Rescuer rescuer;
//    Animal animal;
//    MedicalStaff medicalStaff;

    private Food[] availableFood = new Food[3];
    private Activity[] availableActivities = new Activity[3];

    public void start () {
        initFood();
        displayFood();
        initActivities();
        displayAvailableActivities();
    }

    private void initFood () {
        Food food1 = new Food ("Pedigree", 50);
        food1.setName("Pet Food");
        availableFood[0] = food1;

        Food food2 = new Food ("Pedigree", 50);
        food2.setName("Royal Canin");
        availableFood[1] = food2;
    }

    private void displayFood () {
        System.out.println("The available foods for your animal are: " );
            for (int i = 0; i < availableFood.length; i++){
                if (availableFood[i] != null) {
                System.out.println(availableFood[i].getName());
                }
            }
  //        for each loop
//            for (Food food: availableFood) {
//                if (food != null) {
//                    System.out.println(food.getName());
//                }
//            }
    }
////  initialize availableFood with List
//    private void initFood () {
//        Food food1 = new Food ("Pedigree", 50);
//        food1.setName("a");
//        availableFood.add(food1);
//        System.out.println(availableFood.get(0)); }
//
////  display availableFood with List
//    private void displayFood () {
//        System.out.println("The available foods for your animal are: " );
//        for (int i=0; i < availableFood.size(); i++){
//            if (availableFood.get(i) != null) {
//                System.out.println( availableFood.get(i)); } } }

    private void initActivities () {
        Activity activity1 = new Activity("walk");
        activity1.setName("Play");
        availableActivities[0] = activity1;

        Activity activity2 = new Activity ("walk");
        activity2.setName("Run");
        availableActivities[1]= activity2;
    }

    private void displayAvailableActivities () {

        System.out.println("The available activities for your animal are: " );

        // classic for loop
//        for (int i=0; i < availableActivities.length; i++) {
//            if (availableActivities[i] != null) {
//                System.out.println(availableActivities[i].getName());
//            }
//        }

        for (Activity activity: availableActivities) {
            if (activity != null) {
                System.out.println(activity.getName());
            }
        }
    }
}
