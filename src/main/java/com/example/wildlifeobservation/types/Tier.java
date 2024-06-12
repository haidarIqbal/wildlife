package com.example.wildlifeobservation.types;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private double gewicht;
    private double groesse;
    private int alter;
    private String genus;    
    private String geschlecht;

    // Default-Konstruktor
    public Tier() {

    }

    // Parameterisierter Konstruktor
    public Tier(double gewicht, double groesse, int alter, String genus, String geschlecht) {
        this.gewicht = gewicht;
        this.groesse = groesse;
        this.alter = alter;
        this.genus = genus;
        this.geschlecht = geschlecht;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}


