package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Announcement;
import pl.order.management.model.entities.User;
import pl.order.management.model.repositories.AnnouncementRepository;
import pl.order.management.model.repositories.UserRepository;

import java.security.Principal;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/announcement")
public class AnnouncementController {

    private AnnouncementRepository announcementRepository;
    private UserRepository userRepository;

    @Autowired
    public AnnouncementController(AnnouncementRepository announcementRepository, UserRepository userRepository) {
        this.announcementRepository = announcementRepository;
        this.userRepository = userRepository;
    }

    @GetMapping
    public String prepareAnnouncementForm(){

        return "add-announcement";
    }

    @PostMapping
    public String processAnnouncementAddPage(String title,
                                             String description,
                                             Principal principal){

        User user = userRepository.findUserByUsername(principal.getName());
        Announcement announcement = new Announcement();


        announcement.setTitle(title);
        announcement.setDescription(description);
        announcement.setCreator(user);
        announcement.setCreated(LocalDateTime.now());

        announcementRepository.save(announcement);

        return "redirect:/";

    }
}
