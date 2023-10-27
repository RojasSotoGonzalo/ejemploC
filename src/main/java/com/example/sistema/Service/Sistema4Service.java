package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema4DTO;
import com.example.sistema.Entity.Sistema4Entity;
import com.example.sistema.Repository.Sistema4Repository;

@Service
public class Sistema4Service {
    @Autowired
    private final Sistema4Repository sistema4Repository;

    public Sistema4Service(Sistema4Repository sistema4Repository) {
        this.sistema4Repository = sistema4Repository;
    }

    public List<Sistema4DTO> getAllData() {
        List<Sistema4Entity> entities = sistema4Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema4DTO convertToDTO(Sistema4Entity entity) {
        Sistema4DTO dto = new Sistema4DTO();
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
