/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author Lucifer
 */
public class Ej1 {
     public static void main(String[] args) {
        int x = 145;
        int y = 999;
        
        System.out.println("El valor de x es " + x);
        System.out.println("El valor de y es " + y);
        System.out.println("El valor de x + y es " + (x+y));
        System.out.println("El valor de x - y es " + (x-y));
        System.out.printf("El valor de x / y es %.2f\n",((double)x/y));//al poner double entre psrentesis delante de un int, le cambias el tipo de variable
        System.out.println("El valor de x * y es " + (x*y));
        /*con el printf damos formato al texto y pedimos para que solo de 2 decimales la división*/
     }
}
