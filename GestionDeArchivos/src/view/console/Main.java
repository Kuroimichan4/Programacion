/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author miriamhernav
 */
public class Main {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        String fileName = "";
        String op = "";
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Crear carpeta");
            System.out.println("2. Crear archivo");
            System.out.println("3. Ver archivos");
            System.out.println("4. Ver archivo seleccionado");
            System.out.println("5. Sobreescribir fichero");
            System.out.println("6. Borrar fichero");
            System.out.println("7. Contar caracteres del fichero");
            System.out.println("8. Contar palabras del fichero");
            System.out.println("9. Crea un PDF");
            
            
            System.out.println("Opcion: ");
            op = sc.next();
            
            switch (op) {
                case "1":
                    testCreateFolder();
                    break;
                case "2":
                    testCreateFile();
                    break;
                case "3":
                    testShowFiles();
                    break;
                case "4":
                    testShowFile();
                    break;
                case "5":
                    testOverWriteFile();
                    break;
                case "6":
                    testDeleteFile();
                    break;
                case "7":
                    testCountChars();
                    break;
                case "8":
                    testCountWords();
                    break;
                case "9":
                    testSwapWords();
                    break;
                    
                default:
                break;
            } 
        } while (!op.equalsIgnoreCase("z"));
    }

    private static void testCreateFolder() {
        sc.nextLine();// para limpiar y que no salte la linea
        System.out.println("Crear carpetas");
        System.out.println("Introduce el nombre de la carpeta: ");
        String fileName = sc.nextLine();
        
        model.Funciones.createFolder(fileName); //esta es la ruta para las funciones
        System.out.println("Carpeta creada");
    }
    
    private static void testCreateFile() {
        sc.nextLine();
        System.out.println("Escribe el nombre del archivo");
        String fileName = sc.nextLine();
        
        System.out.println("Escribe el contenido del archivo");
        String content = sc.nextLine();
        
        System.out.println("Escribe la ruta donde guardaras el archivo (Ej: 'archivos/)");
        String path = sc.nextLine();
        
        try {
            model.Funciones.createFile(path, fileName, content);
            System.out.println("Se ha creado y guardado el archivo");
        } catch (IOException ex) {
            System.out.println("Error al crear el archivo: " + ex.getMessage());
        }
    }
    
    private static void testShowFiles() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo");
        String path = sc.nextLine();
        
        try {
            String[] archivos = model.Funciones.showFiles(path);
            
            if (archivos == null){
                System.out.println("La carpeta está vacía o no existe");
            } else {
                System.out.println("Archivos encontrados: ");
                for (String nombre : archivos) {
                    System.out.println("1. " + nombre);
                }
            }
            
        } catch (Exception ex){
               System.out.println("Error al mostrar los archivos");
        }        
    }
    
    private static void testShowFile() {
        sc.nextLine();
        System.out.println("Escribe el nombre de la carpeta: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo: ");
        String fileName = sc.nextLine();
        
        try {
            String content = model.Funciones.showFile(path, fileName);
            System.out.println("Contenido del archivo: ");
            System.out.println("-----------------------");
            System.out.println(content);
        } catch (FileNotFoundException ex) {
            System.out.println(" No se pudo leer el archivo: " + ex.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private static void testOverWriteFile() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo: ");
        String fileName = sc.nextLine();
        
        System.out.println("Escribe el contenido del archivo: ");
        String newContent = sc.nextLine();
        
        try {
            boolean result = model.Funciones.OverWriteFile(path, fileName, newContent);
            
            if (result) {
                System.out.println("Archivo reescrito correctamente");
            } else {
                System.out.println("El archivo no existe o no se pudo sobreescribir");
            }
            
        } catch (IOException ex) {
            System.out.println("Error al sobreescibir el archivo: " + ex.getMessage());
        }
        
    }
    
    private static void testDeleteFile() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo que quieres borrar: ");
        String fileName = sc.nextLine();
        
        try {
            model.Funciones.deleteFile(path, fileName);
        } catch (Exception ex) {
            System.out.println("Error al intentar borrar el archivo: " + ex.getMessage());
        }
    }
    
    private static void testCountChars() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo: ");
        String fileName = sc.nextLine();
        
        try {
            int total = model.Funciones.countChars(path, fileName);
            System.out.println("El total de caracteres dentro del archivo es: " + total);
        } catch (FileNotFoundException ex ) {
            System.out.println("Archivo no encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
        
    }
    
    private static void testCountWords() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo: ");
        String fileName = sc.nextLine();
        
        try {
            int total = model.Funciones.countWords(path, fileName);
            System.out.println("El total de palabras dentro del archivo es: " + total);
        } catch (FileNotFoundException ex ) {
            System.out.println("Archivo no encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
    
    private static void testSwapWords() {
        sc.nextLine();
        System.out.println("Escribe la ruta del archivo: ");
        String path = sc.nextLine();
        
        System.out.println("Escribe el nombre del archivo: ");
        String fileName = sc.nextLine();
        
        System.out.println("Escribe la palabra que quieres cambiar: ");
        String oldWord = sc.nextLine();
        
        System.out.println("Escribe la nueva palabra que quieres poner: ");
        String newWord = sc.nextLine();
        
         try {
            String newContent = model.Funciones.swapWords(path, fileName, oldWord, newWord);
            System.out.println("Palabras reemplazadas. El nuevo contenido es:");
            System.out.println("-----------------------------------");
            System.out.println(newContent);
        } catch (IOException ex) {
            System.out.println("Error al modificar el archivo: " + ex.getMessage());
        }
    }

}
