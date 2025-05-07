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
public class w3schools4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*    
        int x = 10;
        int y = 9;
        System.out.println(x>y); //esto dará true por defecto sin anunciar un boolean antes    
    */    
    System.out.println("Dime tu edad");
    int edad = sc.nextInt();
    int voto = 18;
    
    if (edad >= voto){
        System.out.println("Puedes votar!!");   
    } else {
        System.out.println("No puedes votar");
        }
    }
    
}
