package dao;

import java.util.List;

public interface CRUD <T, K, L>{
    void create(L l);
    List<L> getAll();
    void update(T t);
    void delete(K k);
}
