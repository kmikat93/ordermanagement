package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.order.management.model.entities.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
// TODO możliwe do usunięcia
}
