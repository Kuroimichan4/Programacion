/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import static Ej.BufferedWriter_ej.sc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class BufferedReader_ej {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe la ruta");
        String path = sc.nextLine();
        File folder = new File(path);
        
        System.out.println("Escribe el nombre del archivo");
        String fileName = sc.nextLine();
        File archivo = new File(folder, fileName);
        
        if (!archivo.exists()) {
            try {
                throw new FileNotFoundException(fileName);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
        String line;
        int contLine = 0;
        int contPalabras = 0;
        int contChar = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            while ((line = br.readLine()) != null) {
                contLine ++;
                if (!line.trim().isEmpty()) {
                    contChar += line.length();
                    String[] palabras = line.trim().split("\\s+");
                    contPalabras += palabras.length;
                }
            }
            System.out.println("Líneas: " + contLine);
            System.out.println("Palabras: " + contPalabras);
            System.out.println("Caracteres (sin saltos de línea): " + contChar);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage()); 
        } catch (IOException ex) {
            Logger.getLogger(BufferedReader_ej.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
