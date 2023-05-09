/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triqui;

/**
 *
 * @author SG701-03
 */
public class Casilla {
    private String posicion;
    private String simbolo;
 //
      
    public static final int superior_iz =1;  
     public static final int superior_med=2 ;  
     public static final int Superios_de=3;  
     public static final int cento_iz=4;
     public static final int cento_med=5;  
         public static final int centro_der=6 ;  
     public static final int bajo_iz=7;  
     public static final int bajo_med=8 ;  
             public static final int bajo_der =9; 
             
             
             
                private int Aa;
    private int Ab;
    private int Ac;
    private int Ba;
    private int Bb;
    private int Bc;
     private int Ca;
    private int Cb;
    private int Cc; 
     
//constructo

    public Casilla(String posicion, String simbolo, Int Aa, Int Ab, Int Ac, Int Ba, Int Bb, Int Bc, Int Ca, Int Cb, Int Cc) {
        this.posicion = posicion;
        this.simbolo = simbolo;
        this.Aa = superior_iz;
        this.Ab = superior_med;
        this.Ac = Superios_de;
        this.Ba = cento_iz;
        this.Bb = cento_med;
        this.Bc = centro_der;
        this.Ca = bajo_iz;
        this.Cb = bajo_med;
        this.Cc = bajo_der;
    }
//metodos get and set
   
  

   
    public Casilla() {
    }
     
    public int getAa() {
        return Aa;
    }

    public void setAa(int Aa) {
        this.Aa = Aa;
    }

    public int getAb() {
        return Ab;
    }

    public void setAb(int Ab) {
        this.Ab = Ab;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }

    public int getBa() {
        return Ba;
    }

    public void setBa(int Ba) {
        this.Ba = Ba;
    }

    public int getBb() {
        return Bb;
    }

    public void setBb(int Bb) {
        this.Bb = Bb;
    }

    public int getBc() {
        return Bc;
    }

    public void setBc(int Bc) {
        this.Bc = Bc;
    }

    public int getCa() {
        return Ca;
    }

    public void setCa(int Ca) {
        this.Ca = Ca;
    }

    public int getCb() {
        return Cb;
    }

    public void setCb(int Cb) {
        this.Cb = Cb;
    }

    public int getCc() {
        return Cc;
    }


    public void setCc(int Cc) {
        this.Cc = Cc;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
  //to string

    @Override
    public String toString() {
        return "Casilla{" + "posicion=" + posicion + ", simbolo=" + simbolo + ", Aa=" + Aa + ", Ab=" + Ab + ", Ac=" + Ac + ", Ba=" + Ba + ", Bb=" + Bb + ", Bc=" + Bc + ", Ca=" + Ca + ", Cb=" + Cb + ", Cc=" + Cc + '}';
    }


 
  
 
     
}



