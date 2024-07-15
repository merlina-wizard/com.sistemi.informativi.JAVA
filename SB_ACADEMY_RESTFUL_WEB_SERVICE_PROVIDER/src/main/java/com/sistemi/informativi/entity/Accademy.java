package com.sistemi.informativi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.BatchSize;

import java.io.Serializable;

@Entity
public class Accademy implements Serializable {

    @Id
    @Column(length = 4)
    private String code;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(name="city_location", length = 50)
    private String cityLocation;


    @Column(name = "students_name")
    private int studentsNumber;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }

    protected Accademy() {
    }

    public Accademy(String code, int studentsNumber, String cityLocation, String title) {
        this.code = code;
        this.studentsNumber = studentsNumber;
        this.cityLocation = cityLocation;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Accademy{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", cityLocation='" + cityLocation + '\'' +
                ", studentsNumber=" + studentsNumber +
                '}';
    }
}
