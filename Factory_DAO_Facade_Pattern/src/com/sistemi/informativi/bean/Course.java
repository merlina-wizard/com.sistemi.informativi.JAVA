package com.sistemi.informativi.bean;

import java.util.ArrayList;

public class Course {

    private String name;

    private String location;

    private ArrayList<String> languages;

    private ArrayList<String> framework;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getFramework() {
        return framework;
    }

    public void setFramework(ArrayList<String> framework) {
        this.framework = framework;
    }

    public Course(String name, String location, ArrayList<String> languages, ArrayList<String> framework) {
        this.name = name;
        this.location = location;
        this.languages = languages;
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", languages=" + languages +
                ", framework=" + framework +
                '}';
    }
}
