/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experimentos_Intr_Cursos;

/**
 *
 * @author Lucifer
 */
public class ConversoresDeTipos {
    public static void main(String[] args) {

    
    //de int a String varios ejemplos de conversion
    int numero = 123;
    String str = String.valueOf(numero);
    System.out.println(str); // Imprime "123"
    //ej2: este solo cambia a int
    
    //de int a String varios ejemplos de conversion
    String str = Integer.toString(numero);
    System.out.println(str); // Imprime "123"
    //ej3:
    
    String str = numero + "";  // Concatenamos un entero con una cadena vacía
    System.out.println(str); // Imprime "123"
    
    //de String a int
    
     //esto es para pasar de string a int*****************
    String numeroStr = "123";
    int num = Integer.parseInt(numeroStr); //esto es para pasar de string a int
    System.out.println(num); // Imprime 123
    
    //ej2:
    
    Integer objInteger = Integer.valueOf(numeroStr);  // Convierte a Integer (objeto)
    int numero = objInteger.intValue();  // Obtiene el valor int
    System.out.println(numero); // Imprime 123

    //            String str = String.valueOf(numero);
//            Integer objInteger = Integer.valueOf(str);

//convertir doble a int
double numeroDouble = 9.87;
int numeroInt = (int) numeroDouble; // Conversion explícita (casting)
System.out.println(numeroInt);  // Imprime: 

int numerosInt = 9;
double numerosDouble = numerosInt; // Conversion implícita (esto se conoce como autoboxing o casting implícito)
System.out.println(numeroDouble);  // Imprime: 9.0
    }   
}