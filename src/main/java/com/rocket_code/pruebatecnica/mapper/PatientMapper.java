package com.rocket_code.pruebatecnica.mapper;


import com.rocket_code.pruebatecnica.entity.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {

    Patient findById(Long id);

    List<Patient> findAll();

    void insert(Patient patient);

    void update(Patient patient);

    void delete(Long id);
}