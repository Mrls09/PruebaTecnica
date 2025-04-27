package com.rocket_code.pruebatecnica.entity;

public class Doctor {
    private Long id;
    private String name;
    private String specialty;

    public Doctor(Long id, String specialty, String name) {
        this.id = id;
        this.specialty = specialty;
        this.name = name;
    }

    public Doctor() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
