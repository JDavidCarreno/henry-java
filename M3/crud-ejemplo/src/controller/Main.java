package controller;

import dao.ProductDao;
import dao.dto.ProductDto;
import dao.impl.ProductDaoImpl;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();

/*        ProductDto productDto = new ProductDto();

        productDto.setName("xiaomi");
        productDto.setPrice(300);

        productDao.insert(productDto);*/



/*
        Product product = new Product(3, "lenovo", 301);
        productDao.update(product);*/


        productDao.delete(3);



        List<Product> products = productDao.getAll();


        products.forEach(e -> {
            System.out.println("ID: " + e.getId());
            System.out.println("Nombre: " + e.getName());
            System.out.println("Precio: " + e.getPrice());
            System.out.println("----------------");
        });

    }
}