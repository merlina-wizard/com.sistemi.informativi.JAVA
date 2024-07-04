package com.sistemi.informarivi.informativi.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
