/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experimentos_Intr_Cursos;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class DoWhilew3schools {
    static Scanner sc = new Scanner (System.in);
        public static void main(String[] args) {
        
            System.out.println("Selecciona el ejercicio 1-2 o pulse E para salir");
            String op;// Declaro la variable fuera del bucle para poder usarla
            
            do {
               op = sc.next().toLowerCase(); // Ahora leemos la opción dentro del bucle para que cada iteración tenga en cuenta la nueva entrada
               
               switch (op){
                    case "1":
                       ejercicio1();
                       break;
                    case "2":
                        ejercicio2();
                        break;
                    case "3":
                       ejercicio1();
                       break;
                    case "4":
                        ejercicio2();
                        break;
                    case "E":
                        System.out.println("saliendo del pregrama");
                        break;
               }
            } while (!op.equalsIgnoreCase("E"));/*El bucle do-while seguirá ejecutándose mientras la condición dentro del while sea true.
Cuando el usuario introduce "e", op.equals("e") será true.
El ! lo convierte en false, lo que hace que la condición del while sea false y el bucle termine.*/
    
    }
         public static void ejercicio1() {
        System.out.println("Ejercicio 1 ejecutado.");
        System.out.println("pruebas de mierda\"A ver que pasa");
    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2 ejecutado.");
        System.out.println("pruebas de mierda\'A ver que pasa");
    }
    public static void ejercicio3() {
        System.out.println("Ejercicio 1 ejecutado.");
        System.out.println("pruebas de mierda\\A ver que pasa");
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 2 ejecutado.");
        System.out.println("pruebas de mierda\uddddA ver que pasa");
    }
}
