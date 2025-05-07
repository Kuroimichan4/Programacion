/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experimentos_Intr_Cursos;

/**
 *
 * @author Lucifer
 */
public class PruebaCurso4Variable {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        
        
        byte n1 = 100;
        short n2 = 1000;
        int n3 = 100000;
        long n4 = 1000000000L;
        float n5 = 3.14f;
        /** se pone f al final para indicar que es un float en específico, si no se sobreentiende que es double */
        double n6 = 3.14159d;
        /** al double se le puede poner o no la d ya que sobreentiende */
        char letra = 'A';
        boolean valor = true;

        System.out.println("Tipo de dato byte "+ n1);
        System.out.println("Tipo de dato short "+n2);
        System.out.println("Tipo de dato int "+n3);
        System.out.println("Tipo de dato long "+n4);
        System.out.println("Tipo de dato float "+n5);
        System.out.println("Tipo de dato double "+n6);
        System.out.println("Tipo de dato char "+letra);
        System.out.println("Tipo de dato long "+valor);
        System.out.println("El total de la suma es " + (x+y));
    }  
}
