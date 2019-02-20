package com.example.getextra_and_putextra.SerializableObject;

import java.io.Serializable;

public class UserS implements Serializable {
    private String name;
    private String pseudo;

    public UserS() {
        super();
    }

    public UserS(String name, String pseudo) {
        this.name = name;
        this.pseudo = pseudo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
