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
public class Calculadora {
    static Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
int suma = 0;
for (int i = 1; i <= 4; i++) {
    suma += i;
}
System.out.println(suma);
    }
}   
