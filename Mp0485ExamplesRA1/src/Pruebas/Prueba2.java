/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import java.time.LocalDate;

/**
 *
 * @author Lucifer
 */
public class Prueba2 {
    
    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int suma = 0;
        
//            for (int[] num : nums) {
//                for (int cifras : nums) {
//                    suma += cifras;
//                }
//            
//            }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                suma += nums[i][j];
            }
        }
        System.out.println("La suma total de los numeros es: " + suma);
        

        
    }

}
