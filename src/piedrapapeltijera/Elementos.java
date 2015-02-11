/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Javier
 */
public class Elementos {

    /**
     * realizacion de piedra papel tijera pero con elementos Fuego, agua, rayo,
     * viento y tierra
     *
     * fuego gana a viento, viento gana a tierra, tierra gana a rayo, rayo gano
     * a agua, agua gana a fuego
     *
     */
    final int FUEGO = 1;
    final int VIENTO = 2;
    final int RAYO = 3;
    final int TIERRA = 4;
    final int AGUA = 5;
    //public int numRecogido;

    /**
     * variables parar recoger las jugadas
     */
    int jugadaJugador;
    int jugadaMaquina;

    /**
     * lo usaremos para generar la jugada aleatoria
     */
    Random jugadaAleatoria = new Random();

    int jugadaAl;
    /*crear metodo, en el metodo indicarle el jlabel y añadir imagenes*/
//    public String anadeImagen(JLabel jLabel){
//    
//    jLabel.();
//    }

    public String comparaElementos(int jugada1) {
        jugadaJugador = jugada1;
        boolean vencedor = false;
        //
        if (jugadaJugador == FUEGO && jugadaAl == VIENTO || jugadaJugador == VIENTO && jugadaAl == FUEGO) {
            System.out.println("Ganador fuego");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == FUEGO && jugadaAl == TIERRA || jugadaJugador == TIERRA && jugadaAl == FUEGO) {
            System.out.println("Ganador fuego");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == FUEGO && jugadaAl == FUEGO || jugadaJugador == FUEGO && jugadaAl == FUEGO) {
            System.out.println(" EMPATE");
            return String.valueOf("empate");
        }
        //        if (jugadaJugador == FUEGO && jugadaAl == RAYO) {
//            System.out.println("Ganador fuego");
//            return String.valueOf(vencedor = true);
//        }
        //
        if (jugadaJugador == VIENTO && jugadaAl == RAYO || jugadaJugador == RAYO && jugadaAl == VIENTO) {
            System.out.println("Ganador viento");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == VIENTO && jugadaAl == TIERRA || jugadaJugador == TIERRA && jugadaAl == VIENTO) {
            System.out.println("Ganador viento");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == VIENTO && jugadaAl == AGUA || jugadaJugador == AGUA && jugadaAl == VIENTO) {
            System.out.println("Ganador viento");
            return String.valueOf(vencedor = true);
        }

        if (jugadaJugador == VIENTO && jugadaAl == VIENTO || jugadaJugador == VIENTO && jugadaAl == VIENTO) {
            System.out.println("EMPATE");
            return String.valueOf("EMPATE");
        }
        //        if (jugadaJugador == VIENTO && jugadaAl == FUEGO) {
//            System.out.println("EMPATE");
//            return String.valueOf("EMPATE");
//        }
        //
        if (jugadaJugador == RAYO && jugadaAl == AGUA || jugadaJugador == AGUA && jugadaAl == RAYO) {
            System.out.println("Ganador rayo");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == RAYO && jugadaAl == FUEGO || jugadaJugador == FUEGO && jugadaAl == RAYO) {
            System.out.println("Ganador rayo");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == RAYO && jugadaAl == RAYO || jugadaJugador == RAYO && jugadaAl == RAYO) {
            System.out.println("EMPATE");
            return String.valueOf("EMPATE");
        }
        //        if (jugadaJugador == RAYO && jugadaAl == TIERRA) {
//            System.out.println("Ganador rayo");
//            return String.valueOf(vencedor = true);
//        }
//        
        if (jugadaJugador == TIERRA && jugadaAl == FUEGO || jugadaJugador == FUEGO && jugadaAl == TIERRA) {
            System.out.println("Ganador tierra");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == TIERRA && jugadaAl == VIENTO || jugadaJugador == VIENTO && jugadaAl == TIERRA) {
            System.out.println("Ganador tierra");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == TIERRA && jugadaAl == TIERRA || jugadaJugador == TIERRA && jugadaAl == TIERRA) {
            System.out.println("EMPATE");
            return String.valueOf("EMPATE");
        }
        //        if (jugadaJugador == TIERRA && jugadaAl == AGUA) {
//            System.out.println("Ganador tierra");
//            return String.valueOf(vencedor=true);
//        }
        //
        if (jugadaJugador == AGUA && jugadaAl == FUEGO || jugadaJugador == FUEGO && jugadaAl == AGUA) {
            System.out.println("Ganador agua");
            return String.valueOf(vencedor = true);
        }
        if (jugadaJugador == AGUA && jugadaAl == VIENTO || jugadaJugador == VIENTO && jugadaAl == AGUA) {
            System.out.println("Ganador agua");
            return String.valueOf(vencedor = true);
        }

        if (jugadaJugador == AGUA && jugadaAl == AGUA || jugadaJugador == AGUA && jugadaAl == AGUA) {
            System.out.println("EMPATE");
        }
        //        if (jugadaJugador == AGUA && jugadaAl == RAYO) {
//            System.out.println("Ganador agua");
//            return String.valueOf(vencedor = true);
//        }

        return String.valueOf(vencedor);
    }

    void numElemento() {
        switch (jugadaAl) {
            case 1:
                System.out.println("fuego");

                break;
            case 2:
                System.out.println("Viento");

                break;
            case 3:
                System.out.println("Rayo");
                break;
            case 4:
                System.out.println("Tierra");
                break;
            case 5:
                System.out.println("Agua");
                break;
        }
    }

    /**
     * comparar dato1 con dato2
     */
    void jugadaMaquina() {
        jugadaAl = jugadaAleatoria.nextInt(3) + 1;
        System.out.println(jugadaAl);
    }

}
