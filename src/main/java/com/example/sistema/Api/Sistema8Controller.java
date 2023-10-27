package com.example.sistema.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema8DTO;
import com.example.sistema.Service.Sistema8Service;

@RestController
@RequestMapping("/api/sistema_8")
public class Sistema8Controller {
    @Autowired
    private final Sistema8Service sistema8Service;

    public Sistema8Controller(Sistema8Service sistema8Service) {
        this.sistema8Service = sistema8Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema8DTO> data = sistema8Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}
