package pl.order.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Order;
import pl.order.management.model.repositories.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {

    private OrderRepository orderRepository;

    public HomePageController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public String prepareHomePage(Model model){
        List<Order> allByOrderByDateTimeDesc = orderRepository.findAllByOrderByDateTimeDesc();
        model.addAttribute("orders", allByOrderByDateTimeDesc);
        return "home-page";
    }
}
