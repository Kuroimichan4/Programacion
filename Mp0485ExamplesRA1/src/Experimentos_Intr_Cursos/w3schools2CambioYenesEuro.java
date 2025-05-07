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
public class w3schools2CambioYenesEuro {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de euros a cambiar");
        int euro = sc.nextInt();
        var yen = 163;
        System.out.println(euro + " euros son " + (euro*yen) + " yenes");
        
    }
    
}
