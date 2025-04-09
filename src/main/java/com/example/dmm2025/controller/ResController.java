package com.example.dmm2025.controller;

import com.example.dmm2025.model.Restaurant;
import com.example.dmm2025.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Writer;
import java.util.List;
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

    @GetMapping("/findRes")
    public String findRestaurant(Model model) {
        List<Restaurant> restaurantList = resService.fetchAllRestaurants();
        model.addAttribute("restaurants", restaurantList);
        return "/findRes";
    }

    @GetMapping("/artikler")
    public String visArtiklerSide() {
        return "artikler"; // uden .html, Thymeleaf finder den

    }
}
