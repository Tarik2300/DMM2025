package com.example.dmm2025.controller;

import com.example.dmm2025.model.Restaurant;
import com.example.dmm2025.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ResController {

    @Autowired
    private ResService resService;

    @GetMapping("/")
    public String displayRestaurants(Model model) {
        List<Restaurant> restaurantList = resService.fetchAllRestaurants();
        model.addAttribute("restaurants", restaurantList);
        return "index";
    }

}
