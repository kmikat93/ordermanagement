package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Status;
import pl.order.management.model.repositories.StatusRepository;

@Controller
@RequestMapping("/status")
public class StatusController {

    private StatusRepository statusRepository;

    @Autowired
    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @GetMapping
    public String processStatusAddPage(){
        return "add-status";
    }

    @PostMapping
    public String addStatus(String name){
        Status status = new Status();

        status.setStatus(name);

        statusRepository.save(status);

        return "redirect:/";
    }
}
