package com.sistemi.informativi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Emplyee implements Serializable {

    @Id
    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last:name")
    private String lastName;

    @Column(name = "experience_years")
    private int experienceYears;

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Emplyee(String passportNumber, String firstName, int experienceYears, String lastName) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.experienceYears = experienceYears;
        this.lastName = lastName;
    }

    protected Emplyee() {
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "passportNumber='" + passportNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
