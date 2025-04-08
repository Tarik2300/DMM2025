package com.example.dmm2025.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ResRepo {

    @Autowired
    JdbcTemplate template; // Using Spring's JdbcTemplate to handle database operations

}
