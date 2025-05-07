/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.exceptions.NonAlphabeticException;
import model.exceptions.NonNumericException;
import model.validations.UserDataValidations;



public class Main {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
    
        String op = "";
        do {

            System.out.println("Menu:");
            System.out.println("1 - Tester isNumeric");
            System.out.println("2 - Tester isAlphabetic");
            System.out.println("E - Exercise to Exit");
            System.out.println("Selecciona ejercicio del 1-7 o E para salir");
            
            op = sc.nextLine().trim();
            
            System.out.println("Has elegido: " + op);
            
            switch (op) {
                case "1":       
                    testIsNumeric();
                    break;
                case "2":       
                    testIsAlphabetic();
                    break;
                case "E":       
                    System.out.println("saliendo del programa");
                    break;
                default:
                break;
            }    
        } while (!op.equalsIgnoreCase("E"));  
    }
    

    static void testIsNumeric(){
        System.out.println("***Validador de numeros***");
        System.out.println("Introduzca el numero a comprobar");
        String num = sc.nextLine();
       
        try {
            UserDataValidations.isNumeric(num);
            System.out.println("Es un numero valido.");
        } catch (model.exceptions.NonNumericException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        
    }
    static void testIsAlphabetic(){
       System.out.println("***Validador de Alfabeto***");
        System.out.println("Introduzca las letras a validar");
        String isAlphabetic = sc.nextLine().toUpperCase();
        
        try {
            UserDataValidations.isAlphabetic(isAlphabetic);
            System.out.println("Son caracteres alfabeticos");
        } catch (model.exceptions.NonAlphabeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}