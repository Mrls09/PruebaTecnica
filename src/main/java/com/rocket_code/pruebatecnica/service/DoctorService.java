package com.rocket_code.pruebatecnica.service;

import com.rocket_code.pruebatecnica.entity.Doctor;
import com.rocket_code.pruebatecnica.mapper.DoctorMapper;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    /**
     * Obtiene todos los doctores.
     *
     * @return una lista de doctores.
     */
    public Response<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = doctorMapper.findAll();
        return new Response<>(doctors, "Lista de doctores obtenida correctamente", 200, true);
    }
    /**
     * Obtiene un doctor por su ID.
     *
     * @param id el ID del doctor.
     * @return el doctor correspondiente al ID.
     */
    public Response<Doctor> getDoctorById(long id) {
        Doctor doctor = doctorMapper.findById(id);
        if (doctor != null) {
            return new Response<>(doctor, "Doctor encontrado", 200, true);
        } else {
            return new Response<>(null, "Doctor no encontrado", 404, false);
        }
    }
    /**
     * Agrega un nuevo doctor.
     *
     * @param doctor el doctor a agregar.
     * @return un mensaje de éxito.
     */
    public Response<String> addDoctor(Doctor doctor) {
        doctorMapper.insert(doctor);
        return new Response<>(null, "Doctor creado exitosamente", 201, true);
    }
    /**
     * Actualiza un doctor existente.
     *
     * @param doctor el doctor a actualizar.
     * @return un mensaje de éxito.
     */
    public Response<String> updateDoctor(Doctor doctor) {
        doctorMapper.update(doctor);
        return new Response<>(null, "Doctor actualizado exitosamente", 200, true);
    }
    /**
     * Elimina un doctor por su ID.
     *
     * @param id el ID del doctor a eliminar.
     * @return un mensaje de éxito.
     */
    public Response<String> deleteDoctor(long id) {
        doctorMapper.delete(id);
        return new Response<>(null, "Doctor eliminado exitosamente", 200, true);
    }
}
