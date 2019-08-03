package pl.order.management.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.order.management.model.entities.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByUsername(String username);

    User findUserByUsername(String username);
}
