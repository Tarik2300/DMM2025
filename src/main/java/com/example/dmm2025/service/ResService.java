package com.example.dmm2025.service;

import com.example.dmm2025.repo.ResRepo;
import com.example.dmm2025.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResService {

    @Autowired
    private ResRepo resRepo;

    public List<Restaurant> fetchAllRestaurants() {
        return resRepo.fetchAllRestaurants();
    }

}