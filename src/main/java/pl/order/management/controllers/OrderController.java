package pl.order.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.order.management.model.entities.Department;
import pl.order.management.model.entities.Order;
import pl.order.management.model.entities.Status;
import pl.order.management.model.repositories.OrderRepository;
import pl.order.management.model.repositories.StatusRepository;
import pl.order.management.model.repositories.UserRepository;

import java.security.Principal;

@Controller
public class OrderController {

    private OrderRepository orderRepository;
    private UserRepository userRepository;

    @GetMapping
    public String prepareNewOrderPage() {
        return "new-order-form";
    }
    @PostMapping("/add-order")
    public String addOrder(String title,
                           String description,
                           String department,
                           Principal principal){
        Order order = new Order();
        String userName = principal.getName();

        order.setTitle(title);
        order.setDescription(description);
        order.setStatus(new Status("Active"));
        order.setUserId(userRepository.findUserByUsername(userName));
        order.setDepartmentId(new Department());

        orderRepository.save(order);

        return "redirect:/";

    }
}
