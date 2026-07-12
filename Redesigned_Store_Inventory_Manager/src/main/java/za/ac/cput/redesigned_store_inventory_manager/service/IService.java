package za.ac.cput.redesigned_store_inventory_manager.service;

import java.util.List;
import java.util.Optional;

public interface IService<T, ID> {

    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void deleteById(ID id);
    boolean existsById(ID id);
}