import java.util.Scanner;

public class B_Montar_Bici{
public static void main (String[] args){


    String lluvia = "";
    String ele_seguridad = "";
    String estado = "";

    Scanner entrada = new Scanner (System.in);

         System.out.println("");
         System.out.print("¿Está lloviendo? SI/NO:   ");
         lluvia = entrada.nextLine();
         System.out.println("");
 
         System.out.print("¿Están completos los elementos de seguridad?(Casco / Luces)  SI/NO:   ");
         ele_seguridad = entrada.nextLine();
         System.out.println("");
 
         System.out.print("¿La bici está en buen estado?(frenos, neumáticos, cadena, sillin, etc) SI/NO:  ");
         estado = entrada.nextLine();
         System.out.println("");
         System.out.println("");
         System.out.println("");
 
        // Algoritmo de decisión para determinar si es posible montar bicicleta.
         if (lluvia.equalsIgnoreCase("no")){
                System.out.println("Hace buen clima para montar en bici.");
                System.out.println("");
            }else{
                System.out.println("Está lloviendo. Lo mejor será no montar bici hoy.");
                System.out.println("");
            }
            
        if (ele_seguridad.equalsIgnoreCase("si")){
                System.out.println("Con los elementos de seguridad, puedo salir con confianza.");
                System.out.println("");
            }else{
                System.out.println("Primero completo los elementos de seguridad antes de salir en bici.");
                System.out.println("");
            } 
        
        if (estado.equalsIgnoreCase("si")){
                 System.out.println("La bici no tiene problemas.");
                 System.out.println("");
            }else{
                 System.out.println("Primero arregla lo que hace falta, para antes de salir.");
                 System.out.println("");
            }
        
        if (lluvia.equalsIgnoreCase("no") && ele_seguridad.equalsIgnoreCase("si") && estado.equalsIgnoreCase("si")){
                 System.out.println("ESTAMOS LISTOS 100% PARA MONTAR EN BICI.");
                 System.out.println("");
            }else{
                 System.out.println("PERO SI ALGO ESTÁ MAL, ES MEJOR NO MONTAR EN BICI HOY.");
                 System.out.println("");
            }

  }
}

