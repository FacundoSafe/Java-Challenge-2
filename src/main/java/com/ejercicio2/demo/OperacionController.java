package com.ejercicio2.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio2.classes.TasaOperacion;
import com.ejercicio2.models.*;

@RestController
public class OperacionController {

	@PostMapping("/calcular-tasa")
    public ResponseEntity<OperacionTasaResponse> calcularTasa(@RequestBody OperacionTasaRequest request) {
        try {
            OperacionTasaResponse response = TasaOperacion.calcularTasaOperacion(request.getMarca(), request.getImporte());
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new OperacionTasaResponse());
        }
    }
}
