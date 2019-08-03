package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.order.management.model.entities.Position;


public interface PositionRepository extends JpaRepository<Position,Long> {
// TODO możliwe do usunięcia
}
