package kea.clbo.controller;

import kea.clbo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentsController {

    List<Student> students = new ArrayList<>();

    public StudentsController(){
        students.add(new Student(1, "Claus"));
        students.add(new Student(2, "Anna"));
        students.add(new Student(3, "Peter"));
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("students_data", students);
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student){ // @ModelAttribute("name") String name
        student.setId(students.size()+1);
        students.add(student);
        return "redirect:/";
    }

    @GetMapping("/about")
    public String about___xxx(){
        return "about";
    }


}
