package dao;

import dao.dto.ProductDto;
import entities.Product;

import java.util.List;

public interface ProductDao {
    //create
    void insert(ProductDto product);

    //read
    List<Product> getAll();

    //update
    void update(Product product);

    void delete(int id);
}
