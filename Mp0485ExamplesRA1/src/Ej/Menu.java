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
public class Menu {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        
        System.out.println("PRACTICA 05");
        System.out.println("MENU: ");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        
        System.out.print("Opcion: ");
        String opcion = sc.next();
        
        switch (opcion) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            default:
                System.out.println("Opcion incorrecta");
               
        }        
    } //fin main
    static void ejercicio1(){
        
        String numStr = sc.next();
        int num = Integer.parseInt(numStr); //cambia el numString a int
        double numDec = Double.parseDouble(numStr);//cambia el numStr a double
    }
        static void ejercicio2(){
    }
        static void ejercicio3(){
    }    
}
