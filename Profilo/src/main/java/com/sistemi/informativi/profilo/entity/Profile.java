package com.sistemi.informativi.profilo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "profile")
    private List<Address> address = new ArrayList<>();



    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true, nullable = false)
    private String CF;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column()
    private String photo;

    @Column(name = "number_address",nullable = false)
    private int numberAddress;

    @Column(name = "phone_number",nullable = false)
    private int phoneNumber;

    @Column(name = "priority_level",nullable = false)
    @Size(min = 1, max = 3)
    private int priorityLevel;

    protected Profile() {
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getNumberAddress() {
        return numberAddress;
    }

    public void setNumberAddress(int numberAddress) {
        this.numberAddress = numberAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Size(min = 1, max = 3)
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(@Size(min = 1, max = 3) int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Profile(List<Address> address, String firstName, String lastName, String photo, int phoneNumber, int numberAddress, int priorityLevel,String CF) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photo = photo;
        this.phoneNumber = phoneNumber;
        this.numberAddress = numberAddress;
        this.priorityLevel = priorityLevel;
        this.CF = CF;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "address=" + address +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", photo='" + photo + '\'' +
                ", numberAddress=" + numberAddress +
                ", phoneNumber=" + phoneNumber +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
