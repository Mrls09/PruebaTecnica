package com.rocket_code.pruebatecnica.entity;


public class Patient {
    private Long id;
    private String name;
    private int age;
    private String medical_history;

    public Patient() {
    }
    public Patient(Long id, String name, int age, String medical_history) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.medical_history = medical_history;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(String medical_history) {
        this.medical_history = medical_history;
    }
}
