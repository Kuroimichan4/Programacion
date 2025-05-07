/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

/**
 *
 * @author Lucifer
 */
public class NewClass {
    
    public static String diHola() {
        int = sumaEdad();
        return "hola";
    }
    public static int sumaEdad(int anyo) {
        int resultado = 
        return resultado;
    } 
    
}


public class Ejemplo {
    
    // Método 1: genera un saludo
    public static String generaSaludo() {
        int res = suma10(8); // Llama al método suma10 con 8 → devuelve 18
        return "hola" + res; // Devuelve "hola18"
    }

    // Método 2: suma 10 al número que recibe
    public static int suma10(int numero1) {
        int resultado = numero1 + 10;
        return resultado;
    }

    public static void main(String[] args) {
        String pepito = generaSaludo(); // pepito = "hola18"
        int result = suma10(1);         // result = 11

        // Imprimir resultados
        System.out.println(pepito);     // Muestra: hola18
        System.out.println(result);     // Muestra: 11
    }
}