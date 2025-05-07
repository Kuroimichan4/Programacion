/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica11;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Pr11 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
                
        String op = ""; 

        do {

            System.out.println("Menu:");
            System.out.println("1 - Exercise 1");
            System.out.println("2 - Exercise 2");
            System.out.println("3 - Exercise 3");
            System.out.println("4 - Exercise 4");
            System.out.println("5 - Exercise 5");
            System.out.println("6 - Exercise 6");
            System.out.println("7 - Exercise 7");
            System.out.println("8 - Exercise 8");
            System.out.println("E - Exercise to Exit");
            System.out.println("Selecciona ejercicio del 1-7 o E para salir");
            
            op = sc.nextLine().trim();// opción del usuario dentro del bucle + trim() para eliminar los espacios en blanco dentro de un string 
            
            System.out.println("Has elegido: " + op);
            
            switch (op) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":
                    ejercicio4();
                    break;
                case "5":
                    ejercicio5();
                    break;
                case "6":
                    ejercicio6();
                    break;
                case "7":
                    ejercicio7();
                    break;
                case "8":
                    ejercicio8();
                    break;
                case "E":
                    System.out.println("saliendo del pregrama");
                default:
                break;
            }
                
        } while (!op.equalsIgnoreCase("E")); 
    }
    static void ejercicio1(){
    }
    static void ejercicio2(){
    }
    static void ejercicio3(){
    }
    static void ejercicio4(){
    }
    static void ejercicio5(){
    }
    static void ejercicio6(){
    }
    static void ejercicio7(){
    }
    static void ejercicio8(){
    }
}
