package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.order.management.model.entities.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findAllByOrderByDateTimeDesc();
    List<Order> findAllByUserIdUsernameOrderByDateTime(String username);
}
