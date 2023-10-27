package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema8DTO;
import com.example.sistema.Entity.Sistema8Entity;
import com.example.sistema.Repository.Sistema8Repository;

@Service
public class Sistema8Service {
    @Autowired
    private final Sistema8Repository sistema8Repository;

    public Sistema8Service(Sistema8Repository sistema8Repository) {
        this.sistema8Repository = sistema8Repository;
    }

    public List<Sistema8DTO> getAllData() {
        List<Sistema8Entity> entities = sistema8Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema8DTO convertToDTO(Sistema8Entity entity) {
        Sistema8DTO dto = new Sistema8DTO();
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
