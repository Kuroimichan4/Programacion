/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Pr10Arrays2D {
static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) throws InterruptedException { //para poder usar la funcion sleep
                
        String op = ""; // Inicializamos la variable 'op' antes del bucle

        do {

            System.out.println("Menu:");
            System.out.println("1 - Exercise 1");
            System.out.println("2 - Exercise 2");
            System.out.println("3 - Exercise 3");
            System.out.println("4 - Exercise 4");
            System.out.println("5 - Exercise 5");
            System.out.println("6 - Exercise 6");
            System.out.println("E - Exercise to Exit");
            System.out.println("Selecciona ejercicio del 1-8 o E para salir");
            
            op = sc.nextLine().trim();// opción del usuario dentro del bucle + trim() para eliminar los espacios en blanco dentro de un string 
            
            System.out.println("Has elegido: " + op);
            
            switch (op) {
                case "1" -> ejercicio1();
                case "2" -> ejercicio2();
                case "3" -> ejercicio3();
                case "4" -> ejercicio4();
                case "5" -> ejercicio5();
                case "6" -> ejercicio6();
                case "E" -> System.out.println("saliendo del pregrama");
                default -> {
                }
            }    
        } while (!op.equalsIgnoreCase("E")); 
    }
    static void ejercicio1(){
        System.out.println("Define un array de numeros enteros de 3 filas por 6 columnas");
        System.out.println("con nombre num y asigna los valores segun la siguiente tabla");
        System.out.println("Muestra el contenido de todos los elementos del array ");
        System.out.println("dispuestos en forma de tabla como se muestra en la figura");
        System.out.println(" ");
        
        String[] fila = {"Fila 0","Fila 1","Fila 2"};
        String[] colum = {"Array num","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4","Columna 5"};
        String[][] num = {{"0","30","2","","","5"},{"75","","","","0",""},{"","","-2","9","","11"}};
        
        for (String col : colum) {
            System.out.printf("%-10s", col);
        }
        System.out.println("");
        
        for (int i = 0; i < fila.length; i++) {
            System.out.printf("%-10s", fila[i]);
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%-10s", num[i][j]);
            }
            System.out.println("");
        }   
        
    }
    static void ejercicio2(){
        System.out.println("Escribe un programa que pida 20 numeros enteros");
        System.out.println("Estos numeros se deben introducir en un array de 4 filas por 5 columnas");
        System.out.println("El programa mostrara las sumas parciales de filas");
        System.out.println("y columnas igual que si de una hoja de calculo se tratara");
        System.out.println("La suma total debe aparecer en la esquina inferior derecha");
        System.out.println(" ");
        
        System.out.println("Introduce 20 numeros");
        String[] colum = {"","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4","Total Col"};
        String[] fila = {"Fila 0","Fila 1","Fila 2","Fila 3","Total Fila"};
        int[][] nums = new int [4][5];
        int resto = 20;
        int[] sumaColum = new int [5];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Quedan " + resto-- + " numeros para ingresar");
                nums[i][j] = sc.nextInt();
                sc.nextLine(); 
            }   
        }
        for (String col : colum) { //cabeceras de columnas
            System.out.printf("%-10s", col);
        }
        System.out.println("");
        
        for (int i = 0; i < nums.length; i++) { 
            System.out.printf("%-10s",fila[i]); // imprime el nombre de las filas
            int sumaFila = 0; // inicializa sumafila y lo retorna a 0 cada fin de j (cada fila)
            
            for (int j = 0; j < nums[i].length; j++) { // recorre las columnas de cada fila
                System.out.printf("%-10d", nums[i][j]); // imprime los numeros 
                sumaFila += nums[i][j]; // Acumula la suma de la fila
                sumaColum[j] += nums[i][j]; // Acumula la suma de la columna
                total += nums[i][j];         // Acumula la suma total
            }  
            System.out.printf("%-10d", sumaFila);  // cada fin del for j imprime el total de la fila y vuelve a 0
            System.out.println();
        }
        System.out.printf("%-10s", "Total");
        for (int i = 0; i < sumaColum.length; i++) {
            System.out.printf("%-10d", sumaColum[i]);
        }
        System.out.printf("%-10d", total);
        System.out.println();
    }
    static void ejercicio3() throws InterruptedException{
        System.out.println("Modifica el programa anterior de tal forma que las sumas parciales ");
        System.out.println("y la suma total aparezcan en la pantalla con un pequeño retardo");
        System.out.println("dando la impresion de que el ordenador se queda pensando");
        System.out.println("antes de mostrar los numeros. (usa la función sleep) ");
        System.out.println(" ");
        
        System.out.println("Introduce 20 numeros");
        String[] colum = {"","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4","Total Col"};
        String[] fila = {"Fila 0","Fila 1","Fila 2","Fila 3","Total Fila"};
        int[][] nums = new int [4][5];
        int resto = 20;
        int[] sumaColum = new int [5];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Quedan " + resto-- + " numeros para ingresar");
                nums[i][j] = sc.nextInt();
                sc.nextLine(); 
            }   
        }
        for (String col : colum) {
            System.out.printf("%-10s", col);
        }
        System.out.println("");
        
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-10s",fila[i]);
            int sumaFila = 0;
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%-10d", nums[i][j]); 
                sumaFila += nums[i][j];
                sumaColum[j] += nums[i][j];
                total += nums[i][j];
            }  
            Thread.sleep(1000);//esto es para retardar por algun motivo no funciona si no lo pongo en el main y en la cabecera del ejercicio 3
            System.out.printf("%-10d", sumaFila);  
            System.out.println();
        }
        System.out.printf("%-10s", "Total");
        for (int i = 0; i < sumaColum.length; i++) {
            Thread.sleep(1000); //también retraso el total de las columnas
            System.out.printf("%-10d", sumaColum[i]);
            
        }
        Thread.sleep(1000); //retraso la suma total
        System.out.printf("%-10d", total);
        System.out.println();
    }
    static void ejercicio4(){
        System.out.println("Crea un programa que:  ");
        System.out.println("Solicite el numero de filas y el numero de columnas ");
        System.out.println("A partir de esos datos construye un array de 2 dimensiones");
        System.out.println("Rellena el array anterior con valores aleatorios entre 0 y 9");
        System.out.println("Muestra el array resultante ");
        System.out.println("Reordena las filas de forma que la fila cuya suma de valores de el valor más alto, sea la primera.");
        System.out.println("Muestra el array reordenado. La primera fila se mostrara en color");
        System.out.println("");
        
        System.out.println("Introduzca el numero de filas deseado en la tabla");
        int fila = sc.nextInt();
        System.out.println("Introduzca el numero de columnas deseado");
        int colum = sc.nextInt();
        int[][] tabla = new int [fila][colum];
        Random random = new Random(); // con esta función se pueden generar y asignar numeros random
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                tabla[i][j] = random.nextInt(10);//con el 10 se indica que el numero que ha de asignar es entre 0 y 9 si pusiera 100 sería entre 0 y 99
            }
        }
        System.out.println("El array original es:");
        for (int i = 0; i < tabla.length; i++) {//ponemos solo tabla porque las filas son el array principal y por defecto cogerá el numero correcto de filas
            for (int j = 0; j < tabla[i].length; j++) {// aquí es tabla[i] porque le está indicando el array interno de la fila(que cambia cada bucle), que en este caso son las columnas
                System.out.printf("%-10s",tabla[i][j]);
            }
            System.out.println("");
        }
        int[] sumaFila = new int[fila];//En suma fila[i] se irán almacenando en cada bucle la suma de cada fila. Es decir sumaFila[0] será un total de la primera fila, sumaFila[1] será la suma de la segunda fila y así sucesivamente 
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                sumaFila[i] += tabla[i][j];
            }
        }
        for (int i = 0; i < fila -1; i++) {//en este for se ha de poner el array tabla[fila] porque si no solo se reordena el array de sumaFila y no se imprimirá la tabla solo la suma de la fila
            // itera sobre todas las filas menos la última
            for (int j = i + 1; j < fila; j++) { //Aquí hacemos que j sea i+1 para que compare la primera fila con la siguiente
                if (sumaFila[i] < sumaFila[j]){ //Si la suma de i es menor que la de j intercambiamos las filas completas de tabla[i] y tabla[j] 
                    int[] ordFila = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = ordFila;
                    //Aquí ordeno las sumas también para que no haya errores al comparar las sumaFilas pero como son un numero solo y no varios datos, no necesito hacer un array nuevo
                    int ordSuma = sumaFila[i]; 
                    sumaFila[i] = sumaFila[j];
                    sumaFila[j] = ordSuma;
                }
            }
        }
        
