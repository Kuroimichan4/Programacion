/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica8;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Pr8Bucles3 {
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
                case "1" -> ejercicio1();
                case "2" -> ejercicio2();
                case "3" -> ejercicio3();
                case "4" -> ejercicio4();
                case "5" -> ejercicio5();
                case "6" -> ejercicio6();
                case "7" -> ejercicio7();
                case "E" -> System.out.println("saliendo del pregrama");
                default -> {
                }
            }    
        } while (!op.equalsIgnoreCase("E")); 
    }
    
    static void ejercicio1(){
    System.out.println("Escribe un numero");
    int numeroent = sc.nextInt();
    sc.nextLine().trim();// entra en bucle, añado nextline y trim para solucionar
    
    String num = String.valueOf(numeroent);//convierte el int en un string para poder pillar los char
    char a = num.charAt(0);
    int x = Character.getNumericValue(a);//para convertir el char a su valor numerico
    int y;
    
    for (int i = 1; i < num.length();i++){ //i=1 porque queremos que lea la 2da posición y i<num.length para que siga el bucle hasta que i tenga la longitud de la cadena(string) introducido
        char b = num.charAt(i);
        y = Character.getNumericValue(b);
        x = x + y;//se suma el total en x
    }
        System.out.println("La suma de los digitos entre si es: " + x);
    
    }
    
    static void ejercicio2(){
        System.out.println("Intoduce una frase");
        String frase = sc.nextLine();
        System.out.println("Escribe ahora una letra");
        char letra = sc.nextLine().charAt(0);
        int contador = 0;
        
        for (int i = 0; i < frase.length();i++){
            if (letra == frase.charAt(i)){
                contador++;
            }     
        }
        System.out.println("La letra " + letra + " aparece un total de " + contador + " veces");
    }
    
    static void ejercicio3(){
        System.out.println("Dime una palabra");
        String palabra = sc.nextLine();
        char a = palabra.charAt(0);
        System.out.println(a);
        char espacio = ' ';
        
        for (int i = 1; i < palabra.length(); i++) {
            for (int j = 0; j < i; j++) { //j imprime un espacio por cada bucle que haga mientas j sea menor que i
            System.out.print(espacio);
            }
            System.out.println(palabra.charAt(i));    
        }
        
    }
 

    static void ejercicio4(){
        int larg = 10;
        for (int i = 1; i <= larg; i++) {
            System.out.printf("%5d", i);
            for (int j = 2; j < larg+1; j++) {
                System.out.printf("%5d", j * i);
            }
                 System.out.println();
        }     
    }        
    

    static void ejercicio5(){
        int heroV = 100;
        int enemyV = 100;
        int rondas = 1;
        int hit = 0;
        int hitV = 0;
    
        System.out.println("Eres el el Heroe de esta tierra y el enemigo ha venido a destruite");
        System.out.println("Tendras que luchar con el");
        System.out.println("Elige sabiamente tus ataques");
        
            while (heroV > 0 && enemyV > 0) {
                System.out.println("Elige tu ataque");
                System.out.println("1 - Patada");
                System.out.println("2 - Mandoble (Ataque poderoso pero facil de esquivar)");
                int ataque = sc.nextInt();
                sc.nextLine().trim();
                
                    System.out.printf("---------- Ronda " + rondas++ + " ----------\n");
                    if (ataque == 1) {
                        double random = Math.random();
                        random = random * 10 + 1;
                        int ran = (int) random;
                        hit = ran * 2;
                            if (hit < 5) {
                                hit = 5;
                            } else if (hit > 15) {
                               System.out.println("Golpe critico!!!"); 
                            }
                        enemyV = enemyV - hit;
                    } else if (ataque == 2) {
                        double random = Math.random();
                        random = random * 10 + 1;
                        int ran = (int) random;
                        hit = ran * 3; 
                            if (hit < 10) {
                                hit = 10;
                            } else if (hit > 25) { //if else para ver si acierta el critico del ataque fuerte
                                double dado = Math.random();
                                dado = dado * 10;
                                int dice = (int)dado;
                                
                                if (dice >= 5){
                                    
                                    System.out.println("Golpe critico!!!");
                                } else if (dice < 5) {
                                    hit = 0;
                                    System.out.println("El enemigo esquivo el ataque");
                                }
                               
                            }
                        enemyV = enemyV - hit;
                    } else {
                        hit = 0;
                        System.out.println("No elegiste bien tu ataque, te tropiezas y pierdes un turno");
                    }                
    // Ataque enemigo
                        double random = Math.random();
                        random = random * 10 + 1;
                        int ran = (int) random;
                        hitV = ran;
                            if (hitV < 5) {
                                hitV = hitV * 4;
                            } else if (hitV >= 6) {
                                hitV = hitV * 3;
                                if (hitV < 10) {
                                    hitV = 10;
                                } else if (hitV > 25) { //if else para ver si acierta el critico del ataque fuerte
                                    double dado = Math.random();
                                    dado = dado * 10;
                                    int dice = (int)dado;
                                
                                    if (dice >= 5){
                                        System.out.println("Golpe critico!!!");
                                    } else if (dice < 5) {
                                        hitV = 0;
                                        System.out.println("Esquivaste el ataque!!!");
                                    }
                               
                                }
                            }
                        heroV = heroV - hitV;

                     
                    if (enemyV <= 0) {
                        System.out.println("Ganaste!! La humanidad se ha salvado y te rendiran homenaje por la eternidad");
                    } else if (heroV <= 0) {
                        System.out.println("Perdiste y condenaste a la humanidad");
                    }
                        System.out.println("* Heroe *");
                        System.out.printf("%-20s%-20s\n","ATQ Hero","VIT Hero");
                        System.out.printf("%-20s%-20s\n",hit,heroV);
                        System.out.println("Le hiciste un ataque de " + hit);//aqui para el testing en c++ poner un else if de daño 0 = esquivó el ataque
                        System.out.println("*****************************");
                        System.out.println("* Villano *");
                        System.out.printf("%-20s%-20s\n","ATQ Enemy","VIT Enemy");
                        System.out.printf("%-20s%-20s\n",hitV,enemyV);
                        System.out.println("Te hizo un ataque de " + hitV);
                        System.out.println("*****************************");
                        
                        if (enemyV <= 0) {
                            System.out.println("Ganaste!! ");
                        } else if (heroV <= 0) {
                            System.out.println("Perdiste y condenaste a la humanidad");
                        }                        
            }
    }
    static void ejercicio6(){
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 5;
        
        while (numAlumno <= maximo) {
            System.out.println("Introduce la nota del alumno" + numAlumno);
            int nota = sc.nextInt();
            sc.nextLine().trim();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;
        }
        int media = 0;
        media = sumaNotas / (numAlumno - 1);
        System.out.println("La nota media del alumno es: " + media);
    }
    static void ejercicio7(){
        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();
        sc.nextLine().trim();
        boolean es_primo = true;
        //al poner % te da el residuo de una división  si pusiera 13%7 saldría 6
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                es_primo = false;
                System.out.println(i + " es divisible entre " + num);
            }
        }    
            if (es_primo){
                System.out.println("El numero  " + num + " es primo");
            } else { 
                System.out.println("El numero " + num + " no es primo");
            }
        

        
    }
}
