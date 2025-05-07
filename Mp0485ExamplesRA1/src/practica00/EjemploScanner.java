/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica00;

import java.util.Scanner;
/**si hay algun error con la clase scanner usa import java.until.Scanner; antes de public class*/
/**
 */
public class EjemploScanner {
 
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            /**tenemos clase Scanner y llamamos una variable llamada sc, la iniciamos creando un nuevo objeto de tipo scanner y le decimos (de donde debe coger los datosSystem.in)*/
            System.out.println("Por favor, ingrese su nombre");
            String nombre = sc.nextLine();
            
            System.out.println("Por favor, ingrese su apellido");
            String apellido = sc.nextLine();
            
            System.out.println("Hola " + nombre + " " + apellido);
      /**si hay algun error con la clase scanner usa import java.until.Scanner; antes de public class*/
        }
    
}
