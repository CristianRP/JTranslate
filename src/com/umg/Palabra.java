/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg;

/**
 *
 * @author alumno
 */
public class Palabra {
    
    private String espanol;
    private String ingles;
    private String frances;
    
    public Palabra() {
        
    }
    
    public Palabra(String espanol, String ingles, String frances) {
        this.espanol = espanol;
        this.ingles = ingles;
        this.frances = frances;
    }

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }
    
}
