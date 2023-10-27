package com.example.sistema.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema1DTO;
import com.example.sistema.Entity.Sistema1Entity;
import com.example.sistema.Repository.Sistema1Repository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Sistema1Service {
    @Autowired
    private final Sistema1Repository sistema1Repository;

    public Sistema1Service(Sistema1Repository sistema1Repository) {
        this.sistema1Repository = sistema1Repository;
    }

    public List<Sistema1DTO> getAllData() {
        List<Sistema1Entity> entities = sistema1Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema1DTO convertToDTO(Sistema1Entity entity) {
        Sistema1DTO dto = new Sistema1DTO();
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