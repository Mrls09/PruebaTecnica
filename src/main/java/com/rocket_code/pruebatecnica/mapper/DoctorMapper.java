package com.rocket_code.pruebatecnica.mapper;

import com.rocket_code.pruebatecnica.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorMapper {

    Doctor findById(long id);

    List<Doctor> findAll();

    void insert(Doctor doctor);

    void update(Doctor doctor);

    void delete(Long id);

}
