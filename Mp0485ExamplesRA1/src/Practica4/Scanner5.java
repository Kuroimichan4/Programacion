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
public class Scanner5 {
        static final double IVA = 1.21;
        //siempre se declara el static final antes del main
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Por favor, ingrese el importe a pagar sin IVA");
            var factura = sc.nextInt();
    
        System.out.println("Total a pagar con IVA incluido " +(factura * IVA));
            
        }
}
