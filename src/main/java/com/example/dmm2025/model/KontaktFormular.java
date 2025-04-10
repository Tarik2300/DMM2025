package com.example.dmm2025.model;

public class KontaktFormular {
    private Long id; // Identifikator for hver kontaktformular
    private String navn; // Brugerens navn
    private String email; // Brugerens email
    private String telefon; // Brugerens telefonnummer
    private String besked; // Brugerens besked

    // Standard tom constructor
    public KontaktFormular() {
    }

    // Constructor med alle felter
    public KontaktFormular(Long id, String navn, String email, String telefon, String besked) {
        this.id = id;
        this.navn = navn;
        this.email = email;
        this.telefon = telefon;
        this.besked = besked;
    }

    // Getters og setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getBesked() {
        return besked;
    }

    public void setBesked(String besked) {
        this.besked = besked;
    }
}
