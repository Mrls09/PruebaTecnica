package com.rocket_code.pruebatecnica.entity.doctor;

import java.util.UUID;

public class Doctor {
    private UUID uuid;
    private String name;
    private String specialty;

    public Doctor(UUID uuid, String specialty, String name) {
        this.uuid = uuid;
        this.specialty = specialty;
        this.name = name;
    }

    public Doctor() {
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
