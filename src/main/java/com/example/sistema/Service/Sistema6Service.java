package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema6DTO;
import com.example.sistema.Entity.Sistema6Entity;
import com.example.sistema.Repository.Sistema6Repository;

@Service
public class Sistema6Service {
    @Autowired
    private final Sistema6Repository sistema6Repository;

    public Sistema6Service(Sistema6Repository sistema6Repository) {
        this.sistema6Repository = sistema6Repository;
    }

    public List<Sistema6DTO> getAllData() {
        List<Sistema6Entity> entities = sistema6Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema6DTO convertToDTO(Sistema6Entity entity) {
        Sistema6DTO dto = new Sistema6DTO();
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
