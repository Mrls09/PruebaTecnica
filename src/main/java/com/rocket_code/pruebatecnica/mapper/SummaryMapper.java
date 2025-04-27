package com.rocket_code.pruebatecnica.mapper;

import com.rocket_code.pruebatecnica.entity.Summary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SummaryMapper {

    List<Summary> findAll();

    Summary findById(Long id);

    void insert(Summary summary);

    void update(Summary summary);

    void delete(Long id);
}
