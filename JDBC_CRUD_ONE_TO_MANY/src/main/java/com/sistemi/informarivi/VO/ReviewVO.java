package com.sistemi.informarivi.VO;

import java.io.Serializable;

public class ReviewVO implements Serializable {

    private String location;
    private int courseId;
    private int id;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReviewVO(String location, int courseId, int id) {
        this.location = location;
        this.courseId = courseId;
        this.id = id;
    }

    public ReviewVO(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ReviewVO{" +
                "location='" + location + '\'' +
                '}';
    }
}
