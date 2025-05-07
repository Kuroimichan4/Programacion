/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica00;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class EjemploScanne2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        var name = scanner.nextLine();
        
        System.out.print("Introduce tu direccion: ");
        var address = scanner.nextLine();
        
        System.out.print("Introduce tu numero: ");
        var number = scanner.nextLine();
        
        System.out.println("Nombre: " + name);
        System.out.println("Direccion: " + address);
        System.out.println("Numero: " + number);
        
        scanner.close();
    }
}
