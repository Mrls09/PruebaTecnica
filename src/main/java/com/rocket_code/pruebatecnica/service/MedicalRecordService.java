package com.rocket_code.pruebatecnica.service;


import com.rocket_code.pruebatecnica.entity.MedicalRecord;
import com.rocket_code.pruebatecnica.mapper.MedicalRecordMapper;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    /**
     * Obtiene todos los registros médicos.
     *
     * @return una lista de registros médicos.
     */
    public Response<List<MedicalRecord>> getAllMedicalRecords() {
        return new Response<>(
                medicalRecordMapper.findAll(),
                "Lista de registros médicos obtenida correctamente",
                200,
                true
        );
    }

    /**
     * Obtiene un registro médico por su ID.
     *
     * @param id el ID del registro médico.
     * @return el registro médico correspondiente al ID.
     */
    public Response<MedicalRecord> getMedicalRecordById(Long id) {
        MedicalRecord medicalRecord = medicalRecordMapper.findById(id);
        if (medicalRecord != null) {
            return new Response<>(medicalRecord, "Registro médico encontrado", 200, true);
        } else {
            return new Response<>(null, "Registro médico no encontrado", 404, false);
        }
    }
    /**
     * Obtiene todos los registros médicos de un paciente por su ID.
     *
     * @param patientId el ID del paciente.
     * @return una lista de registros médicos del paciente.
     */
    public Response<List<MedicalRecord>> getMedicalRecordsByPatientId(Long patientId) {
        List<MedicalRecord> records = medicalRecordMapper.findByPatientId(patientId);
        return new Response<>(
                records,
                "Historial médico del paciente obtenido correctamente",
                200,
                true
        );
    }

    /**
     * Obtiene todos los registros médicos de un doctor por su ID.
     *
     * @param doctorId el ID del doctor.
     * @return una lista de registros médicos del doctor.
     */
    public Response<List<MedicalRecord>> getMedicalRecordsByDoctorId(Long doctorId) {
        List<MedicalRecord> records = medicalRecordMapper.findByDoctorId(doctorId);
        return new Response<>(
                records,
                "Historial de consultas del doctor obtenido correctamente",
                200,
                true
        );
    }

    /**
     * Agrega un nuevo registro médico.
     *
     * @param medicalRecord el registro médico a agregar.
     * @return un mensaje de éxito.
     */
    public Response<String> addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordMapper.insert(medicalRecord);
        return new Response<>(null, "Registro médico creado correctamente", 201, true);
    }

    /**
     * Actualiza un registro médico existente.
     *
     * @param medicalRecord el registro médico a actualizar.
     * @return un mensaje de éxito.
     */
    public Response<String> updateMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordMapper.update(medicalRecord);
        return new Response<>(null, "Registro médico actualizado correctamente", 200, true);
    }

    /**
     * Elimina un registro médico por su ID.
     *
     * @param id el ID del registro médico a eliminar.
     * @return un mensaje de éxito.
     */
    public Response<String> deleteMedicalRecord(Long id) {
        medicalRecordMapper.delete(id);
        return new Response<>(null, "Registro médico eliminado correctamente", 200, true);
    }
}