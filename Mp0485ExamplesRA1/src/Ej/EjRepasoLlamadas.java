/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

/**
 *
 * @author miriamhernav
 */
public class EjRepasoLlamadas {
    public static void main(String[] args) {
        System.out.println(nombre());
    }
    
    public static String nombre(){
        int edad = sumaEdad(28);
        String nom = "Papadopoulos";
        System.out.println(nom);
        return ("Tu edad es: " + edad);
    }
    public static int sumaEdad(int num){
     int cumple = num + 1;
     return cumple;
    }
}
