package com.rocket_code.pruebatecnica.service;

import com.rocket_code.pruebatecnica.entity.MedicalAppointment;
import com.rocket_code.pruebatecnica.mapper.MedicalAppointmentMapper;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentService {

    @Autowired
    private MedicalAppointmentMapper appointmentMapper;

    /**
     * Funcion para obtener todas las citas médicas.
     *
     * @return A Response object containing a list of MedicalAppointment objects.
     */
    public Response<List<MedicalAppointment>> getAllAppointments() {
        return new Response<>(
                appointmentMapper.findAll(),
                "Lista de citas médicas obtenida correctamente",
                200,
                true
        );
    }
    /**
     * Funcion para obtener una cita médica por su ID.
     * @param id
     * @return
     */
    public Response<MedicalAppointment> getAppointmentById(Long id) {
        MedicalAppointment appointment = appointmentMapper.findById(id);
        if (appointment != null) {
            return new Response<>(appointment, "Cita médica encontrada", 200, true);
        } else {
            return new Response<>(null, "Cita médica no encontrada", 404, false);
        }
    }
    /**
     * Funcion para agregar una nueva cita médica.
     * @param appointment
     * @return
     */
    public Response<String> addAppointment(MedicalAppointment appointment) {
        appointmentMapper.insert(appointment);
        return new Response<>(null, "Cita médica creada correctamente", 201, true);
    }
    /**
     * Funcion para actualizar una cita médica.
     * @param appointment
     * @return
     */
    public Response<String> updateAppointment(MedicalAppointment appointment) {
        appointmentMapper.update(appointment);
        return new Response<>(null, "Cita médica actualizada correctamente", 200, true);
    }
    /**
     * Funcion para eliminar una cita médica por su ID.
     * @param id
     * @return
     */
    public Response<String> deleteAppointment(Long id) {
        appointmentMapper.delete(id);
        return new Response<>(null, "Cita médica eliminada correctamente", 200, true);
    }
}
