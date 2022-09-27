/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Musica {
protected int opcion;
Scanner s= new Scanner(System.in);

public void Menu(){
System.out.println("Que tipo de cancion te gusta"
                + "\t(1)Salsa"
                + "\t(2)Cumbia");
        opcion= s.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Elijio Salsa");
                System.out.println("Estan estas canciones"
                        + "\t 1-Los adolecentes---virgen-"
                        + "\t 2-Procura"
                        + "\t 3-El dia de mi suerte");
                System.out.println("Te gustaria saber cual");
                opcion=s.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Los adolecentes orquesta,\tabulm ahora mas que nunca,\tLanzamiento 2001,\tgenero Musica tropical");
                break;
                    case 2:
                        System.out.println("Procura,\tChichi peralta,\talbum pa otro lao,\t genero merengue bachata musica tropical");
                        break;
                    case 3:
                        System.out.println("El dia de mi suerte,\t Hector valoe, Willi,\t albumn lo mato,\t genero musica tropical  ");
                        break;
                    default:
                            System.out.println("Opcion no valida");
                        break;
                }default:
                    System.out.println("Opcion no valida");
                break;
            case 2:
                System.out.println("Elijio Cumbias");
                Canciones c = new Canciones();
                c.cumbias("nombre", "Album", opcion, "genero");
                break;
        }
        
        
        
        
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musica m= new Musica();
        m.Menu();
        
        
    }
    
}
