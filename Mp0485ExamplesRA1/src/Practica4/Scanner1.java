/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Scanner1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa un valor: ");
        int x = s.nextInt();
        System.out.println("Ingresa un valor: ");
        int y = s.nextInt();
        
        System.out.println("El valor de x es " + x);
        System.out.println("El valor de y es " + y);
        System.out.println("El valor de x + y es " + (x+y));
        System.out.println("El valor de x - y es " + (x-y));
        System.out.println("El valor de x / y es " + (x/y));
        System.out.println("El valor de x * y es " + (x*y));
    }
        
}
