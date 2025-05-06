/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.text.Document;


/**
 *
 * @author miriamhernav
 */
public class Funciones {
    
    public static void createFolder(String fileName) {
        File folder = new File (fileName);
        
        if (!folder.exists()) { 
            folder.mkdirs(); //esto no solo crea la carpeta, crea el directorio entero si no existe 
        }
    }
        
    public static void createFile(String path, String fileName, String content) throws IOException {
        File folder = new File (path);
        
        if (!folder.exists()) { 
            folder.mkdirs(); //creamos la carpeta y el directorio si no existe como antes 
        }
        
        File archivo = new File (folder, fileName); // esto crea el archivo deltro de la carpeta que hayamops creado
        // ej: si folder= archivos y fileName = documento.txt, quedaría archivos/documento.txt
        
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(content + System.lineSeparator());
        }
        
    }
    
    public static String[] showFiles(String path) {
        File folder = new File(path); // esto solo crea un objeto que representa la ruta pero nada mas, es como un punteroi
        
        if (!folder.exists()) {
            return null;
        }
        
        File[] archivos = folder.listFiles(); //folder es la carpeta que queremos ver, y listFiles lista los archivos de dentro Y con eso creamos un array archivos con todo el contenido
        String[] nomArchivos = new String[archivos.length]; // hacemos un arrya de tipo string
        
        for (int i = 0; i < archivos.length; i++) {
            nomArchivos[i] = archivos[i].getName(); //con getname pillamos el nombre del archivo del array tipo file y lo metemos en el array de string para convertirlo 
        }
        return nomArchivos;
    }
    
    public static String showFile(String path, String fileName) throws FileNotFoundException, IOException {
        File archivo = new File (path, fileName);// ruta y nombre del archivo que se pide
        
        if (!archivo.exists() || !archivo.isFile()) { // estoverifica si existe y si es válido el archivo o es una carpeto o otra coas
            throw new FileNotFoundException (fileName);
        }
        StringBuilder sb = new StringBuilder(); //esto acumulatexto de forma más eficiente en vez de concatenar que es mas pesado
        // con el try no hace falta cerrar el archivo, lo hace de forma automática si no habría que escribir sb.close()
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) { //BufferedReader es un lector que lee texto desde un archivo y FileReader abre el archivo para lectura.
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append(System.lineSeparator()); // el line separator es para añadir un salto de linea independientemente del sistema operativo
        }
    }
        return sb.toString();
    }
    
    public static boolean OverWriteFile(String path, String fileName, String newContent) throws IOException {
        File archivo = new File(path, fileName);
        
        if (!archivo.exists() || !archivo.isFile()) {
            return false; //si no existe devuelve false
        }
        // con el try no hace falta cerrar el archivo, lo hace de forma automática si no habría que escribir escriveArchivo.close()
        // abrimos el archivo para escribir
        try (FileWriter escriveArchivo = new FileWriter(archivo, false)){//el false significa que no haces append sino que sobreescribes
            // si se pusiera true, el texto se añadiría al final
            escriveArchivo.write(newContent + System.lineSeparator()); 
            
        }
        return true;
    }
    
    public static void deleteFile(String path, String fileName) {
        File archivo = new File(path, fileName);
        
        if (archivo.exists() && archivo.isFile()) { //si existe y es un archivo válido
            archivo.delete(); // esto borra el archivo
        }
    }
    
    public static int countChars(String path, String fileName) throws FileNotFoundException, IOException {
        File archivo = new File (path, fileName);
        
        if (!archivo.exists() || !archivo.isFile()) { 
            throw new FileNotFoundException (fileName);
        }
        
        int contador = 0;
        
        // //BufferedReader es un lector que lee texto desde un archivo y FileReader abre el archivo para lectura
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int chars;
            while ((chars = br.read()) != -1) { // esto hace que mientras chars no sea -1 se repite
                //java devuelve numeros positivos cuando tiene algo que ller pero si devuleve -1 es su forma de indicar que no hay mas datos para leer 
                contador ++;
            }
        }
        return contador;
    }
    
    public static int countWords(String path, String fileName) throws FileNotFoundException, IOException {
        File archivo = new File (path, fileName);
        
        if (!archivo.exists() || !archivo.isFile()) { 
            throw new FileNotFoundException (fileName);
        }
        
        int contador = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while((line = br.readLine()) != null) { // esto lle linea por linea mientras no se anull
                String[] palabras = line.trim().split("\\s+"); // divide las lineas por palabras y borra los espacios del principio y fin
                if (!line.trim().isEmpty()){ // esto evita leer lineas en blanco
                    contador += palabras.length; // y esto suma la cantidad de palabras
                   
                }
            }
        }
        return contador;
    }
    
     public static String swapWords(String path, String fileName, String oldWord, String newWord) throws FileNotFoundException, IOException {
        File archivo = new File (path, fileName);
        
        if (!archivo.exists() || !archivo.isFile()) { 
            throw new FileNotFoundException (fileName);
        }
        
        StringBuilder content = new StringBuilder(); // aquí creamos un StringBuilder  donde se va guardando el contenido  mientras se lee parqa despues poder sustituir la palabra que queramos
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) { // esto lee el archivo
            String line; 
            while((line = br.readLine()) != null) { //readLine lo lee linea por linea
                content.append(line).append(System.lineSeparator()); //y esto va añadiendo cada linea al StringBuilder content de antes
            }
        }
        // aquí se pasan a reemplazar las antiguas palabras con las nuevas
        String newContent = content.toString().replace(oldWord, newWord);
        
        try (FileWriter writer = new FileWriter(archivo, false)) { //el false indica que no se añade al final sino que se sustituye el contenido
            writer.write(newContent); // y aquí se sobre escribe el archivo
        }
        // revisar que cuenta chars en vez de palabras
        return newContent;
    }
    
}
