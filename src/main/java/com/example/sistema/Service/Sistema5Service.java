package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema5DTO;
import com.example.sistema.Entity.Sistema5Entity;
import com.example.sistema.Repository.Sistema5Repository;

@Service
public class Sistema5Service {
    @Autowired
    private final Sistema5Repository sistema5Repository;

    public Sistema5Service(Sistema5Repository sistema5Repository) {
        this.sistema5Repository = sistema5Repository;
    }

    public List<Sistema5DTO> getAllData() {
        List<Sistema5Entity> entities = sistema5Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema5DTO convertToDTO(Sistema5Entity entity) {
        Sistema5DTO dto = new Sistema5DTO();
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
