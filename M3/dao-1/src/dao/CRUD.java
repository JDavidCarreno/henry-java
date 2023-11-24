package dao;

import java.util.List;

public interface CRUD<T> {
    List<T> listAll();
    T findById();
    void register(T t);
    void update(T t);
    void deletePerson(int id);
}
