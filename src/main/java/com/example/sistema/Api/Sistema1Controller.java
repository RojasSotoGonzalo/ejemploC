package com.example.sistema.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema1DTO;
import com.example.sistema.Service.Sistema1Service;

import java.util.List;

@RestController
@RequestMapping("/api/sistema_1")
public class Sistema1Controller {
    @Autowired
    private final Sistema1Service sistema1Service;

    public Sistema1Controller(Sistema1Service sistema1Service) {
        this.sistema1Service = sistema1Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema1DTO> data = sistema1Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}