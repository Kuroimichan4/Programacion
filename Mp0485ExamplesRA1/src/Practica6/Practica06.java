/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica6;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Pract6 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        
            /*useDelimiter para que salte de linea*/
            System.out.println("Menu:");
            System.out.println("1 - Exercise 1");
            System.out.println("2 - Exercise 2");
            System.out.println("3 - Exercise 3");
            System.out.println("4 - Exercise 4");
            System.out.println("5 - Exercise 5");
            System.out.println("6 - Exercise 6");
            System.out.println("Selecciona ejercicio del 1-6");
            String op = sc.nextLine();
        
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
                default:
                break;
                
        }
    }
        static void ejercicio1(){
            sc.useDelimiter("\n");
            System.out.println("Question 1: What is the output of 'System.out.println(5 + 3);'? a) "); 
            System.out.println("a- 53");
            System.out.println("b- 8");
            System.out.println("c- 5+3");
            System.out.println("d- Error Answer:");
            var ej1 = sc.next();
            int nota = 0;
            
            if (ej1.equals("b")){
                nota++;
            } else {   
            }
              
          
       // poner if else y que sume a una variante solo si acierta 
            System.out.println("Question 2: Which keyword is used to create a class in Java? ");
            System.out.println("a- class");
            System.out.println("b- create");
            System.out.println("c- new");
            System.out.println("d- method Answer:");   
            var ej2 = sc.next();
            
            if (ej2.equals("a")){
                nota++;
            } else {   
            }
            
            System.out.println("Question 3: What data type is used to create a variable that should store text? ");
            System.out.println("a- myString");
            System.out.println("b- String");
            System.out.println("c- Txt");
            System.out.println("d- Text Answer:");
            var ej3 = sc.next();   
            
             if (ej3.equals("d")){
                nota++;
            } else {   
            }
            
            System.out.println("Question 4: How do you start the main method in Java? ");
            System.out.println("a- public void main()");
            System.out.println("b- public static void main()");
            System.out.println("c- main()");
            System.out.println("d- static void main()");
            var ej4 = sc.next(); 
            
             if (ej4.equals("b")){
                nota++;
            } else {   
            }            
            
            System.out.println("Question 5: What is the correct way to create a variable of type int? ");
            System.out.println("a- int num = 5");
            System.out.println("b- integer num = 5");
            System.out.println("c- num int = 5");
            System.out.println("d- num = int 5");
            var ej5 = sc.next();      
            
             if (ej5.equals("a")){
                nota++;
            } else {   
            }            
                       
            System.out.println("Tu nota total es " + nota); 
        }
    
        static void ejercicio2(){
            System.out.println("Escriba un numero de 3 digitos");
            int num = sc.nextInt();

            
            if ((num <= 100 && num >= 999) || (num <= -100 && num >= -999)){
                System.out.println("No has introducido un numero valido");
            } else { String strnum = Integer.toString(num);
                
                if (strnum.charAt(0) == strnum.charAt(2)){
                    System.out.println("El numero " + num + " es capicua");
                } else if (strnum.charAt(1) == strnum.charAt(3)){
                    System.out.println("El numero " + num + " es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            }

    }
        static void ejercicio3(){
            System.out.println("Escribe un numero de maximo 5 digitos");
            int nu = sc.nextInt();
            
            if (nu <= 99999 && nu >= 10000 || nu <= -99999 && nu >= -10000){
                System.out.println("Tiene 5 digitos");
            } else if  (nu <= 9999 && nu >= 1000 || nu <= -9999 && nu >= -1000){
                System.out.println("Tiene 4 digitos");
            } else if  (nu <= 999 && nu >= 100 || nu <= -999 && nu >= -100){
                System.out.println("tiene 3 digitos");
            } else if  (nu <= 99 && nu >= 10 || nu <= -99 && nu >= -10){
                System.out.println("tiene 2 digitos");
            } else if  (nu <= 9 && nu >= 0 || nu <= -9 && nu >= -1){
                System.out.println("tiene 1 digito");
            } else {
                System.out.println("No escribiste un numero valido");
            }
    }    
        static void ejercicio4(){
          //  sc.nextLine(); //para que no salte de linea solo
            System.out.println("Dime el dia de la semana de lunes a viernes");
            String dia = sc.nextLine().toLowerCase();
           
            
            if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") ||
            dia.equals("jueves") || dia.equals("viernes")){
                System.out.println("bien ya tengo el dia");
            } else {
                System.out.println("Dia no valido");
                return;
            }

            System.out.println("Introduzca la hora actual (formato 24 horas sin minutos)");
            int hora = sc.nextInt();
            System.out.println("Introduzca los minutos de la hora actual (0-59)");
            int min = sc.nextInt();
            
            if (hora < 0 || hora > 23 || min < 0 || min > 59) {
            System.out.println("Hora o minutos invalidos.");
            return;
        }
            
            int minhora = 60;
            int mindia = 1440;
            int mint = 60;
            int totalmin = 0;
            
            switch (dia) {
                case "lunes":
                    totalmin = (mindia * 4) + (hora * minhora) + (mint - min);
                    break;
                case "martes":
                    totalmin = (mindia * 3) + (hora * minhora) + (mint - min);
                    break;
                case "miercoles":
                    totalmin = (mindia * 2) + (hora * minhora) + (mint - min);
                    break;                  
                case "jueves":
                    totalmin = (mindia * 1) + (hora * minhora) + (mint - min);
                    break;
                case "viernes":
                    totalmin = (mindia * 0) + (hora * minhora) + (mint - min);
                    break;
            }
            System.out.println("Los minutos que quedan para el finde son " + totalmin);
    }    
        static void ejercicio5(){
            System.out.print("");
            System.out.println("Introduce el precio (Sin IVA)");
            double precio = sc.nextDouble();
            sc.nextLine();//para limpiar los saltos de linea
            System.out.println("Introduce el tipo de IVA: general(21%), reducido(10%) o super-reducido(4%)");
            String tipoIva = sc.nextLine().toLowerCase();
            
            double iva = 0;
            switch (tipoIva) {
                case "general":
                    iva = 0.21;
                    break;
                case "reducido":
                    iva = 0.10;
                    break;
                case "super-reducido":
                    iva = 0.04;
                    break;
                default:
                    System.out.println("No se ha seleccionado un tipo de IVA valido, se usara el general");
                    iva = 0.21;
            }
            
            double pconiva = precio * (1 + iva);
            
            System.out.println("Seleccione su codigo promocional: noPromo (sin descuento), half (50%) fix (5Euros) o percent (5%)");
            String promo = sc.nextLine().toLowerCase();
            
            double desc = 0;
            switch (promo) {
                case "nopromo":
                    desc = 0;
                    break;
                case "half":
                    desc = pconiva * 0.50;
                    break;
                case "fix":
                    desc = 5;
                    break;
                case "percent":
                    desc = pconiva * 0.05;
                    break;
                default:
                    System.out.println("Codigo invalido. Sindescuentos aplicados");
            }
            
            double pcondesc = pconiva * desc;
            double total = pconiva - desc;
            
            System.out.printf("%-25s %.2f €%n", "Precio sin IVA: ", precio);
            System.out.printf("%-25s %.2f €%n", "IVA: ", (pconiva - precio));
            System.out.printf("%-25s %.2f €%n", "Precio con IVA: ", pconiva);
            System.out.printf("%-25s %.2f €%n", "Codigo de promocion: ", desc);
            System.out.printf("%-25s %.2f €%n", "Total: ", total);
            
       
    } 
        static void ejercicio6(){

}
}