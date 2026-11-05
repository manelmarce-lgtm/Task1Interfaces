/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author manue
 */
public class GestorLloguers {
    private static GestorLloguers instance;
    private List<Usuari> usuaris = new ArrayList<>();
    private List<Videojoc> jocs = new ArrayList<>();
    private List<Lloguer> lloguers = new ArrayList<>();

    private GestorLloguers() {
        usuaris.add(new Usuari("Prova", "Prova"));
        jocs.add(new Videojoc("Prova","Prova",0, 0, 0, 0));
    }
    
    public static GestorLloguers getInstance(){
        if(instance == null){
            instance = new GestorLloguers();
        }
        return instance;
    }
    public List<Usuari> getUsuaris() { return usuaris; }
    public List<Videojoc> getJocs() { return jocs; }
    public List<Lloguer> getLloguers() { return lloguers; }

    public void afegirLloguer(Lloguer lloguer) {
        lloguers.add(lloguer);
    }

    public void afegirUsuari(Usuari usuari) {
        usuaris.add(usuari);
    }

    public void afegirJoc(Videojoc nouJoc) {
        jocs.add(nouJoc);
    }
    
}
