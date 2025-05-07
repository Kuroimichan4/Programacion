/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class EjExamenAguaSequia {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce el numero de dias a calcular");
        int dias = sc.nextInt();
        sc.nextLine();
        System.out.println("Y cual es el limite de litros de esos dias?");
        int limiteDiario = sc.nextInt();
        sc.nextLine();
        int aguaTotal = 0;
    
        for (int i = 0; i < dias; i++) {
            System.out.println("Dime la cantidad de agua consumida del dia " + (i+1));
            int agua = sc.nextInt();
            aguaTotal = aguaTotal + agua;
        }
        if (limiteDiario < aguaTotal){
            System.out.println("El total de agua consumida es " + aguaTotal + "L Has excedido el limite");
        } else {
            System.out.println("Tu consumo es " + aguaTotal + "L No llegaste al limite. Viva la sostenibilidad!");
        }   
    }
}
