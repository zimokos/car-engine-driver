package com.company.professions;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int experience) {
        super(fullName);
        this.experience = experience;
    }

    public Driver() {
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
