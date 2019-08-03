package pl.order.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.order.management.model.entities.Department;
import pl.order.management.model.repositories.DepartmentRepository;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping
    public String processDepartmentAddPage(){
        return "add-department";
    }

    @PostMapping
    public String addDepartment(String name){

        Department department = new Department();

        department.setDepartment(name);

        departmentRepository.save(department);

        return "redirect:/";
    }

}
