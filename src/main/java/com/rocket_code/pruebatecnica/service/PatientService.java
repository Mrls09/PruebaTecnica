package com.rocket_code.pruebatecnica.service;


import com.rocket_code.pruebatecnica.entity.Patient;
import com.rocket_code.pruebatecnica.mapper.PatientMapper;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;

    /**
     * Obtiene todos los pacientes.
     *
     * @return una lista de pacientes.
     */
    public Response<List<Patient>> getAllPatients() {
        List<Patient> patients = patientMapper.findAll();
        return new Response<>(patients, "Lista de pacientes obtenida correctamente", 200, true);
    }

    /**
     * Obtiene un paciente por su ID.
     *
     * @param id el ID del paciente.
     * @return el paciente correspondiente al ID.
     */
    public Response<Patient> getPatientById(long id) {
        Patient patient = patientMapper.findById(id);
        if (patient != null) {
            return new Response<>(patient, "Paciente encontrado", 200, true);
        } else {
            return new Response<>(null, "Paciente no encontrado", 404, false);
        }
    }

    /**
     * Agrega un nuevo paciente.
     *
     * @param patient el paciente a agregar.
     * @return un mensaje de éxito.
     */
    public Response<String> addPatient(Patient patient) {
        patientMapper.insert(patient);
        return new Response<>(null, "Paciente creado exitosamente", 201, true);
    }

    /**
     * Actualiza un paciente existente.
     *
     * @param patient el paciente a actualizar.
     * @return un mensaje de éxito.
     */
    public Response<String> updatePatient(Patient patient) {
        patientMapper.update(patient);
        return new Response<>(null, "Paciente actualizado exitosamente", 200, true);
    }

    /**
     * Elimina un paciente por su ID.
     *
     * @param id el ID del paciente a eliminar.
     * @return un mensaje de éxito.
     */
    public Response<String> deletePatient(long id) {
        patientMapper.delete(id);
        return new Response<>(null, "Paciente eliminado exitosamente", 200, true);
    }
}