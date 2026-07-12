package za.ac.cput.redesigned_store_inventory_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.redesigned_store_inventory_manager.domain.Category;

/**
 *
 * @author Jayden
 */
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
