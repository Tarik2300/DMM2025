package com.example.dmm2025.controller;

import com.example.dmm2025.model.KontaktFormular;
import com.example.dmm2025.service.KontaktFormularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/kontakt")
public class KontaktController {

    @Autowired
    private KontaktFormularService kontaktService;

    // Get-metoden for at vise formen, inkluderer en besked hvis tilgængelig
    @GetMapping
    public String visKontaktForm(Model model) {
        return "index";  // antager at din form ligger på index.html
    }

    // Post-metoden for at håndtere formularindsendelse
    @PostMapping("/send")
    public String gemKontakt(@RequestParam("navn") String navn,
                             @RequestParam("email") String email,
                             @RequestParam("telefon") String telefon,
                             @RequestParam("besked") String besked,
                             Model model) {
        KontaktFormular kontakt = new KontaktFormular();
        kontakt.setNavn(navn);
        kontakt.setEmail(email);
        kontakt.setTelefon(telefon);
        kontakt.setBesked(besked);

        kontaktService.gemKontaktFormular(kontakt);

        // Tilføjer en besked til modellen, som vises på index.html
        model.addAttribute("message", "Tak for din besked");
        return "index";  // sender brugeren tilbage til index med en besked
    }
}
