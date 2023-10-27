package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema9DTO;
import com.example.sistema.Entity.Sistema9Entity;
import com.example.sistema.Repository.Sistema9Repository;

@Service
public class Sistema9Service {
    @Autowired
    private final Sistema9Repository sistema9Repository;

    public Sistema9Service(Sistema9Repository sistema9Repository) {
        this.sistema9Repository = sistema9Repository;
    }

    public List<Sistema9DTO> getAllData() {
        List<Sistema9Entity> entities = sistema9Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema9DTO convertToDTO(Sistema9Entity entity) {
        Sistema9DTO dto = new Sistema9DTO();
        dto.setGestion(entity.getGestion());
        dto.setMes(entity.getMes());
        dto.setDia(entity.getDia());
        dto.setDatoT(entity.getDatoT());
        dto.setDatoH(entity.getDatoH());
        dto.setDatoP(entity.getDatoP());
        dto.setDatoFPF(entity.getDatoFPF());
        dto.setEstado(entity.getEstado());
        return dto;
    }
}
