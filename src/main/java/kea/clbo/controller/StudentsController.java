package kea.clbo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentsController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


}
