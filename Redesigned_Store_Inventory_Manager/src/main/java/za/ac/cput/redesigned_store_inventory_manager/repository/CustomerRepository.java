package za.ac.cput.redesigned_store_inventory_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.redesigned_store_inventory_manager.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
