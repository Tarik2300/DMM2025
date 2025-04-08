package com.example.dmm2025.Repo;

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

}
