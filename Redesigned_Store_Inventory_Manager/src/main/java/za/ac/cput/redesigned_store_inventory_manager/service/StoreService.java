package za.ac.cput.redesigned_store_inventory_manager.service;

/**
 *
 * @author Zacharia Dipudi
 */
import org.springframework.stereotype.Service;
import za.ac.cput.redesigned_store_inventory_manager.domain.Store;
import za.ac.cput.redesigned_store_inventory_manager.repository.StoreRepository;

import java.util.List;
import java.util.Optional;
@Service
public class StoreService implements IStoreService {
    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }


    @Override
    public Store create(Store store) {
        return storeRepository.save(store);
    }


    @Override
    public Store read(String storeId) {
        return storeRepository.findById(storeId).orElse(null);
    }

    @Override
    public Store update(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public boolean delete(String storeId) {
        storeRepository.deleteById(storeId);
        return true;
    }
    @Override
    public List<Store> getAll() {
        return storeRepository.findAll();
    }
}





