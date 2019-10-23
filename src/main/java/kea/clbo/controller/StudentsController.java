package kea.clbo.controller;

import kea.clbo.model.Student;
import kea.clbo.repository.StudentsArraylistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentsController {


    private StudentsArraylistRepository studentsRepo = new StudentsArraylistRepository();

    public StudentsController(){

    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("students_data", studentsRepo.readAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student){ // @ModelAttribute("name") String name
        studentsRepo.create(student);
        return "redirect:/";
    }

    @GetMapping("/about")
    public String about___xxx(){
        return "about";
    }


}
