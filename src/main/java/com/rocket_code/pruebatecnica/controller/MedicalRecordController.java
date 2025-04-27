package com.rocket_code.pruebatecnica.controller;


import com.rocket_code.pruebatecnica.entity.MedicalRecord;
import com.rocket_code.pruebatecnica.service.MedicalRecordService;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-record")
@CrossOrigin(value = "*", maxAge = 3600)
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping("/get-all")
    public Response<List<MedicalRecord>> getAllMedicalRecords() {
        return medicalRecordService.getAllMedicalRecords();
    }

    @GetMapping("/{id}")
    public Response<MedicalRecord> getMedicalRecordById(@PathVariable Long id) {
        return medicalRecordService.getMedicalRecordById(id);
    }

    @GetMapping("/patient/{patientId}")
    public Response<List<MedicalRecord>> getMedicalRecordsByPatientId(@PathVariable Long patientId) {
        return medicalRecordService.getMedicalRecordsByPatientId(patientId);
    }

    @GetMapping("/doctor/{doctorId}")
    public Response<List<MedicalRecord>> getMedicalRecordsByDoctorId(@PathVariable Long doctorId) {
        return medicalRecordService.getMedicalRecordsByDoctorId(doctorId);
    }

    @PostMapping("/create")
    public Response<String> createMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
        return medicalRecordService.addMedicalRecord(medicalRecord);
    }

    @PutMapping("/update/{id}")
    public Response<String> updateMedicalRecord(@PathVariable Long id, @RequestBody MedicalRecord medicalRecord) {
        medicalRecord.setId(id);
        return medicalRecordService.updateMedicalRecord(medicalRecord);
    }

    @DeleteMapping("/delete/{id}")
    public Response<String> deleteMedicalRecord(@PathVariable Long id) {
        return medicalRecordService.deleteMedicalRecord(id);
    }
}