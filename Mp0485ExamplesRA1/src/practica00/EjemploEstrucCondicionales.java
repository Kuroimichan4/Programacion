/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica00;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class EjemploEstrucCondicionales {
    static Scanner sc = new Scanner(System.in);
            
    public static void main(String[] args) {
        sc.useDelimiter("\n");/**para leer toda la linea, no se parará entre espacios de palabras*/
        
        boolean puedeTrabajar = false;/*Se declara una variable booleana llamada puedeTrabajar y se inicializa con el valor false. 
        Esta variable se usará para determinar si una persona puede trabajar.*/
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        
        puedeTrabajar = ((edad < 18) || (edad > 65));/*Esta línea evalúa si la edad es menor de 18 o mayor de 65. 
        Si alguna de estas condiciones es verdadera, puedeTrabajar se establece como true, indicando que la persona no puede trabajar.*/
        
        if (!puedeTrabajar) { //el ! invierte el puede trabajar que ahora es -18 y +65 los que pueden trabajar
           System.out.println("Puedes trabajar");
        }
        else {
            System.out.println("No puedes trabajar");
        }    
        System.out.println("Esto se ejecuta siempre y que sepas que sea domo sea estas jodido");
     
     /*   
     String miNombre = "carmen";
     System.out.println("nombre: ");
     String nombre = sc.next();
     
     if (miNombre.equals(nombre)){
         System.out.println("Tocaya!");
        }*/
    }
}


