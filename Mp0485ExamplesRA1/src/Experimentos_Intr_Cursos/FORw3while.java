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
public class FORw3while {
        static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
    int i = 0;
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }    
    }
}
/*La declaración 1 establece una variable antes de que comience el bucle (int i = 0).

La declaración 2 define la condición para que se ejecute el bucle (i debe ser menor que 5). Si la condición es verdadera, el bucle comenzará nuevamente; si es falsa, el bucle finalizará.

La declaración 3 aumenta un valor (i++) cada vez que se ejecuta el bloque de código en el bucle.*/