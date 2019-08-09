package pl.order.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Announcement;
import pl.order.management.model.repositories.AnnouncementRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {

    private AnnouncementRepository announcementRepository;

    public HomePageController(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @GetMapping
    public String prepareHomePage(Model model){
        List<Announcement> allAnnouncementsOrderById = announcementRepository.findAllByOrderById();

        //TODO You need to figure out how to rotate sorting so that the items are rearranged and how to change the date format
        model.addAttribute("announcements", allAnnouncementsOrderById);

        return "home-page";
    }
}
