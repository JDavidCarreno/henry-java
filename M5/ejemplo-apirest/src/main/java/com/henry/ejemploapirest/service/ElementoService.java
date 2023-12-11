package com.henry.ejemploapirest.service;

import com.henry.ejemploapirest.model.Elemento;

import java.util.List;

public interface ElementoService {
    Elemento crearElemento(Elemento elemento);
    List<Elemento> obtenerElementos();
}
