package com.rocket_code.pruebatecnica.service;

import com.rocket_code.pruebatecnica.entity.Summary;
import com.rocket_code.pruebatecnica.mapper.SummaryMapper;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryService {

    @Autowired
    private SummaryMapper summaryMapper;

    /**
     * Obtiene todos los resúmenes.
     *
     * @return una lista de resúmenes.
     */
    public Response<List<Summary>> getAllSummaries() {
        return new Response<>(
                summaryMapper.findAll(),
                "Lista de resúmenes obtenida correctamente",
                200,
                true
        );
    }

    /**
     * Obtiene un resumen por su ID.
     *
     * @param id el ID del resumen.
     * @return el resumen correspondiente al ID.
     */
    public Response<Summary> getSummaryById(Long id) {
        Summary summary = summaryMapper.findById(id);
        if (summary != null) {
            return new Response<>(summary, "Resumen encontrado", 200, true);
        } else {
            return new Response<>(null, "Resumen no encontrado", 404, false);
        }
    }

    /**
     * Agrega un nuevo resumen.
     *
     * @param summary el resumen a agregar.
     * @return un mensaje de éxito.
     */
    public Response<String> addSummary(Summary summary) {
        summaryMapper.insert(summary);
        return new Response<>(null, "Resumen creado correctamente", 201, true);
    }

    /**
     * Actualiza un resumen existente.
     *
     * @param summary el resumen a actualizar.
     * @return un mensaje de éxito.
     */
    public Response<String> updateSummary(Summary summary) {
        summaryMapper.update(summary);
        return new Response<>(null, "Resumen actualizado correctamente", 200, true);
    }

    /**
     * Elimina un resumen por su ID.
     *
     * @param id el ID del resumen a eliminar.
     * @return un mensaje de éxito.
     */
    public Response<String> deleteSummary(Long id) {
        summaryMapper.delete(id);
        return new Response<>(null, "Resumen eliminado correctamente", 200, true);
    }
}
