package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.order.management.model.entities.Position;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position,Long> {


    List<Position> findAllByOrderById();

    Position findPositionByPositions(String name);
}
