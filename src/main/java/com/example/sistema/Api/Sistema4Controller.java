package com.example.sistema.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema4DTO;
import com.example.sistema.Service.Sistema4Service;

@RestController
@RequestMapping("/api/sistema_4")
public class Sistema4Controller {
    @Autowired
    private final Sistema4Service sistema4Service;

    public Sistema4Controller(Sistema4Service sistema4Service) {
        this.sistema4Service = sistema4Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema4DTO> data = sistema4Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}
