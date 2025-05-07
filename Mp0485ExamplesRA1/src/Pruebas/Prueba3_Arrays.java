/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author miriamhernav
 */
public class Prueba3_Arrays {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que reciba un array de números enteros y ");
        System.out.println("encuentre el número más grande y el más pequeño del array. Luego, calcula la diferencia entre ambos números.");
       int[] num = {1,2,3,4,5,6,7,8,9};
       int max = num[0];
       int min = num[0];
       
        for (int i : num) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        
        int diferencia = max - min;
        
        System.out.println("El maximo es " + max + " el minimo es " + min + " y la diferencia es: " + diferencia);
        
        
        
    }
    
}
