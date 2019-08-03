package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.order.management.model.entities.Department;
import pl.order.management.model.entities.Position;
import pl.order.management.model.entities.User;
import pl.order.management.model.repositories.UserRepository;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @GetMapping
    public String prepareRegistrationPage(){
        return "registration-form";
    }

    @PostMapping
    private String processRegistrationPage(String userName,
                                           String password,
                                           String firstName,
                                           String lastName,
                                           String eMail,
                                           Department department,
                                           Position position){
        User user = new User();

        user.setUsername(userName);
        user.setPassword(passwordEncoder.encode(password));
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.seteMail(eMail);
        user.setActive(true);
        user.setDepartmentId(department);
        user.setPositionId(position);

        userRepository.save(user);

        return "redirect:/";


    }
}
