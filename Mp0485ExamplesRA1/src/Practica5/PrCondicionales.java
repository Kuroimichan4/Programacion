/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;
import java.util.Scanner;
/**
 *
 * @author miriamhernav
 */
public class PrCondicionales {
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
}
        static void ejercicio2(){
            System.out.println("Introduce la hora");
            String hora = sc.next();
            int horadia = Integer.parseInt(hora);
            //&& devuelve verdadero si las 2 comparaciones son verdaderas
            // || devuelve verdadero con solo una de las dos verdaderas
            //! invierte elresultado
                if ((horadia >= 6) && (horadia<=12)){
                    System.out.println("Buenos días");            
                } else if ((horadia >= 13) && (horadia<=20)){
                    System.out.println("Buenas tardes");
                } else if ((horadia >= 21) && (horadia <=24)){
                    System.out.println ("Buenas noches");  
                } else{
                    System.out.println("Buenas noches");
                }                    
            }


        static void ejercicio3(){
            System.out.println("Introduce un numero del 1 al 7:");
            String num = sc.next();
            int dia = Integer.parseInt(num);//combierte el string a int
            
                switch (num){
                    
                    case "1":
                        System.out.println("Es Lunes");
                        break;
                    case "2":
                        System.out.println("Es Martes");
                        break;
                    case "3":
                        System.out.println("Es Miércoles");
                    case "4":
                        System.out.println("Es Jueves");
                        break;
                    case "5":
                        System.out.println("Es Viernes");
                        break;
                    case "6":
                        System.out.println("Es Sábado");
                        break;
                    case "7":
                        System.out.println("Es Domingo");
                        break;                        
                }       
        } 
        static void ejercicio4(){
            System.out.println("Introduzca el numero de horas trabajadas");
            int horas = sc.nextInt();
            var ord = 10;
            var ext = 12;
            var base = 40*ord;
            double salario;
            
            if (horas <=40) {
                salario = horas * ord;
            } else {
            salario = ((horas - 40) * ext + base);
            }
            System.out.println("Tu salario de esta semana es: " + salario);

        }
        static void ejercicio5(){
            System.out.println("Introduce tu dia de nacimiento");
            int dia = sc.nextInt();
            System.out.println("Introduce tu mes de nacimiento (1-12)");
            int mes = sc.nextInt();
            
            if (mes == 1 && dia >= 21 && dia <=31 || mes == 2 && dia <= 19 && dia >= 1){
                System.out.println("Eres Acuario");// == igual && y || o
            } else if (mes == 2 && dia >= 20 && dia <=28 || mes == 3 && dia <= 20 && dia >= 1){
                System.out.println("Eres Piscis");
            } else if (mes == 3 && dia >= 21 && dia <=31 || mes == 4 && dia <= 20 && dia >= 1){
                System.out.println("Eres Aries");
            } else if (mes == 4 && dia >= 21 && dia <=30 || mes == 5 && dia <= 20 && dia >= 1){
                System.out.println("Eres Tauro");
            } else if (mes == 5 && dia >= 21 && dia <=31 || mes == 6 && dia <= 20 && dia >= 1){
                System.out.println("Eres Geminis");
            } else if (mes == 6 && dia >= 21 && dia <=30 || mes == 7 && dia <= 20 && dia >= 1){
                System.out.println("Eres Cancer");
            } else if (mes == 7 && dia >= 21 && dia <=31 || mes == 8 && dia <= 20 && dia >= 1){
                System.out.println("Eres Leo");
            } else if (mes == 8 && dia >= 21 && dia <=30 || mes == 9 && dia <= 20 && dia >= 1){
                System.out.println("Eres Virgo");
            } else if (mes == 9 && dia >= 21 && dia <=31 || mes == 10 && dia <= 20 && dia >= 1){
                System.out.println("Eres Libra");
            } else if (mes == 10 && dia >= 21 && dia <=30 || mes == 11 && dia <= 20 && dia >= 1){
                System.out.println("Eres Escorpio");
            } else if (mes == 11 && dia >= 21 && dia <=31 || mes == 12 && dia <= 20 && dia >= 1){
                System.out.println("Eres Sagitario");
            } else if (mes == 12 && dia >= 21 && dia <=30 || mes == 1 && dia <= 20 && dia >= 1){
                System.out.println("Eres Capricornio");
            }
          
           }
} 

