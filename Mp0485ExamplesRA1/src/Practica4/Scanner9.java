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
public class Scanner9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Por favor, introduce el radio");
            double radio = sc.nextDouble();
            
        System.out.println("Por favor, introduce la altura");
            double altura = sc.nextDouble();
        System.out.println("area" + (radio*2*3.14*altura/3));
    }    
}
