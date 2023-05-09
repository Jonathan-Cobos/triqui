/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triqui;

/**
 *
 * @author SG701-03
 */
public class Juego_Triqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador jugador= new Jugador();
        Tablero tablero=new Tablero();
       jugador.setTablero(tablero);
       tablero.MostrarTablero();
       
       
        
        
    }
    
}
