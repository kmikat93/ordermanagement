package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Department;
import pl.order.management.model.entities.Order;
import pl.order.management.model.entities.Status;
import pl.order.management.model.repositories.DepartmentRepository;
import pl.order.management.model.repositories.OrderRepository;
import pl.order.management.model.repositories.StatusRepository;
import pl.order.management.model.repositories.UserRepository;

import java.security.Principal;

@Controller
@RequestMapping("/add-order")
public class OrderController {

    private OrderRepository orderRepository;
    private UserRepository userRepository;
    private StatusRepository statusRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository, UserRepository userRepository, StatusRepository statusRepository, DepartmentRepository departmentRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.statusRepository = statusRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping
    public String prepareNewOrderPage() {
        return "new-order-form";
    }

    @PostMapping
    public String addOrder(String title,
                           String description,
                           String department,
                           Principal principal){
        Order order = new Order();
        String userName = principal.getName();

        order.setTitle(title);
        order.setDescription(description);
        order.setStatus(statusRepository.findStatusByStatus("Nowe"));
        order.setUserId(userRepository.findUserByUsername(userName));
        order.setDepartmentId(departmentRepository.findDepartmentByDepartments(department));

        orderRepository.save(order);

        return "redirect:/";

    }
}
