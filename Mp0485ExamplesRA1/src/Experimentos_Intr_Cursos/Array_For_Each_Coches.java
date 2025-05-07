/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experimentos_Intr_Cursos;

/**
 *
 * @author Lucifer
 */
public class Array_For_Each_Coches {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]); 
        }
//        int x = 1;
//        for (String car : cars) {
//            System.out.println("La marca de coche numero " + x++ + " es " + car);
//        }
        
        for (String car : cars) { //esto es lo mismo de arriba pero simplificado
            System.out.println(car);
        }
        
    }
}
