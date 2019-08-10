package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Order;
import pl.order.management.model.repositories.OrderRepository;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/user-order")
public class UserOrderController {

    private OrderRepository orderRepository;
    private Principal principal;

    @Autowired
    public UserOrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public String showUserOrders (Model model, Principal principal) {
        String username = principal.getName();
        List<Order> orders = orderRepository.findAllByUserIdUsernameOrderByDateTime(username);
        model.addAttribute("orders", orders);
        model.addAttribute("username", username);
        return "user-orders-page";
    }
}
