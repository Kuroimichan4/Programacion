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
public class w3schoolsCalculaAreaRectangulo {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n"); // esto es para que el nextLine no se quede pillado al final de linea, aveces puede pasar
        System.out.println("Introduzca la altura");
        int alt = sc.nextInt();
        System.out.println("Introduzca el ancho");
        int ancho = sc.nextInt();
        System.out.println("El area de su resctangulo es:"+ (alt*ancho));
        
        

    }
}
