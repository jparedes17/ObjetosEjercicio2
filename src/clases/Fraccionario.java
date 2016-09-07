/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pared
 */
public class Fraccionario {
    
    private int numerador;
    private int denominador;
    private int mixto;
    
    public Fraccionario (int numerador, int denominador, int mixto)
    {
        this.numerador= numerador;
        this.denominador= denominador;
        this.mixto= mixto;
        
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getMixto() {
        return mixto;
    }

    public void setMixto(int mixto) {
        this.mixto = mixto;
    }
}

