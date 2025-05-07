/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author miriamhernav
 */
public class prueba4_Arrays2d {
    public static void main(String[] args) {
        System.out.println(" Escribe un programa que reciba una matriz de números enteros de 3x3");
        System.out.println("y calcule la suma de los elementos en las dos diagonales de la matriz.");
        
        
        System.out.println("Escribe un programa que reciba una matriz de tamaño 2x3 ");
        System.out.println("y la transforme en una matriz transpuesta, es decir, cambia las filas por columnas.");
        
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] transpuesta = new int[3][2];  // Nueva matriz de tamaño 3x2
        
        // Transponemos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];  // Intercambiamos filas por columnas
            }
        }
        
        // Imprimimos la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}

    


        
    

