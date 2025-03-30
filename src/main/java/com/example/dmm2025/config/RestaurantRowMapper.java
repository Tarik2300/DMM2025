package com.example.dmm2025.config;

import com.example.dmm2025.ENUM.FoodType;
import com.example.dmm2025.model.Restaurant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantRowMapper implements RowMapper<Restaurant> {
    @Override
    public Restaurant mapRow(ResultSet rs, int rowNum) throws SQLException {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(rs.getLong("id"));
        restaurant.setName(rs.getString("name"));
        restaurant.setAddress(rs.getString("address"));
        restaurant.setFoodType(FoodType.valueOf(rs.getString("foodType")));
        restaurant.setVegetarian(rs.getInt("isVegetarian") != 0); // Explicitly converting 1/0 to true/false
        return restaurant;
    }
}
