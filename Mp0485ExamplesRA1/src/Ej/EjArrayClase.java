/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class EjArrayClase {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 3; //indicas que el máximo de espacios es = a 3
    public static void main(String[] args) {
/*       double temp1 = 0;
       double temp2 = 0;
       double temp3 = 0;
        double temp4 = 0;
        double temp5 = 0;
        double temp6 = 0;
        double temp365 = 0;
        int numDia = 1;
        System.out.println("Introduce la temperatura del dia " + numDia);
        double temp1 = sc.nextDouble();
        numDia++;*/
        double [] listaTemp/*inicializa la variable*/ = new double [MAX];/*le indicas los espacios de memoria reservados. También puedes simplemente poner [3] en vez de [MAX]*/
        
        //CONTROL+MAYUS+C COMENTAS TODO LO SELECCIONADO
        for (int i = 0; i < listaTemp.length; i++) {
            System.out.println("Introduce la temperatura del dia " + (i+1));
            listaTemp[i] = sc.nextDouble();  
        }
//        for (int i = 0; i < listaTemp.length; i++) {
//            System.out.println("La temperatura del dia " + (i + 1) + " es: " + listaTemp[i]);
//        }
// forma for-each otro tipo de bucle: solo sirve para leer
        int numDia = 1;
        for (double temperatura /*declaras una variable dentro del for each*/: listaTemp) {  //atajo de teclado fore
            System.out.println("La temperatura del dia " + (numDia++)+ " es " + temperatura);      
        }   
    }
}
