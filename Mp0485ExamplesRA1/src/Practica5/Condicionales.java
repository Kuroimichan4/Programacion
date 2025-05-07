/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Condicionales {
       static Scanner sc = new Scanner(System.in);
            
    public static void main(String[] args) {
        sc.useDelimiter("\n");/**para leer toda la linea, no se parará entre espacios de palabras*/
        
        String respuestaCorrecta = "paris";
     
        System.out.print("Cual es la capital de Francia? ");
        String respuesta =sc.next();
        if (respuestaCorrecta.equals(respuesta)){
         System.out.println("respuesta correcta");
         }
        else {
            System.out.println("Respuesta incorrecta");
        }   
    }  
}