//        // MISMO EJERCICIO USANDO FOR-EACH
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca el número de filas deseado en la tabla:");
//        int fila = sc.nextInt();
//        System.out.println("Introduzca el número de columnas deseado:");
//        int colum = sc.nextInt();
//        
//        int[][] tabla = new int[fila][colum];
//        Random random = new Random();
//
//        // Llenar el array con valores aleatorios
//        for (int[] row : tabla) {
//            for (int i = 0; i < row.length; i++) {
//                row[i] = random.nextInt(10);
//            }
//        }
//
//        // Mostrar el array original
//        System.out.println("El array original es:");
//        for (int[] row : tabla) {
//            for (int value : row) {
//                System.out.printf("%-10s", value);
//            }
//            System.out.println();
//        }
//
//        // Calcular la suma de cada fila
//        int[] sumaFila = new int[fila];
//        int index = 0;
//        for (int[] row : tabla) {
//            for (int value : row) {
//                sumaFila[index] += value;
//            }
//            index++;
//        }
//
//        // Ordenar las filas según la suma
//        for (int i = 0; i < fila - 1; i++) {
//            for (int j = i + 1; j < fila; j++) {
//                if (sumaFila[i] < sumaFila[j]) {
//                    // Intercambiar filas en la tabla
//                    int[] temp = tabla[i];
//                    tabla[i] = tabla[j];
//                    tabla[j] = temp;
//                    
//                    // Intercambiar las sumas de las filas
//                    int tempSum = sumaFila[i];
//                    sumaFila[i] = sumaFila[j];
//                    sumaFila[j] = tempSum;
//                }
//            }
//        }
//
//        // Mostrar el array ordenado
//        System.out.println("El array ordenado es:");
//        boolean primeraFila = true;
//        for (int[] row : tabla) {
//            for (int value : row) {
//                if (primeraFila) {
//                    // Se muestra en color ANSI
//                    System.out.printf("\u001B[32m%-10s\u001B[0m", value);
//                } else {
//                    System.out.printf("%-10s", value);
//                }
//            }
//            System.out.println();
//            primeraFila = false;
//        }
//
//        sc.close();
//    }
//}
        
        
        
        
        System.out.println("El array ordenado de mayor a menor valor segun la fila es:");
            for (int i = 0; i < tabla.length; i++) {
                if (i == 0){
                    System.out.print("\033[32m");
                }
                for (int j = 0; j < tabla[i].length; j++){
                    System.out.printf("%-10s",tabla[i][j]);
                }
                System.out.println("");  
                if (i == 0){
                    System.out.print("\033[0m");//aquí vuelvo a poner el color negro porque se imprimía de color verde en el resto de ejercicios cada vez que se introducían datos
                }
            }      
    }
    static void ejercicio5(){
        System.out.println("Crea un programa que:  ");
        System.out.println("Solicite el numero de filas y el numero de columnas ");
        System.out.println("A partir de esos datos construye un array de 2 dimensiones");
        System.out.println("Rellena el array anterior con valores aleatorios entre 0 y 9");
        System.out.println("Muestra el array resultante ");
        System.out.println("Reordena las columnas de forma que la columna cuya suma de valores de el valor mas alto, sea la primera");
        System.out.println("Muestra el array reordenado. La primera columna se mostrara en color");
        System.out.println("");
        
        System.out.println("Introduzca el numero de filas deseado en la tabla");
        int fila = sc.nextInt();
        System.out.println("Introduzca el numero de columnas deseado");
        int colum = sc.nextInt();
        int[][] tabla = new int [fila][colum];
        Random random = new Random(); // con esta función se pueden generar y asignar numeros random
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                tabla[i][j] = random.nextInt(10);//con el 10 se indica que el numero que ha de asignar es entre 0 y 9 si pusiera 100 sería entre 0 y 99
            }
        }
        System.out.println("El array original es:");
        for (int i = 0; i < tabla.length; i++) {//ponemos solo tabla porque las filas son el array principal y por defecto cogerá el numero correcto de filas
            for (int j = 0; j < tabla[i].length; j++) {// aquí es tabla[i] porque le está indicando el array interno de la fila(que cambia cada bucle), que en este caso son las columnas
                System.out.printf("%-10s",tabla[i][j]);
            }
            System.out.println("");
        }
        int[] sumaCol = new int[colum];
        for (int i = 0; i < fila; i++) { 
            for (int j = 0; j < colum; j++) {
                sumaCol[j] += tabla[i][j];
            }
        }
        for (int i = 0; i < colum -1; i++) {
            for (int j = i+1; j < colum; j++) { //Aquí hacemos que j sea i+1 para que compare la primera fila con la siguiente como en el caso de las filas
                if (sumaCol[i] < sumaCol[j]){   //si i=3 es mayor que j=0 por ejemplo, se activa el siguiente bucle
                    // Aquí intercambiaré las columnas en la tabla dentro de cada fila
                    for (int k = 0; k < fila; k++) {
                        int ordCol = tabla[k][i];   //aquí el numero de suma menor, se guarda en una variable temporal
                        tabla[k][i] = tabla[k][j];  //aquí se cambia el de la suma mayor al primer lugar
                        tabla[k][j] = ordCol;   //Y aquí se cambia el numero menor que estaba en la variable temporal a la antigua posición de la suma mayor
                    }
                    int ordSuma = sumaCol[i];   //en este paso tambien cambio las sumas de orden para que no haya problemas
                    sumaCol[i] = sumaCol[j];
                    sumaCol[j] = ordSuma;
                }
            } 
        }
        System.out.println("El array ordenado de mayor a menor valor segun la columna es:");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (j == 0) {
                    System.out.print("\033[32m"); //añado el color verde
                }
                System.out.printf("%-10s",tabla[i][j]); 
                if (j == 0) {
                    System.out.print("\033[0m");    //aquí lo vuelvo a quitar para que no imprima todo de color verde
                }
            }
            System.out.println(" ");
        }
    }
    static void ejercicio6(){
        System.out.println("Crea una version facil del juego de hundir la flota para que funcione de la siguiente manera");
        System.out.println("Se debe usar una matriz de 5 x 5 para localizar y destruir un barco enemigo ");
        System.out.println("A continuacion, se le pedira al usuario que haga su jugada especificando la fila (1-5) y la columna (A-E). Ej.: 4B ");
        System.out.println("Si el disparo impacta en alguna de las posiciones que ocupa el barco enemigo, entonces en el tablero aparecera un (*) en esa posicion");
        System.out.println("Si el disparo falla, entonces se mostrara una (x) ");
        System.out.println("No hay limite de intentos ");
        System.out.println("");
     
        String[] colum = {" ", "A", "B", "C", "D", "E"};
        int[] fila = {1,2,3,4,5};
        char[][] tabEnemy = new char[5][5];
        char[][] tabJug = new char[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabEnemy[i][j] = '-'; //al poner los 2 arrays a la vez dentro del for se le asignan los guiones a los 2 a la vez 
                tabJug[i][j] = '-';
            }
        }
        int barcoFila = random.nextInt(4); //pongo de límite 4 porque voy a asignar +1 a la fila que me de para que haga el 2x2
        int barcoCol = random.nextInt(4);   // igual que con la fila pondré +1 a la columna
        
        tabEnemy[barcoFila][barcoCol] = 'B'; //aquí introduzco el barco en la posición aleatoria
        tabEnemy[barcoFila][barcoCol+1] = 'B';
        tabEnemy[barcoFila+1][barcoCol] = 'B';
        tabEnemy[barcoFila+1][barcoCol+1] = 'B';
        
        boolean hundido = false;
        
        while (!hundido) {
        // Tablero de juego
            for (String col : colum) {
                System.out.printf("%-10s", col);
            }
            System.out.println("");

            for (int i = 0; i < fila.length; i++) {
                System.out.printf("%-10s", fila[i]);
                for (int j = 0; j < fila.length; j++) {
                    System.out.printf("%-10s", tabJug[i][j]);
                }
                System.out.println(" ");
            }
        //jugada usuario
            System.out.println("Introduce el numero de fila y la letra de la columna (Ejemplo: 4B)");
            String jugadaS = sc.nextLine().toUpperCase();
            char jugadaFChar = jugadaS.charAt(0);
            char jugadaCChar = jugadaS.charAt(1);
        // Pasar los char al array
            int jugadaF = jugadaFChar -'1'; // la jugada de la fila que elija el jugador hay que restarle -1 ya que el array empieza en 0
            int jugadaC = jugadaCChar -'A'; // para la columna es distinto A tiene un valor numerico de 65 así que si pongo A - A tendrá un valor de 0 que quedará perfecto para el Array
            // Si el jugador pone B será b - A que es 1 y así sucesivamente
            // También podría poner if's pero es mas tedioso
            //  if (jugadaC == 'A') { 
            
            
            if (jugadaF >= 0 && jugadaF <= 5 && jugadaC >= 0 && jugadaC <= 5){ 
                if (tabEnemy[jugadaF][jugadaC] == 'B'){
                    tabJug[jugadaF][jugadaC] = '*';
                    System.out.println("Le diste al barco enemigo!!");
                } else {
                    tabJug[jugadaF][jugadaC] = 'X';
                    System.out.println("Fallaste");
                }
            //Comparo el tablero con el del jugador y veo si las B y los * coinciden para comprobar si el barco está hundido
                hundido = true; //pongo hundido como true porque así se cierra el while si el if no sale false
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (tabEnemy[i][j] == 'B' && tabJug[i][j] != '*'){
                            hundido = false;
                        } 
                    }
                        
                }
                    if (hundido) {
                        System.out.println("Has hundido el barco!!");
                        // Este tablero lo añado solo para que se vea el resultado final del barco
                        for (String col : colum) {
                            System.out.printf("%-10s", col);
                        }
                        System.out.println(" ");
                        
                        for (int i = 0; i < fila.length; i++) {
                            System.out.printf("%-10s", fila[i]);
                            for (int j = 0; j < fila.length; j++) {
                                System.out.printf("%-10s", tabJug[i][j]);   
                            }
                            System.out.println(" ");
                        }
                    }
            } else {
                System.out.println("No has intoducido una jugada valida");
            }          
        }
    }
}

