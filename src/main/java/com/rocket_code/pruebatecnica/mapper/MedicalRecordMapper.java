package com.rocket_code.pruebatecnica.mapper;

import com.rocket_code.pruebatecnica.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalRecordMapper {

    List<MedicalRecord> findAll();

    MedicalRecord findById(Long id);

    List<MedicalRecord> findByPatientId(Long patientId);

    List<MedicalRecord> findByDoctorId(Long doctorId);

    void insert(MedicalRecord medicalRecord);

    void update(MedicalRecord medicalRecord);

    void delete(Long id);
}
