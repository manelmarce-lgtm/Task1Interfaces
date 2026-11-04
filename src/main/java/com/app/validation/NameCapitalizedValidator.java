/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.validation;

/**
 *
 * @author manue
 */
public class NameCapitalizedValidator {
    /**
     * Comprova si el text és vàlid (no està buit i comença amb majúscula).
     */
    public static boolean esValid(String text) {
        // 1. Si està buit o és null, no és vàlid
        if (text == null || text.trim().isEmpty()) {
            return false;
        }

        // 2. Comprovem si la primera lletra és majúscula
        char primeraLletra = text.trim().charAt(0);
        return Character.isUpperCase(primeraLletra);
    }
}
