package za.ac.cput.redesigned_store_inventory_manager.repository;

/*
 EmployeeRepository.java
 Employee Repository interface
 Author: Templeton Liyabona Dyantyi (222623047)
 Date: 12 July 2026
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.redesigned_store_inventory_manager.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
