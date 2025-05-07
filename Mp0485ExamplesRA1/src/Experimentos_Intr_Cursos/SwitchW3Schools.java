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
public class SwitchW3Schools {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        String day; // Inicializamos la variable 'day' antes del bucle
        do {
            
        
        System.out.println("Escaribe un dia del fin de semana");
            //int day = sc.nextInt();
            day = sc.nextLine(); //podría poer un .toLowerCase() al lado del next o .toUpperCase()

            /*switch (day){ //este switch lee int pero no scanner a no ser que los numeros vayan entre comillas
                case 6:
                    System.out.println("hoy es sabado");
                    break;
                case 7:
                    System.out.println("hoy es domingo");
                    break;
                default:
                    System.out.println("No has elegido un dia valido");
            }*/
    
 
            switch (day){
                case "6" -> System.out.println("Hoy es Sabado");
                case "7" -> System.out.println("Hoy es Domingo");
                case "E" -> System.out.println("Saliendo del programa");
                default -> {
                }
            } 
        } while (!day.equalsIgnoreCase("E"));
    }
}
