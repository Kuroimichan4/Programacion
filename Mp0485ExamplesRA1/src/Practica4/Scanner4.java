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
public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese la cantidad de Yenes a cambiar a Euros");
            int moneda = sc.nextInt();
         
            System.out.println("Sus "+ moneda + " Yenes son un total de " +(moneda * 0.61 )+" Euros");
    }
}
