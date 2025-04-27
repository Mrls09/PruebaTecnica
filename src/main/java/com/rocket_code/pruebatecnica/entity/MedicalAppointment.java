package com.rocket_code.pruebatecnica.entity;

import java.time.LocalDateTime;

public class MedicalAppointment {
    private Long id;
    private LocalDateTime appointmentDate;
    private Doctor doctor;
    private Patient patient;
    private Long doctorId;    // Nueva propiedad
    private Long patientId;   // Nueva propiedad

    public MedicalAppointment(Long id, LocalDateTime appointmentDate, Doctor doctor, Patient patient) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    public MedicalAppointment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Nuevos getters y setters
    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
}