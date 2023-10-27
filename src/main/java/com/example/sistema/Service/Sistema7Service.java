package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema7DTO;
import com.example.sistema.Entity.Sistema7Entity;
import com.example.sistema.Repository.Sistema7Repository;

@Service
public class Sistema7Service {
    @Autowired
    private final Sistema7Repository sistema7Repository;

    public Sistema7Service(Sistema7Repository sistema7Repository) {
        this.sistema7Repository = sistema7Repository;
    }

    public List<Sistema7DTO> getAllData() {
        List<Sistema7Entity> entities = sistema7Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema7DTO convertToDTO(Sistema7Entity entity) {
        Sistema7DTO dto = new Sistema7DTO();
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
