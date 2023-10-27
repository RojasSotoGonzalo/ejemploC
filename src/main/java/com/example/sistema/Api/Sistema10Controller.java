package com.example.sistema.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema10DTO;
import com.example.sistema.Service.Sistema10Service;

@RestController
@RequestMapping("/api/sistema_10")
public class Sistema10Controller {
    @Autowired
    private final Sistema10Service sistema10Service;

    public Sistema10Controller(Sistema10Service sistema10Service) {
        this.sistema10Service = sistema10Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema10DTO> data = sistema10Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}
