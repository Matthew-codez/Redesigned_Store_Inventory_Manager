package za.ac.cput.redesigned_store_inventory_manager.service;

/**
 *
 * @author Zacharia Dipudi
 */
import za.ac.cput.redesigned_store_inventory_manager.domain.Store;
import za.ac.cput.redesigned_store_inventory_manager.repository.StoreRepository;

import java.util.List;
import java.util.Optional;

public class StoreService implements IStoreService{
    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store save(Store store) {
        if (store == null) return null;
        return storeRepository.save(store);
    }

    @Override
    public Optional<Store> findById(String Id) {
        if (Id == null) return null;
        return storeRepository.findById(Id);
    }

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        if (id == null) return;
        storeRepository.deleteById(id);
    }

    @Override
    public boolean existsById(String id) {
        if (id == null) return false;
        return storeRepository.existsById(id);
    }


}

