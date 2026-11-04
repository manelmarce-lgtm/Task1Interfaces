/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author manue
 */
public class Lloguer {
    private int numRegistre;
    private Videojoc joc;
    private Usuari usuari;
    private String Plataforma;
    private String DataInici;
    private String DataPrevista;

    public int getNumRegistre() {
        return numRegistre;
    }

    public Videojoc getVideojoc() {
        return joc;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public String getDataInici() {
        return DataInici;
    }

    public String getDataPrevista() {
        return DataPrevista;
    }
   
    
}
