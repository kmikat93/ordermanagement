package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.order.management.model.entities.Department;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
// TODO możliwe do usunięcia
}
