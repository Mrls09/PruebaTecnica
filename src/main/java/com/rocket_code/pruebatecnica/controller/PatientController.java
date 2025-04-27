package com.rocket_code.pruebatecnica.controller;


import com.rocket_code.pruebatecnica.entity.Patient;
import com.rocket_code.pruebatecnica.service.PatientService;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin(value = "*", maxAge = 3600)
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/get-all")
    public Response<List<Patient>> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Response<Patient> getPatientById(@PathVariable long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping("/create")
    public Response<String> createPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @PutMapping("/update/{id}")
    public Response<String> updatePatient(@PathVariable long id, @RequestBody Patient patient) {
        patient.setId(id);
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public Response<String> deletePatient(@PathVariable long id) {
        return patientService.deletePatient(id);
    }
}