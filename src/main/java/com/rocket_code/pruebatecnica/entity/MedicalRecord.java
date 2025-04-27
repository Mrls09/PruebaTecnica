package com.rocket_code.pruebatecnica.entity;

import java.time.LocalDateTime;

public class MedicalRecord {
    private Long id;
    private MedicalAppointment appointment;
    private String diagnosis;
    private String treatment;
    private LocalDateTime date;
    private Long appointmentId; // Para MyBatis

    public MedicalRecord() {
    }

    public MedicalRecord(Long id, MedicalAppointment appointment, String diagnosis, String treatment, LocalDateTime date) {
        this.id = id;
        this.appointment = appointment;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MedicalAppointment getAppointment() {
        return appointment;
    }

    public void setAppointment(MedicalAppointment appointment) {
        this.appointment = appointment;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }
}
