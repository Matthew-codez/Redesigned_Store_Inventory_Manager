package za.ac.cput.redesigned_store_inventory_manager.repository;
/**
 *
 * @author Zacharia Dipudi
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.redesigned_store_inventory_manager.domain.Store;

public interface StoreRepository  extends JpaRepository<Store, String> {
}
