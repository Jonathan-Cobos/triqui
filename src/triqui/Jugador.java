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
public class Jugador {
    private String nombre;
     private String simbolo;
      private int numJugador;
       private int numGanador;
       private Juego_Triqui miTriqui;
       private Tablero tablero;
       
       //constructo

    public Jugador() {
    }

    public Jugador(String nombre, String simbolo, int numJugador, int numGanador, Juego_Triqui miTriqui, Tablero tablero) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numJugador = numJugador;
        this.numGanador = numGanador;
        this.miTriqui = miTriqui;
        this.tablero = tablero;
    }

  
   //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public int getNumGanador() {
        return numGanador;
    }

    public void setNumGanador(int numGanador) {
        this.numGanador = numGanador;
    }

    public Juego_Triqui getMiTriqui() {
        return miTriqui;
    }

    public void setMiTriqui(Juego_Triqui miTriqui) {
        this.miTriqui = miTriqui;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    
    
    
    //to string 

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", simbolo=" + simbolo + ", numJugador=" + numJugador + ", numGanador=" + numGanador + ", miTriqui=" + miTriqui + '}';
    }
    
      public void selecionarMarca(){
    
        Scanner sc= new Scanner(System.in);
        System.out.println("selecione marca X - o : ");
        String valor=sc.next();
        if(valor.equals("x")||valor.equals("o"))
    
            this.simbolo=valor;
        this.simbolo="x";
            
    }

       
       
       
}
