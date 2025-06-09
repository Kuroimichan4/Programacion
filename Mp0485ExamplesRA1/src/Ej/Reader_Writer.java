/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Reader_Writer {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica la ruta del archivo");
        String path = sc.nextLine();
        File folder = new File(path);
        
        if (!folder.exists()) {
            folder.mkdirs();
        }
        
        System.out.println("Indica el nommbre del archivo");
        String fileName = sc.nextLine();
        File archivo = new File(folder, fileName);
        
        System.out.println("Escribe el contenido del archivo");
        String content = sc.nextLine();

        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(content + System.lineSeparator());
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
