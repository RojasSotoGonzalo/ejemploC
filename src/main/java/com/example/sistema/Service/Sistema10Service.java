package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema10DTO;
import com.example.sistema.Entity.Sistema10Entity;
import com.example.sistema.Repository.Sistema10Repository;

@Service
public class Sistema10Service {
    @Autowired
    private final Sistema10Repository sistema10Repository;

    public Sistema10Service(Sistema10Repository sistema10Repository) {
        this.sistema10Repository = sistema10Repository;
    }

    public List<Sistema10DTO> getAllData() {
        List<Sistema10Entity> entities = sistema10Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema10DTO convertToDTO(Sistema10Entity entity) {
        Sistema10DTO dto = new Sistema10DTO();
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
