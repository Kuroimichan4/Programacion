/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experimentos_Intr_Cursos;

/**
 *
 * @author Lucifer
 */
public class ArrayBidimensional_W3schools {
    static String id = "41008859H";
    public static void main(String[] args) {
        int[][] myNum = {{1,2,3,4},{5,6,7}}; //esto son 2 tablas como si fuerra un array de 2
        for (int i = 0; i < myNum.length; i++) { //este bucle se repetirá 2 veces
            for (int j = 0; j < myNum[i].length; j++) { //este recorrerá todos los numeros dentro de cada array
                System.out.println(myNum[i][j]);
            }
        }
        for (int[] i : myNum) {//esto y los for de arriba son lo mismo
          for (int j : i) {
            System.out.printf("%-10s",j);//no hace falta poner i porque como el bucle for each se imprime por orden automático con que pongamos la j que es el valor de cada elemento del interior del array ya vale
          }
        }
    }

        
}
