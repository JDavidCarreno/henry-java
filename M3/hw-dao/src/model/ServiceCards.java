package model;

import dao.CRUD;
import dao.TarjetaCreditoDaoImpl;

import java.util.ArrayList;
import java.util.List;

public class ServiceCards {
    public static void printTarjetasCredito(){
        CRUD<TarjetaCreditoDTO> tarjetas = new TarjetaCreditoDaoImpl();
        List<TarjetaCreditoDTO> lista = tarjetas.getAll();
        lista.forEach(e -> System.out.println("Numero: " + e.getNumero() + ". Titular: " + e.getTitular() + "."));
    }
}
