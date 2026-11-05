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
    private String plataforma;
    private String dataInici;
    private String dataPrevista;
    
    public Lloguer(int numRegistre, Videojoc joc, Usuari usuari, String plataforma, String dataInici, String dataPrevista) {
        this.numRegistre = numRegistre;
        this.joc = joc;
        this.usuari = usuari;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
        this.dataPrevista = dataPrevista;
    }

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
        return plataforma;
    }

    public String getDataInici() {
        return dataInici;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }
   
    
}  
