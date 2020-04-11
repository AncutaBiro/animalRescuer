package org.fasttrackit;

public class Activity {

    private String name;
    private int durationMin;
    private int energySpent;

    public Activity(int durationMin) {
        this.durationMin = durationMin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public int getEnergySpent() {
        return energySpent;
    }

    public void setEnergySpent(int energySpent) {
        this.energySpent = energySpent;
    }
}
