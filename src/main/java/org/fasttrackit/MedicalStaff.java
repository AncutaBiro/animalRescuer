package org.fasttrackit;

public class MedicalStaff {

    String name;
    String gender;
    String specialty;
    boolean availability;
    int bill;

    // folosirea constructorilor
    public MedicalStaff (String name, String specialty, boolean availability) {
        this.name = name;
        this.specialty = specialty;
        this.availability = availability;
    }

}
