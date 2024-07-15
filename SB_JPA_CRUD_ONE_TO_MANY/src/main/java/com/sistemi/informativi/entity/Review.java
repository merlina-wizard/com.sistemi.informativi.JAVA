package com.sistemi.informativi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String location;

    @ManyToOne
    private Course course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Review(String location) {
        this.location = location;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Review(String location, Course course) {
        this.course = course;
        this.location = location;
    }

    protected Review() {

    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
