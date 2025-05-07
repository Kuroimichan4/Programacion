/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Scanner6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Por favor, introduce la primera letra:");
            char letra1 = sc.next().charAt(0);
            /**.charAt(0) hay que ponerlo para que sepa qué caracter ha de leer*/
            System.out.println("Por favor, introduce la segunda letra:");
            char letra2 = sc.next().charAt(0);
            System.out.println("Por favor, introduce la tecera letra:");
            char letra3 = sc.next().charAt(0);

    
        String nombre = "Hola "+(letra1 + "" + letra2 + "" + letra3);
            /*Han de ponerse las "" para evitar que los char se sumen ya que los char asignan un valor numerico a las letras*/
        }  
}
