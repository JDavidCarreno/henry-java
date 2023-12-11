package com.henry.ejemploapirest.controller;

import com.henry.ejemploapirest.model.Elemento;
import com.henry.ejemploapirest.service.ElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private ElementoService elementoService;

    @Autowired
    public ApiController(ElementoService elementoService) {
        this.elementoService = elementoService;
    }

    @PostMapping("/crear")
    public ResponseEntity<Elemento> createElement(@RequestBody Elemento elemento) {
        return ResponseEntity.ok(elementoService.crearElemento(elemento));
    }

    @GetMapping("/elementos")
    public ResponseEntity<List<Elemento>> obtenerElementos(){
        return ResponseEntity.ok(elementoService.obtenerElementos());
    }
}
