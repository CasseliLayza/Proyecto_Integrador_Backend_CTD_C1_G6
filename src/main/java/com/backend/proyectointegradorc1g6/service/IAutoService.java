package com.backend.proyectointegradorc1g6.service;

import com.backend.proyectointegradorc1g6.dto.input.AutoDtoInput;
import com.backend.proyectointegradorc1g6.dto.output.AutoDtoOut;
import com.backend.proyectointegradorc1g6.exception.MatriculaDuplicadaException;
import com.backend.proyectointegradorc1g6.exception.ResourceNotFoundException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IAutoService {

    AutoDtoOut registrarAutoS3(String autoDtoInput, List<MultipartFile> imagenes, int indiceImagenPrincipal) throws MatriculaDuplicadaException, JsonProcessingException;
    AutoDtoOut registrarAuto(AutoDtoInput autoDtoInput) throws MatriculaDuplicadaException;

    List<AutoDtoOut> listarAutos();

    AutoDtoOut buscarAuto(Long id);

    AutoDtoOut actualizarAutoS3(String autoDtoInput, List<MultipartFile> imagenes, int indiceImagenPrincipal, Long id) throws MatriculaDuplicadaException, JsonProcessingException, ResourceNotFoundException;
    AutoDtoOut actualizarAuto(AutoDtoInput autoDtoInput, Long id) throws ResourceNotFoundException;

    void eliminarAuto(Long id) throws ResourceNotFoundException;

}
