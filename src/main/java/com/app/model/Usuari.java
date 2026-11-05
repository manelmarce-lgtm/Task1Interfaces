/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author manue
 */
public class Usuari {
    private String nom;
    private String cognoms;
    
    public Usuari(String nom, String cognoms){
        this.nom = nom;
        this.cognoms = cognoms;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    @Override
    public String toString() {
        return nom + " " + cognoms;
    }
    
   
}
