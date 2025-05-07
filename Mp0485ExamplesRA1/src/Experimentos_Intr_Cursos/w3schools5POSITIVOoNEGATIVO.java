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
public class w3schools5POSITIVOoNEGATIVO {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero");
        
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Es positivo");
   
        } else if (num < 0)
            System.out.println("Es negativo");
        else {
            System.out.println("Es 0");
        }
         
        
        
    }
}
