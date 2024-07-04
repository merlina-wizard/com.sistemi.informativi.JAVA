package com.sistemi.informarivi.informativi.VO;

import java.io.Serializable;

public class CustomerVO implements Serializable {

    private String name;

    private String email;

    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerVO(String email, String name, int id) {
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public CustomerVO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerVO{" +
                "name='" + name + '\'' +
                '}';
    }
}
