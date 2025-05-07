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
public class Sacnner8 {
    static final double salario = 12;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tus horas trabajadas ");
        int horas = sc.nextInt();
        
        System.out.println("Tu salario de esta semana es: " +(horas * salario));
        
    }
}
