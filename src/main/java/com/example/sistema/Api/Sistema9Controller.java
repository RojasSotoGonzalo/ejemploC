package com.example.sistema.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema9DTO;
import com.example.sistema.Service.Sistema9Service;

@RestController
@RequestMapping("/api/sistema_9")
public class Sistema9Controller {
    @Autowired
    private final Sistema9Service sistema9Service;

    public Sistema9Controller(Sistema9Service sistema9Service) {
        this.sistema9Service = sistema9Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema9DTO> data = sistema9Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}
