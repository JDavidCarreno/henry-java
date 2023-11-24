package org.example.dao;

import org.example.entities.Student;

import java.util.List;

public interface CRUD <T, K>{
    void insert(T t);
    void delete(T t);
    void update(T t);
    T findStudentById(K k);
    List<T> getAll();
}
