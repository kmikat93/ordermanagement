package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import pl.order.management.model.entities.Order;
import pl.order.management.model.repositories.OrderRepository;

import java.security.Principal;
import java.util.List;

@Controller
public class UserOrderController {

    private OrderRepository orderRepository;

    @Autowired
    public UserOrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String showUserOrders (Model model, Principal principal) {
        String username = principal.getName();
        List<Order> orders = orderRepository.findAllByUserIdUsernameOrderByDateTime(username);
        model.addAttribute("orders", orders);
        return "user-orders-page";
    }
}
