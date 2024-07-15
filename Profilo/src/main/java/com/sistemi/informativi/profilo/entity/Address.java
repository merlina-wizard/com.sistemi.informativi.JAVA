package com.sistemi.informativi.profilo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Address {

    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    private Profile profile;

    private String address;

    private String city;

    @Size(min = 5, max = 5)
    private String cap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public @Size(min = 5, max = 5) String getCap() {
        return cap;
    }

    public void setCap(@Size(min = 5, max = 5) String cap) {
        this.cap = cap;
    }

    public Address(String cap, String city, Profile profile, String address) {
        this.cap = cap;
        this.city = city;
        this.profile = profile;
        this.address = address;
    }

    public Address() {}

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", profile=" + profile +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", cap='" + cap + '\'' +
                '}';
    }
}
