/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class ShowFiles {
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe la ruta del archivo");
        String path = sc.nextLine();
        File folder = new File(path);
        
        File[] archivos = folder.listFiles();
        String[] listaArchivos = new String[archivos.length];
        
        for (int i = 0; i < archivos.length; i++) {
            listaArchivos[i] = archivos[i].getName();
            System.out.println(listaArchivos[i]);
        }
    }
}


