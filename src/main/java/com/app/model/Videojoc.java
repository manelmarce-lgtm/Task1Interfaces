/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author manue
 */
public class Videojoc {
    private String titol;
    private String genere;

    public Videojoc(String titol, String genere) {
        this.titol = titol;
        this.genere = genere;
    }

    public String getTitol() {
        return titol;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return titol;
    }
    
    
}
