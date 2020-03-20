package org.fasttrackit;

public class Nurse extends MedicalStaff {

    int bill;

    public Nurse(String name, boolean availability, int bill) {
        super(name, availability);
        this.bill = bill;
    }
}
