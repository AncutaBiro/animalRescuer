package org.fasttrackit;

public class Animal {

    private String type;
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favoriteFood;
    private int energyLevel;
    private String favoriteActivity;
    private int contentmentLevel;
    private Activity activity;

    public Animal(String type, String name, int contentmentLevel) {
        this.type = type;
        this.name = name;
        this.contentmentLevel = contentmentLevel;
    }

    public void translateContentmentLevel(int inputContentmentLevel) {

        if (inputContentmentLevel <= 1) {
            inputContentmentLevel = 1;
        }
        if (inputContentmentLevel <= 10) {
            if (inputContentmentLevel <= 5) {
                System.out.println(name + " is feeling alright : " + inputContentmentLevel);
            } else {
                System.out.println(name + " is feeling good: " + inputContentmentLevel);
            }
        } else {
            System.out.println("Please enter a number between 1-10");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getContentmentLevel() {
        return contentmentLevel;
    }

    public void setContentmentLevel(int contentmentLevel) {
        this.contentmentLevel = contentmentLevel;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", moodLevel=" + moodLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", energyLevel=" + energyLevel +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", contentmentLevel=" + contentmentLevel +
                ", activity=" + activity +
                '}';
    }
}

