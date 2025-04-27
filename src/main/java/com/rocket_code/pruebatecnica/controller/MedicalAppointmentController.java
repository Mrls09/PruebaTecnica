package com.rocket_code.pruebatecnica.controller;

import com.rocket_code.pruebatecnica.entity.MedicalAppointment;
import com.rocket_code.pruebatecnica.service.MedicalAppointmentService;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(value = "*", maxAge = 3600)
public class MedicalAppointmentController {

    @Autowired
    private MedicalAppointmentService appointmentService;

    @GetMapping("/get-all")
    public Response<List<MedicalAppointment>> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Response<MedicalAppointment> getAppointmentById(@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping("/create")
    public Response<String> createAppointment(@RequestBody MedicalAppointment appointment) {
        return appointmentService.addAppointment(appointment);
    }

    @PutMapping("/update/{id}")
    public Response<String> updateAppointment(@PathVariable Long id, @RequestBody MedicalAppointment appointment) {
        appointment.setId(id);
        return appointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public Response<String> deleteAppointment(@PathVariable Long id) {
        return appointmentService.deleteAppointment(id);
    }
}
