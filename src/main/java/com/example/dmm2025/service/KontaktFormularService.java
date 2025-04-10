package com.example.dmm2025.service;

import com.example.dmm2025.model.KontaktFormular;
import com.example.dmm2025.repo.KontaktFormularRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KontaktFormularService {
    @Autowired
    private KontaktFormularRepo kontaktFormularRepo;

    public void gemKontaktFormular(KontaktFormular kontakt) {
        kontaktFormularRepo.gemKontaktFormular(kontakt);
    }
}