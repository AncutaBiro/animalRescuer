package org.fasttrackit;

public class VeterinaryClinic {

    private String address;
    private String name;
    private int distance;
    private MedicalStaff medicalstaff;

    public VeterinaryClinic(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public MedicalStaff getMedicalstaff() {
        return medicalstaff;
    }

    public void setMedicalstaff(MedicalStaff medicalstaff) {
        this.medicalstaff = medicalstaff;
    }
}
