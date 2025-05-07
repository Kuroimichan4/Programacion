/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class PrCondicionalesEjemplosYNotas {
        static Scanner sc = new Scanner (System.in);
        public static void main(String[] args) {
        sc.useDelimiter("\n");
        
        System.out.println("Selecciona el ejercicio 1-5");
           String op = sc.next();
    
            switch (op) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":       
                    ejercicio4();
                    break;
                case "5":       
                    ejercicio5();
                    break;
                case "6":    
                    ejercicio1op2();
                    break;
                default:
                break;
        }
    }
        static void ejercicio1(){
        System.out.println("Selecciona el dia de la semana");
        String dia = sc.next();
//x.equals es de la clase String verifica si dos cadenas son iguales
//Si se pone .equalsIgnoreCase(lo que sea) hace lo mismo pero no diferencia entre mayus y minus
            if (dia.equalsIgnoreCase("Lunes")) {
                System.out.println("La primera clase es: PROG");
            } else if (dia.equalsIgnoreCase("Martes")) {
                System.out.println("La primera clase es: ENT");
            } else if (dia.equalsIgnoreCase("Miercoles")){
                System.out.println("La primera clase es: HTML");
            } else if (dia.equalsIgnoreCase( "Jueves")){
                System.out.println("La primera clase es: SIS");
            } else if (dia.equalsIgnoreCase("Viernes")) {
                System.out.println("La primera clase es: BBDD");
            } else {
                System.out.println("No hay clase");
    }
}  switch (num.toLowerCase()){ //para que no diferencie entre mayus y minus
        static void ejercicio2(){
        System.out.println("Introduce la hora en formato 24 horas:");
        String hora = sc.next();
        int Inthora = Integrer.parseInt(hora);
            if (hora >= 6 && <13) {
            } else if (>=13 && <21) {
                
           
        }
            
        }
        static void ejercicio3(){
        System.out.println("Introduce un numero del 1 al 7:");
        String Num = sc.next();
        Int Intnum = Integrer.parseInt(num);
        
        } 
        static void ejercicio4(){

        static void ejercicio5(){
    
       
        
        System.out.println("Introduzca la hora (0-24):");
        int hora = sc.nextInt();
        
        // Validar que la hora esté en el rango correcto
            if (hora < 0 || hora > 24) {
            System.out.println("Hora no válida. Debe estar entre 0 y 24.");
            } else {
            // Determinar el saludo según la hora
            if (hora >= 6 && hora < 13) {
                System.out.println("Buenos días");
            } else if (hora >= 13 && hora < 21) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
            }
    
 
            
        }
        static void ejercicio1op2(){
            System.out.println("Selecciona el dia de la semana:");
            String dia = sc.next();
//con el .toLowerCase() hace que lo que escribamos en la cadena lo lea en minuscula para que no haya errores en la introducción de datos por parte del usuario
            switch (dia.toLowerCase()) { /*Se puede quitar lo que hay después de dia y funciona igual*/
                case "lunes":
                    System.out.println("La primera clase es: PROG");
                    break;
                case "martes":
                    System.out.println("La primera clase es: ENT");
                    break;
                case "miercoles":
                    System.out.println("La primera clase es: HTML");
                    break;
                case "jueves":
                    System.out.println("La primera clase es: SIS");
                    break;
                case "viernes":
                    System.out.println("La primera clase es: BBDD");
                    break;
                default:
                    System.out.println("No hay clase");
                    break;
        }
             
        }
        
} 
// para convertir un de un tipo de dato a otro hay que poner entre parentesis el tipo a cambiar
int num1 = 8
double num2 = 8
num1 = (double) num2