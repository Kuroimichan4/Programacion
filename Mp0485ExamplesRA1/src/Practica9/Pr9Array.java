/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica9;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author miriamhernav
 */
public class Pr9Array {
        static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
                
        String op = ""; // Inicializamos la variable 'op' antes del bucle

        do {

            System.out.println("Menu:");
            System.out.println("1 - Exercise 1");
            System.out.println("2 - Exercise 2");
            System.out.println("3 - Exercise 3");
            System.out.println("4 - Exercise 4");
            System.out.println("5 - Exercise 5");
            System.out.println("6 - Exercise 6");
            System.out.println("7 - Exercise 7");
            System.out.println("8 - Exercise 8");
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
                case "8" -> ejercicio8();
                case "E" -> System.out.println("saliendo del pregrama");
                default -> {
                }
            }    
        } while (!op.equalsIgnoreCase("E")); 
    }
    
    static void ejercicio1(){
        int num = 0;
        int [] listaNum = new int [10];
        for (int i = 0; i < listaNum.length; i++) { //el bucle se repetirá mientras i sea menor que la listaNum
            System.out.println("Introduce el numero " + (i+1)); //aquí pongo lista num +1 para que el usuario vea que la lista empieza en 1
            num = sc.nextInt(); //aquí guardo el numero del usuario en la variabla num
            sc.nextLine();
            listaNum[i] = num; // aquí el numero guardado en num se pone en la posicion de i de ese mopmento en la lista
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("los numeros a la inversa son " + listaNum[i]);
        }
    }
    static void ejercicio2(){
        System.out.println("Voy a enseñarte un numero aleatorio elevado al cuadrado y al cubo");
        int [] number = new int [20];
        int [] square = new int [20];
        int [] cube = new int [20];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100); // Asigno un numero aleatorio a el array number, como math random lo da en decimales lo combierto a int 
            // lo multiplico por 100 antes de pasarlo a int porque está dentro de un parentesis
        }
        for (int i = 0; i < square.length; i++) {
            square[i] = number[i] * number[i]; // aquí multiplico number por sí mismo pra que me de el cuadrado y lo introduzco en el array square
        }
        for (int i = 0; i < cube.length; i++) {
            cube[i] = number[i] * number[i] * number[i]; // aquí multiplico number por sí mismo 3 veces pra que me de el cubo y lo introduzco en el array cube
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-5s%-5s%-5s\n",number[i],square[i],cube[i]);
        }       
    }
    static void ejercicio3(){
        int [] numList = new int[10];
        for (int i = 0; i < numList.length; i++) {
            System.out.println("Escribe el numero " +(i+1));
            numList[i] = sc.nextInt(); // Se introducen los numeros del usuario en el array
            sc.nextLine();
        }
        int max = numList[0]; // Aquí pongo el primer numero del array como si fuera el mas alto y lo guardo en una variable 
        int min = numList[0]; // Aquí pongo el primer numero del array como si fuera el mas bajo en una variable 
        for (int i = 0; i < numList.length; i++) { // con el for se recorren todos los numeros del array
            if (max < numList[i]){ //a medida que va iterando el array si un numero es mas grande que la variable max, esta se modifica con el numero mas grande
                max = numList[i];
            }
            if (min > numList[i]){ //a medida que va iterando el array si un numero es mas oequeño que la variable min, esta se modifica con el numero mas pequeño
                min = numList[i];
            }
        }
        for (int i = 0; i < numList.length; i++) { // con este for se
            if (numList[i] == max){
                System.out.println(numList[i] + " maximum");
            }
            else if (numList[i] == min) {
                System.out.println(numList[i] +" minimum");
            } else {
                System.out.println(numList[i]);
            }     
        }
    }
    static void ejercicio4(){
        String [] wordList = new String[15];
        System.out.println("Escribe 15 palabras");
        for (int i = 0; i < wordList.length; i++) {
            System.out.println("Escribe la palabra " + (i+1));
            wordList[i] = sc.nextLine(); // Introduce cada palabra escrita por el usuario en una posición del array
        }
        String lastWord = wordList[14]; // la ultima palabra la almaceno en una variable temporal para que no se borre
        for (int i = 14; i > 0; i--) {
            wordList[i] = wordList[i-1]; // Aqui hago que el array empiece por el final y vaya subiendo una posición cada palabra dentro del array
        }
        System.out.println("");
        wordList[0] = lastWord; // Aquí sustituyo la primera palabra del array por la ultima palabra que había guardado en la variable 
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i]);
        }

    }
    static void ejercicio5(){
        int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {   
            numbers[i] = (int) (Math.random() * 20); //generamos 100 numeros lo multiplicamos *20 para que ese sea el numero mas alto y lo pasamos a int
          //poner en el mismo bucle que escribe que sustituya y los que sustituye les ponga comillas o 2 for como dice chema  
            System.out.print(numbers[i] + " ");
        }
        System.out.println("Escribe 2 numeros");
        System.out.println("Escribe el primer numero"); // este numero se borrará
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero"); // este lo sustituirá
        int num2 = sc.nextInt();
        
        for (int number : numbers) {
            if (number == num1) { // si un numero de la lista es igual al introducido por el usuario lo sustituirá por el segundo numero
                number = num2;
                System.out.print("'" + number + "'"); // al poner las comillas simples y concatenar el array, se printará  entre comillas el numero sustituido
            } else {
                System.out.print(number +" ");
            }
        }
    }
    static void ejercicio6(){
        int[] listaNum = new int[8];
        for (int i = 0; i < listaNum.length; i++) {
            System.out.println("Escribe 8 numeros distintos");
            listaNum[i] = sc.nextInt();
            sc.nextLine();   
        }
        for (int number : listaNum) {
            if (number % 2 == 0){ // si el numero dividido entre 2 es = 0 será par
                System.out.println("El numero " + number + " par");
            } else {
                System.out.println("El numer " + number + " es impar");
            }
        }
    }
    static void ejercicio7(){
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Escribe el numero " + (i+1));
            numbers[i] = sc.nextInt();
            sc.nextLine(); 
        }
        System.out.println("Los numeros introducidos son:");
        System.out.println("Indice\tValor"); // \t se usa para agregar un tabulador y alinear las columnas en la salida
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "\t" + numbers[i]);
        }
        int[] primos = new int[10]; //hago un array para los primos y otro para los no primos
        int[] noPrimos = new int[10];
        int primosN = 0;
        int noPrimosN = 0;
        
        for (int num : numbers) { //recorremos el array con el for-each y num como variable temporal toma el valor de cada numero de dentro del array
            boolean esPrimo = true; // asumimos que todos son primos
     
            if (num <= 1) {//un numero primo no puede ser 1 o menor 
                esPrimo = false;
            } else { // Usamos otro bucle para ver si el número num puede ser dividido por algún número de 2 hasta la raíz cuadrada de num
                for (int i = 2; i <= Math.sqrt(num); i++) { // empezamos con i=2 xq i es el numero con el que vamos a dividir y si un numero de divide entre 2 entonces no es primo
                    //Math.sqrt solo calcula la raiz cuadrada de un numero 
                    //porque si un numero se puede dividir por por un numero mayor a su raiz, también por un numero menor a ella 
                    //así que solo hace falta que i se incremente hasta su raíz cuadrada
                    if (num % i == 0) {//si se puede dividir por 2 sin dejar resto no es primo con % es el módulo, que nos da el resto de la división
                        esPrimo = false;
                    }
                }
            }
            if (esPrimo) { 
                primos[primosN++] = num;//aquí agregamos los primos cada uno en una posición distinta del array
                /*primos[primosN] = num; esto vendría a ser lo mismo pero de forma menos eficiente
                primosN++;*/
                //primos[primosN++] es como cuando ponemos primos[i] i despues incrementamos i con i++. Es decir primosN indica la posición dentro del array
                //como primosN = 0 se guarda en la posición 0, después se incrementa con ++ para que la siguiente palabra se guarde en la posición 1
            } else {
                noPrimos[noPrimosN++] = num;
            }
        }
 
        int[] resultado = new int[10]; //aquí juntamos los primos y no primos en el mismo array y los ordenamos
        for (int i = 0; i < primosN; i++) {
            resultado[i] = primos[i]; // primero ponemos los primos en el array de resultados
        }
        for (int i = 0; i < noPrimosN; i++) { //aquí sumamos los noPrimosN al resultado pero ponemos "primosN + i" porque si por ejemplo hay 3 primos será 3+0 es decir
            // que el indice empezará a partir de 3 para los no primos
            resultado[primosN + i] = noPrimos[i];//así se pondrán detrás de los prmos 
        }

        System.out.println("Los numeros han sido organizados por primo o no primo en el siguiente orden");
        System.out.println("Indice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "\t" + resultado[i]);
        }    
    }
    static void ejercicio8(){
        String[] coloresL = {"verde", "rojo", "azul","amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabras = new String[8];
        String[] colores = new String[8];
        String[] noColores = new String[8];
        int indexColores = 0;
        int indexNoColores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 8 palabras distintas");
        for (int i = 0; i < 8; i++) {
            palabras[i] = scanner.nextLine().toLowerCase(); //introducimos las palabras en el array palabras
        }
        for (int i = 0; i < 8; i++) {
            boolean esColor = false; //asumimos que todas las palabras son falsas y no hay colores
            for (int j = 0; j < coloresL.length; j++) {
                if (palabras[i].equals(coloresL[j])) { // comparamas las palabras del array con las del array de la listqa de colores con .equals
                    esColor = true;
                    break;
                }
            }
            if (esColor) { // si son colores se añade al array de colores
                colores[indexColores++] = palabras[i]; // aqui indexColores = 0, así que se añadirá a la posición 0 del array y después se incrementará a 1 para que el siguiente color se guarde en esa posición
            } else {
                noColores[indexNoColores++] = palabras[i]; 
            }
        }

        System.out.println("Palabras de colores:");
        for (int i = 0; i < indexColores; i++) {
            System.out.println(colores[i]);
        }

        System.out.println("Palabras que no son colores:");
        for (int i = 0; i < indexNoColores; i++) {
            System.out.println(noColores[i]);
            LocalDate currentDate = LocalDate.now();
            int year = currentDate.getYear(); //tiene que ser esta opción para pillar el año
            int day = currentDate.getDayOfMonth();//tiene que ser esta opción porque si no coge el numero del día del año
            int mes = currentDate.getMonthValue(); //tiene que ser este porque así te indica el numero de mes de este año
            
            
        }
    }  
}