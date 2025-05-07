/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

/**
 *
 * @author Lucifer
 */
public class Prueba1 {
    static String id = "41008859H";
    static int typeDoc = 2;
    public static void main(String[] args) {
        boolean idOk = false;
        
        if (typeDoc == 1) {
            if (id.length() == 9) { //si su longitud es 9 es ok y seguimos la comprobación
                for (int i = 0; i < id.length() -1; i++) { // hago que recorra los carácteres de length menos el último xq debe ser una letra
                    if (!Character.isDigit(id.charAt(i))) { //Character.isDigit es un método. Comprueba si un carácter es un numero
                        idOk = false;
                        System.out.println("no vale if nums");
                        break;      
                    } else {
                        System.out.println("if nums OK");
                        idOk = true;
                    }
                } 
                if (idOk) { // Si todo lo demás da true
                    char letraId = id.charAt(8); //esta parte comprueba la letra del NIF
                    char[] letrasPermitidas = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                    for (char letra : letrasPermitidas) {
                        if (letra == letraId){
                            System.out.println(" Es valido LETRA");
                            idOk = true;
                            break;
                        } else {
                            System.out.println("Novale letra");
                            idOk = false;  
                        }                     
                    }
                } 

            } else { // La longitud no es 9
                idOk = false;  
                System.out.println("no vale fuera todo LONG");
            } 
            
            
        } else {
            System.out.println("Documento NIE no valido");
            idOk = false;
        
             
    }
}

//// TODO LO ANTERIOR PUEDE SER SUSTITUIDO POR: 
//public boolean checkId(int typeDoc, String id) {
//        if (typeDoc == 1) {  // Si el tipo de documento es NIF
//            return id.matches("[0-9]{8}[A-Za-z]{1}");  // NIF español (8 dígitos + letra)
//        }
//        return false;  // Si el tipo de documento no es NIF, retornamos false
 
}

