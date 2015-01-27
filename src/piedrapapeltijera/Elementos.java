/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;

/**
 *
 * @author Javier
 */
public class Elementos {

    /**
     * realizacion de piedra papel tijera pero con elementos Fuego, agua, rayo,
     * viento y tierra
     *
     * fuego gana a viento, 
     * viento gana a tierra, 
     * tierra gana a rayo,
     * rayo gano a agua,
     * agua gana a fuego
     *
     */
    final int FUEGO = 1;
    final int HIELO = 2;
    final int RAYO = 3;
    final int TIERRA = 4;
    final int AGUA = 4;

    /**
     * variables parar recoger las jugadas
     */
    int jugadaJugador;
    int jugadaMaquina;
    
    /**
    *lo usaremos para generar la jugada aleatoria
    */
    Random jugadaAleatoria = new Random();
    
    public String comparaElementos() {
        
        if () {
            
        }else{
            if (true) {
                
            }else{
                if (true) {
                    
                }else{
                    if (true) {
                        
                    }
                }
                
            }
        }
        //return
    } 
    void jugadaMaquina(){
       int jugadaAl = jugadaAleatoria.nextInt(3)+1;
        System.out.println(jugadaAl);
    }
    
    
    
}
