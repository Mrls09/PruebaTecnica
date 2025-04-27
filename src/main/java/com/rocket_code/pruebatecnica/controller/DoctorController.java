package com.rocket_code.pruebatecnica.controller;

import com.rocket_code.pruebatecnica.entity.Doctor;
import com.rocket_code.pruebatecnica.service.DoctorService;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(value = "*", maxAge = 3600)
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/get-all")
    public Response<List<Doctor>> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Response<Doctor> getDoctorById(@PathVariable long id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/create")
    public Response<String> createDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }
    @PutMapping("/update/{id}")
    public Response<String> updateDoctor(@PathVariable long id, @RequestBody Doctor doctor) {
        doctor.setId(id);
        return doctorService.updateDoctor(doctor);
    }

    @DeleteMapping("/delete/{id}")
    public Response<String> deleteDoctor(@PathVariable long id) {
        return doctorService.deleteDoctor(id);
    }
}
