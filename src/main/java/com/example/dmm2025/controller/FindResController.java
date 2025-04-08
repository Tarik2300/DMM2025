package com.example.dmm2025.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindResController {

    @GetMapping("/FindRes")
    public String findres() {
        return "/FindRes";
    }
}
