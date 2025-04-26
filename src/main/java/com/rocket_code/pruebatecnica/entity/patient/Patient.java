package com.rocket_code.pruebatecnica.entity.patient;

import java.util.UUID;

public class Patient {
    private UUID uuid;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient() {
    }

    public Patient(UUID uuid, String name, int age, String medicalHistory) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
