/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class BufferedWriter_ej {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Escribe la ruta");
        String path = sc.nextLine();
        File folder = new File(path);
        
        if (!folder.exists()) {
            folder.mkdir();
        }
        
        System.out.println("Escribe el nombre del archivo");
        String fileName = sc.nextLine();
        File archivo = new File (folder, fileName);
        
        System.out.println("Escribe la primera linea");
        String f1 = sc.nextLine();
        System.out.println("Escribe la segunda linea");
        String f2 = sc.nextLine();
        System.out.println("Escribe la tercera linea");
        String f3 = sc.nextLine();
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(f1);
            bw.newLine();
            bw.write(f2);
            bw.newLine();
            bw.write(f3);
            bw.newLine();
            System.out.println("Archivo completado");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
