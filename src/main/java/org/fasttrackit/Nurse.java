package org.fasttrackit;

public class Nurse extends MedicalStaff {

    private int bill;

    public Nurse(String name, boolean availability, int bill) {
        super(name, availability);
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
