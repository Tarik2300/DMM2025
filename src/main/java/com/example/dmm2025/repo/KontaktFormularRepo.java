package com.example.dmm2025.repo;

import com.example.dmm2025.model.KontaktFormular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KontaktFormularRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void gemKontaktFormular(KontaktFormular kontakt) {
        String sql = "INSERT INTO kontakt_formular (navn, email, telefon, besked) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, kontakt.getNavn(), kontakt.getEmail(), kontakt.getTelefon(), kontakt.getBesked());
    }
}
