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
public class IntroDatosEnMismoString {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
       // Scanner sc = new Scanner (System.in); tambien se puede poner despues
       
        System.out.println("Introduce nombre y edad separados por un espacio");
        String nom = sc.next();
        int edad = sc.nextInt();
        
        System.out.println("Tu nombre es " + nom + " y tu edad es " + edad);
    }
}
