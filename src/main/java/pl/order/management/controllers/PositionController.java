package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Position;
import pl.order.management.model.repositories.PositionRepository;

@Controller
@RequestMapping("/position")
public class PositionController {

    private PositionRepository positionRepository;

    @Autowired
    public PositionController(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @GetMapping
    public String processPositionAddPage() {
        return "add-position";
    }
    @PostMapping
    public String addPosition(String name){
        Position position = new Position();
        position.setPositions(name);
        positionRepository.save(position);
        return "redirect:/";
    }
}
