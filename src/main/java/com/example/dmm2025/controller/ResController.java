package com.example.dmm2025.controller;

import com.example.dmm2025.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResController {

    @Autowired
    private ResService resService;

    @GetMapping("/tilmeldRes")
    public String visTilmeldSide() {
        return "tilmeldRes"; // uden .html, Thymeleaf finder den

    }
    @GetMapping("/index")
    public String visIndexSide() {
        return "index"; // uden .html, Thymeleaf finder den

    }
}