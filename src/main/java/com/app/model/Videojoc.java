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
    private int unitatsPS5;
    private int unitatsXbox;
    private int unitatsPC;
    private int unitatsSwitch2;

    public Videojoc(String titol, String genere, int unitatsPS5, int unitatsXbox, int unitatsPC, int unitatsSwitch2) {
        this.titol = titol;
        this.genere = genere;
        this.unitatsPS5 = unitatsPS5;
        this.unitatsXbox = unitatsXbox;
        this.unitatsPC = unitatsPC;
        this.unitatsSwitch2 = unitatsSwitch2;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setUnitatsPS5(int unitatsPS5) {
        this.unitatsPS5 = unitatsPS5;
    }

    public void setUnitatsXbox(int unitatsXbox) {
        this.unitatsXbox = unitatsXbox;
    }

    public void setUnitatsPC(int unitatsPC) {
        this.unitatsPC = unitatsPC;
    }

    public void setUnitatsSwitch2(int unitatsSwitch2) {
        this.unitatsSwitch2 = unitatsSwitch2;
    }

    
    public String getTitol() {
        return titol;
    }

    public String getGenere() {
        return genere;
    }

    public int getUnitatsPS5() {
        return unitatsPS5;
    }

    public int getUnitatsXbox() {
        return unitatsXbox;
    }

    public int getUnitatsPC() {
        return unitatsPC;
    }

    public int getUnitatsSwitch2() {
        return unitatsSwitch2;
    }
    
    
    @Override
    public String toString() {
        return titol;
    }
    
    
}
