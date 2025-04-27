package com.rocket_code.pruebatecnica.mapper;

import com.rocket_code.pruebatecnica.entity.MedicalAppointment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalAppointmentMapper {

    List<MedicalAppointment> findAll();

    MedicalAppointment findById(Long id);

    void insert(MedicalAppointment appointment);

    void update(MedicalAppointment appointment);

    void delete(Long id);
}
