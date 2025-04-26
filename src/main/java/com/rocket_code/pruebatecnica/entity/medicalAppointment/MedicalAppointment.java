package com.rocket_code.pruebatecnica.entity.medicalAppointment;

import com.rocket_code.pruebatecnica.entity.doctor.Doctor;
import com.rocket_code.pruebatecnica.entity.patient.Patient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class MedicalAppointment {
    private UUID uuid;
    private LocalDateTime date;
    private Doctor doctor;
    private Patient patient;


}
