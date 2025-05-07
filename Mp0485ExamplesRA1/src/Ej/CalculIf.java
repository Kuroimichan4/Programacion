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
public class CalculIf {
/**
 *
 * @author miriamhernav
 */
    static Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
 //       double x = 0, y = 0;
        System.out.println("CALCULADORA");
        
        System.out.println("Introduce la operacion a realizar (+,-,/,*):"); 
        char op = (scan.next()).charAt(0);
        
        System.out.println("Valor de X");
        double x = scan.nextDouble();
        
        System.out.println("Valor de y");
        double y = scan.nextDouble();
        
        if (op == '+'){
            System.out.println(x + "+" + y + "=" + (x + y));
        } else if (op== '-') {
        
        if (op == '+'){
            System.out.println(x + "-" + y + "=" + (x + y));
        } else if (op== '-') {
            
        if (op == '+'){
            System.out.println(x + "*" + y + "=" + (x + y));
        } else if (op== '-') {
        
        if (op == '+'){
            System.out.println(x + "/" + y + "=" + (x + y));
        } else if (op== '-') {
            
            
                    }
                }    
            }
        }
    }
}   
  
