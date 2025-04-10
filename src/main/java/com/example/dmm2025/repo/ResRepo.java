package com.example.dmm2025.repo;

import com.example.dmm2025.config.RestaurantRowMapper;
import com.example.dmm2025.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResRepo {

    @Autowired
    JdbcTemplate template; // Using Spring's JdbcTemplate to handle database operations

    public List<Restaurant> fetchAllRestaurants() {
        String sql = "SELECT * FROM restaurants";
        // Using the custom RestaurantRowMapper to map the ResultSet to the Restaurant object
        List<Restaurant> restaurants = template.query(sql, new RestaurantRowMapper());
        // Optional: Debugging to check values
        restaurants.forEach(restaurant -> System.out.println("Is Vegetarian: " + restaurant.isVegetarian()));
        return restaurants;
    }
}