/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triqui;

import java.util.Scanner;

/**
 *
 * @author SG701-03
 */
public class Tablero {
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

    public Tablero() {
    }

    public Tablero(int Aa, int Ab, int Ac, int Ba, int Bb, int Bc, int Ca, int Cb, int Cc) {
        this.Aa = Aa;
        this.Ab = Ab;
        this.Ac = Ac;
        this.Ba = Ba;
        this.Bb = Bb;
        this.Bc = Bc;
        this.Ca = Ca;
        this.Cb = Cb;
        this.Cc = Cc;
    }

    //get and set

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

    
    //to string
    @Override
    public String toString(){
    
        return "Tablero{" + "Aa=" + Aa + ", Ab=" + Ab + ", Ac=" + Ac + ", Ba=" + Ba + ", Bb=" + Bb + ", Bc=" + Bc + ", Ca=" + Ca + ", Cb=" + Cb + ", Cc=" + Cc + '}';
    }

    //metodos
    public void MostrarTablero() {
        System.out.println("+-+-+-+");
        System.out.println( "|" +  Aa.getSimbolo() + "|" +  Ab.getSimbolo() + "|" +  Ac.getSimbolo() + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" +  Ba.getSimbolo() + "|" +  Bb.getSimbolo() + "|" +  Bc.getSimbolo() + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" +  Ca.getSimbolo() + "|" +  Cb.getSimbolo() + "|" +  Cc.getSimbolo() + "|");
        System.out.println("+-+-+-+");
    }
    
  public void jugar(int posicion, String simbolo){
  
  switch (posicion){
  
      case 1:
          Aa.setSimbolo(simbolo);
          break;
        
           case 2:
          Ab.setSimbolo(simbolo);
          break;
           case 3:
          Ac.setSimbolo(simbolo);
          break;
         case 4:
          Ba.setSimbolo(simbolo);
          break;
        
           case 5:
          Bb.setSimbolo(simbolo);
          break;
           case 6:
          Bc.setSimbolo(simbolo);
          break;
          case 7:
          Ca.setSimbolo(simbolo);
          break;
        
           case 8:
          Cb.setSimbolo(simbolo);
          break;
           case 9:
          Cc.setSimbolo(simbolo);
          break;
          default:
                  
  
  
  }
  
  }

public void marcaAplicacion(){



}



}
