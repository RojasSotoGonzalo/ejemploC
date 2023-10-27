package com.example.sistema.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema2DTO;
import com.example.sistema.Entity.Sistema2Entity;

import com.example.sistema.Repository.Sistema2Repository;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class Sistema2Service {
    @Autowired
    private final Sistema2Repository sistema2Repository;

    public Sistema2Service(Sistema2Repository sistema2Repository) {
        this.sistema2Repository = sistema2Repository;
    }

    public List<Sistema2DTO> getAllData() {
        List<Sistema2Entity> entities = sistema2Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema2DTO convertToDTO(Sistema2Entity entity) {
        Sistema2DTO dto = new Sistema2DTO();
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
