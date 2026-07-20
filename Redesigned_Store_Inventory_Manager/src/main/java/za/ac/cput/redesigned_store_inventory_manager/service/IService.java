package za.ac.cput.redesigned_store_inventory_manager.service;

import java.util.List;

public interface IService<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
    List<T> getAll();
}
