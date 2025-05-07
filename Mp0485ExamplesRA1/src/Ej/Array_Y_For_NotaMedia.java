/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Array_Y_For_NotaMedia {
        static Scanner sc = new Scanner (System.in);

    
    public static void main(String[] args) {
            int nota = 0;
            int [] listaNotas = new int [5];
            for (int i = 0; i < listaNotas.length; i++) {
                System.out.println("Introduce la nota de la asignatura " +(i+1));
                nota = sc.nextInt();
                sc.nextLine().trim();
                listaNotas[i] = nota; //Guarda la nota ingresada en el array listaNotas en la posición i. 
                //Así, cada vez que se ingresa una nueva nota, se va guardando en el siguiente espacio del array.
        }
            int asignatura = 1;
            int total = 0;
            for (int notas : listaNotas) {
                System.out.println("La nota de la asignatura " + asignatura++ + " es " + notas);
               //Este es un bucle for-each, que recorre todos los elementos del array listaNotas. 
               //En cada iteración, la variable notas tomará el valor de una de las notas del array.
               total += notas; //el for siguiente nos lo podemos ahorrar haciendo esto
        }
//            int total = 0;
//            for (int x = 0; x < listaNotas.length; x++) {
//                total = total + listaNotas[x]; //En cada iteración, suma la nota almacenada en listaNotas[x] a la variable total pero se puede sustiturir por (total += notas) en el for-each de arriba
//        }
            System.out.println("La nota media es " + total / listaNotas.length); // esto dividirá el total de notas por el numero de asignaturas, en este caso 5
            
    }
    
}

