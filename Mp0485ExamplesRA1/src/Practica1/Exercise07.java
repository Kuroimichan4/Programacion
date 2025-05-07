/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Exercise07 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        
    
                System.out.println("Introduce un numero");
                int base = sc.nextInt();
                sc.nextLine().trim();
                    
                
                System.out.printf("%-20s%-20s%-20s\n","Numero","Cuadrado","Cubo");
                
                for (int i = 0; i < 5; i++) {
                    int num = base + i;
                    int cuadrado = num * num;
                    int cubo = num * num * num;
                    System.out.printf("%-20s%-20s%-20s\n",num,cuadrado,cubo);
                }
                
                
        }       
    }
