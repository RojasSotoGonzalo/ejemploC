package com.example.sistema.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema.DTO.Sistema6DTO;
import com.example.sistema.Service.Sistema6Service;

@RestController
@RequestMapping("/api/sistema_6")
public class Sistema6Controller {
    @Autowired
    private final Sistema6Service sistema6Service;

    public Sistema6Controller(Sistema6Service sistema6Service) {
        this.sistema6Service = sistema6Service;
    }

    @GetMapping
    public ResponseEntity<?> getAllData() {
        try {
            List<Sistema6DTO> data = sistema6Service.getAllData();
            return ResponseEntity.ok(data); // Devuelve una respuesta 200 OK con los datos
        } catch (Exception e) {
            // Manejo de excepción en caso de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error al obtener los datos: " + e.getMessage());
        }
    }
}
