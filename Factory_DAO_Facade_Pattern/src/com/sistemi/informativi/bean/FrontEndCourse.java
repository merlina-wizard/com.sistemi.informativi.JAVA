package com.sistemi.informativi.bean;

import java.util.ArrayList;

public class FrontEndCourse extends Course{

    private String stylingLibrary;

    public String getStylingLibrary() {
        return stylingLibrary;
    }

    public void setStylingLibrary(String stylingLibrary) {
        this.stylingLibrary = stylingLibrary;
    }

    public FrontEndCourse(String name, String location, ArrayList<String> languages, ArrayList<String> framework, String stylingLibrary) {
        super(name, location, languages, framework);
        this.stylingLibrary = stylingLibrary;
    }

    @Override
    public String toString() {
        return "FrontEndCourse{" +
                "stylingLibrary='" + stylingLibrary + '\'' +
                '}';
    }
}
