package com.example.sistema.Service;

import java.util.stream.Collectors;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sistema.DTO.Sistema3DTO;
import com.example.sistema.Entity.Sistema3Entity;
import com.example.sistema.Repository.Sistema3Repository;

@Service
public class Sistema3Service {
    @Autowired
    private final Sistema3Repository sistema3Repository;

    public Sistema3Service(Sistema3Repository sistema3Repository) {
        this.sistema3Repository = sistema3Repository;
    }

    public List<Sistema3DTO> getAllData() {
        List<Sistema3Entity> entities = sistema3Repository.findAll();
        return entities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private Sistema3DTO convertToDTO(Sistema3Entity entity) {
        Sistema3DTO dto = new Sistema3DTO();
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
