/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import static Ej.Example.processDate;

/**
 *
 * @author Lucifer
 */
public class Metodos {
    public static void main(String[] args) {
        double result1 = cubeVolume(2);
        double result2 = cubeVolume(10); 
        System.out.println("Un cubo de lado 2 tiene un volumen de " + result1);
        System.out.println("Un cubo de lado 10 tiene un volumen de " + result2);
        
        String userInput = "15/03/1990"; // Se llama 'userInput' aquí           ********************************************ejemplo 2 de llamar argumentos en métodos*********
        int result = processDate(userInput); // Pasa 'userInput' como argumento
        
    }
    // fuera del main dentro de public class metodos
public static double cubeVolume(double sideLength){
//Poner un nombre al método ( cubeVolume)
//Dar un tipo y un nombre para cada parámetro ( double sideLength) 
//Especificar el tipo y el valor devuelto ( double)

double volume = sideLength * sideLength * sideLength; // sideLength es la longitud del lado del cubo
return volume; //La instrucción return termina el método inmediatamente y retorna el valor especificado al método invocante
}



   public static int processDate(String input) { // Aquí se llama 'input'        ********************************************ejemplo 2 de llamar argumentos en métodos*********
        boolean isValid = validateFormat(input); // Pasa 'input' como argumento
        return isValid ? 1 : -1;
    }

    public static boolean validateFormat(String date) { // Aquí se llama 'date'     ********************************************ejemplo 2 de llamar argumentos en métodos*********
        return date.contains("/"); // Trabaja con 'date'
    }  
    
}






/* Este es un ejempo de un array que es un parametro que siempre se pasa por referencia
public class Ejemplo {

    public static void cambiarElemento(int[] arr) {
        arr[0] = 99;  // Cambiar el primer elemento del array
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        System.out.println("Antes de llamar a la función:");
        for (int num : numeros) {
            System.out.println(num);  // Imprime los elementos del array
        }

        cambiarElemento(numeros);  // Llamamos a la función pasándole el array

        System.out.println("Después de llamar a la función:");
        for (int num : numeros) {
            System.out.println(num);  // El primer elemento ahora es 99
        }
    }
}

*/
/* Y este es un ejemplo como el de arriva pero que hacemos una copia del array para que no se modifique el array original
public class Ejemplo {

    public static void cambiarElemento(int[] arr) {
        arr = arr.clone();  // Creamos una copia del array
        arr[0] = 99;  // Cambiar el primer elemento de la copia
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        System.out.println("Antes de llamar a la función:");
        for (int num : numeros) {
            System.out.println(num);  // Imprime los elementos del array
        }

        cambiarElemento(numeros);  // Llamamos a la función

        System.out.println("Después de llamar a la función:");
        for (int num : numeros) {
            System.out.println(num);  // El array original no se ha modificado
        }
    }
}

*/

