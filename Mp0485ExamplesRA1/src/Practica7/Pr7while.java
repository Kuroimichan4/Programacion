/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica7;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Pr7while {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        
        String op = ""; // Inicializamos la variable 'op' antes del bucle

        do {
//Este tipo de sintaxis se utiliza cuando se desea que el bucle no tenga una inicialización explícita ni una actualización explícita, 
//pero aún se puede controlar la condición de terminación del bucle.
            System.out.println("Menu:");
            System.out.println("1 - Exercise 1");
            System.out.println("2 - Exercise 2");
            System.out.println("3 - Exercise 3");
            System.out.println("4 - Exercise 4");
            System.out.println("5 - Exercise 5");
            System.out.println("6 - Exercise 6");
            System.out.println("7 - Exercise 7");
            System.out.println("E - Exercise to Exit");
            System.out.println("Selecciona ejercicio del 1-7 o E para salir");
            
            op = sc.nextLine().trim();// opción del usuario dentro del bucle + trim() para eliminar los espacios en blanco dentro de un string 
            
            System.out.println("Has elegido: " + op);
            
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
                    ejercicio6();
                    break;
                case "7":       
                    ejercicio7();
                    break;
                case "E":       
                    System.out.println("saliendo del pregrama");
                    break;
                default:
                break;
            }    
        } while (!op.equalsIgnoreCase("E")); //esto es para comparar strings no vale poner ==
    }
            static void ejercicio1(){
            
            System.out.println("Introduzca un numero");
            int num = sc.nextInt();
            sc.nextLine().trim();// sigue entrando en bucle, añado trim para solucionar
            
            System.out.println("1. Usar For");
            System.out.println("2. Usar While");
            System.out.println("3. Usar Do-While");
            System.out.println("Seleccione una opcion");
            String wop = sc.nextLine().trim();
            
                System.out.println("Has elegido: " + wop);
        
            switch (wop) {
                case "1":
                    for (int i = num ; i <= 100; i = i+num) { 
                        System.out.println("Los multiplos son: " + i);
                    }
                    break;
                case "2":
                    int wnum = num;
                    while (num <= 100) {
                        System.out.println( "los multiplos son: " + num );
                        num = num + wnum;
                    }
                    break;
                case "3":
                    int dnum = num;
                    do { 
                        System.out.println( "los multiplos son: " + num );
                        num = dnum + num;
                    }
                    while (num <= 100);
                    break;
                default:
                    break;
     
            }
        }     
            
            static void ejercicio2(){

                System.out.println("Escribe un numero");
                int num = sc.nextInt();
                sc.nextLine().trim();
                System.out.println("Vamos a contar lops numeros de 10 en 10 entre " + num + " y 0");

                System.out.println("1. Usar For");
                System.out.println("2. Usar While");
                System.out.println("3. Usar Do-While");
                System.out.println("Seleccione una opcion");
                String wop = sc.nextLine().trim();
            
                System.out.println("Has elegido: " + wop);
        
                switch (wop) {
                    case "1":
                        for (int i = num ; i >= 0; i = i-10) { 
                            System.out.println("Los multiplos son: " + i);
                        }
                        break;
                    case "2":
                        
                        while (num >= 0) {
                            System.out.println( "La cuenta atras es: " + num );
                            num = num - 10;
                        }
                        break;
                    case "3":

                        do { 
                            System.out.println( "La cuenta atras es: " + num );
                            num = num - 10;
                     }
                        while (num <= 100);
                        break;
                    default:
                        break;
                   
        } 
                    }
            static void ejercicio3(){
                System.out.println("Introduce un numero");
                int num = sc.nextInt();
                sc.nextLine().trim();
                int multi = 1;
                
                do { 
                    System.out.println( "los multiplos son: " + num * multi );
                    multi++;
                    }
                while (multi <= 10);
                                
                            }
            static void ejercicio4(){
                
                System.out.println("Introduce un numero");
                int base = sc.nextInt();
                sc.nextLine().trim();
                
                System.out.printf("%-20s%-20s%-20s\n","Numero","Cuadrado","Cubo");
                
                for (int i = 0; i < 5; i++) {
                    int num = base + i;
                    int cuadrado = num * num;
                    int cubo = num * num * num;
                    System.out.printf("%-20s%-20s%-20s\n",num,cuadrado,cubo);
                }         
            }
            static void ejercicio5(){
                System.out.println("Introduce un numero");
                int num = sc.nextInt();
                sc.nextLine().trim();
                num = Math.abs(num);  // Ignoramos el signo - si es negativo
                int digito = 0;
                
                if (num == 0){
                    digito = 1;
                } else {
                    while (num > 0)  {
                        num = num/10;
                        digito++;
                    }
                }
                System.out.println("El numero introducido tiene " + digito + " digitos");
                    
            }    
            static void ejercicio6(){
                System.out.println("Adivina en que numero estoy pensando del 1 al 10, tienes 3 intentos");
                double randomD = Math.random();// para que de un numero aleatorio
                randomD = randomD * 10 +1; //como es 0.x lo multiplicamos por 10 para que sea positivo y +1 para que llegue al 10 
                int random = (int) randomD;//para pasarlo a int
                int intent = 1;
                int maxint = 3;
                int queda = maxint;
                
                while (queda > 0) {
                    System.out.println("Te quedan " + queda + " intentos. Que numero eliges?");
                    int num = sc.nextInt();
                    sc.nextLine().trim();
                    
                    if (num == random){
                        System.out.println("Lo adivinaste!!!");
                        break;
                    } else {
                        queda--;
                        if (queda == 0) {
                            System.out.println("Nop el numero era " + random + " Perdiste jaja");
                        } else {
                            System.out.println("Nop, ese no es, dime otro numero");
                        }
                    }
                }     
            }    
            static void ejercicio7(){
                System.out.println("Dame el numero de una base");
                int base = sc.nextInt();
                sc.nextLine();
                System.out.println("Bien, ahora dame el numero de un exponente");
                int exp = sc.nextInt();
                sc.nextLine();
                double total;
                
                if (exp == 0){
                    total = 1;
                    
                } else if  (exp > 0){
                    total = 1;
                    for (int i = 1; i <= exp; i++) {
                        total *= base; // igual que poner total = total * base   
                    }
                    
                } else {
                    total = 1;
                    for (int i = 1; i <= Math.abs(exp); i++) {
                        total *= base;
                    }
                    total = 1 / total;
                }   
                System.out.println("El resultado de " +base+ " por " +exp+ " es que la pontencia es " +total);
            }
}
