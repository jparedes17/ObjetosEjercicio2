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
    
    public Fraccionario convertir (Fraccionario f2)
    {
        int num, den, mix;
        Fraccionario f;
        mix= this.mixto;
        num=(mix*this.denominador)+this.numerador;
        den= this.denominador;
        f = new Fraccionario (num, den, mix); 
        return f;
    }
    public Fraccionario convertir2 (Fraccionario f2)
    {
        int num, den, mix;
        Fraccionario f;
        
        mix=f2.mixto;
        num= (mix*f2.denominador)+f2.numerador;
        den= f2.denominador;
        f = new Fraccionario (num, den, mix);
        return f;
    }
    
    public Fraccionario suma (Fraccionario f2)
    {
        int num, den, mix;
        Fraccionario f;
        
        num= (this.numerador*f2.denominador)+(this.denominador*f2.numerador);
        den= this.denominador*f2.denominador;
        f = new Fraccionario (num, den, 1);
        return f;
        
    }
    
    public Fraccionario resta (Fraccionario f3)
    {
        int num, den, mix;
        Fraccionario f;
        
        num= (this.numerador*f3.denominador)-(this.denominador*f3.numerador);
        den= this.denominador*f3.denominador;
        f = new Fraccionario (num, den, 1);
        return f;
        
    }
    public Fraccionario multiplicacion (Fraccionario f3)
    {
        int num, den, mix;
        Fraccionario f;
        
        num= this.numerador*f3.numerador;
        den= this.denominador*f3.denominador;
        f = new Fraccionario (num, den, 1);
        return f;
        
    }
    
    public Fraccionario division (Fraccionario f3)
    {
        int num, den, mix;
        Fraccionario f;
        
        num= this.numerador*f3.denominador;
        den= this.denominador*f3.numerador;
        f = new Fraccionario (num, den, 1);
        return f;
        
    }
    
    public Fraccionario convertir3 (Fraccionario f7)
    {
        int num, den, mix;
        Fraccionario f;
        
      num= f7.numerador%f7.denominador;
      den= f7.denominador;
      mix= f7.numerador/f7.denominador;
    
    f= new Fraccionario (num, den, mix);
    return f;
        
    }
    
    public Fraccionario convertir4 (Fraccionario f3)
    {
       int num, den, mix;
       Fraccionario f;
       
       mix= (f3.mixto*f3.denominador)+f3.numerador;
       num= mix;
       den= f3.denominador;
       f = new Fraccionario (num, den, mix);
       return f;
    }
}

