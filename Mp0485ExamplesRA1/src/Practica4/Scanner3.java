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
public class Scanner3 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Por favor, ingrese su nombre");
            String nombre = sc.nextLine();
            
            System.out.println("Por favor, ingrese su direccion");
            String adress = sc.nextLine();
            
            System.out.println("Por favor, ingrese su numero de telefono");
            String num = sc.nextLine();
            
            System.out.println("Hola " + nombre + ", su direccion es " + adress + " y su numero de telefono es " + num);
    }
}
