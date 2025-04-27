package com.rocket_code.pruebatecnica.entity;


public class Summary {
    private Long id;
    private String diagnosis;
    private String treatment;

    public Summary(Long id, String diagnosis, String treatment) {
        this.id = id;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }
    public Summary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
