package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.order.management.model.entities.Status;

import java.util.List;
@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {

    List<Status> findAllByStatus(String status);
}
