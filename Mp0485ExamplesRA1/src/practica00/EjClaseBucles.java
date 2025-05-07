/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica00;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class EjClaseBucles {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int sumanotas = 0;
        int numalumno = 1;
        int maximo = 5;
        
        while (numalumno <= maximo) {
            System.out.println("Introduce la nota del alumno" + numalumno);//se pone el ++ al principio para que sume ya desde la primera operación
            int nota = sc.nextInt();
            sumanotas = sumanotas + nota;
            numalumno = numalumno +1;
        }// es distinto poner ++nota y nota++, si se pone delante se le suma en el momento, si se pone detrás se suma después de printarlo
        // variable1 = variable 1 + variable2 es igual que variable1 += b¡variable2
        System.out.println("Nota media = " + (sumanotas / (numalumno-1)));
    }  
}
import java.util.Scanner;

public class JuegoDeCombate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Crear el objeto Scanner

        int heroV = 100;
        int enemyV = 100;
        int rondas = 1;
        int hit;

        System.out.println("Eres el Heroe de esta tierra y el enemigo ha venido a destruirte");
        System.out.println("Tendrás que luchar con él");
        System.out.println("Elige sabiamente tus ataques");

        // Bucle de combate
        while (heroV > 0 && enemyV > 0) {
            System.out.printf("---------- Ronda %d ----------\n", rondas++);

            // Elección de ataque del héroe
            System.out.println("Elige tu ataque");
            System.out.println("1 - Patada");
            System.out.println("2 - Mandoble");
            int ataque = sc.nextInt();
            sc.nextLine().trim();

            // Lógica para el ataque del héroe
            int hitHeroe = calcularAtaque(ataque, "Héroe");
            enemyV -= hitHeroe;

            // Lógica para el ataque del enemigo
            int hitEnemigo = calcularAtaque((int) (Math.random() * 2) + 1, "Enemigo"); // El enemigo elige aleatoriamente entre 1 y 2
            heroV -= hitEnemigo;

            // Mostrar el estado después de ambos ataques
            mostrarEstado("Héroe", hitHeroe, heroV, enemyV);
            mostrarEstado("Villano", hitEnemigo, enemyV, heroV);

            // Verificar si alguien ha perdido
            if (enemyV <= 0) {
                System.out.println("¡Ganaste!");
                break;
            } else if (heroV <= 0) {
                System.out.println("Perdiste y condenaste a la humanidad");
                break;
            }
        }
    }

    // Método para calcular el daño de un ataque
    public static int calcularAtaque(int tipoAtaque, String personaje) {
        double random = Math.random();
        random = random * 10;
        int ran = (int) random + 1;  // Asegura que el valor sea entre 1 y 10
        int hit = 0;

        if (tipoAtaque == 1) { // Patada
            hit = ran * 2;
            if (hit < 5) {
                hit = 5;
            } else if (hit > 15) {
                System.out.println(personaje + " realiza un golpe crítico");
            }
        } else if (tipoAtaque == 2) { // Mandoble
            hit = ran * 3;
            if (hit < 10) {
                hit = 10;
            } else if (hit > 25) {
                System.out.println(personaje + " realiza un golpe crítico");
            }
        }
        return hit;
    }

    // Método para mostrar el estado después de un ataque
    public static void mostrarEstado(String personaje, int hit, int vidaHeroe, int vidaEnemigo) {
        System.out.println(personaje);
        System.out.printf("%-20s%-20s\n", "ATQ " + personaje, "VIT " + personaje);
        System.out.printf("%-20s%-20s\n", hit, personaje.equals("Héroe") ? vidaHeroe : vidaEnemigo);
        System.out.println("Te hizo un ataque de " + hit);
    }
}
