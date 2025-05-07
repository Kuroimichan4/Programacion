/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej;

/**
 *
 * @author Lucifer
 */
public class comparaciónCaracteres {
    public static void main(String[] args) {
        // Mayus y minus al introducir valores
        String isAlphabetic = sc.nextLine().toUpperCase();
        String isAlphabetic = sc.nextLine().toLowerCase();
        // Mayus y Minus al comparar Strings
        while (!op.equalsIgnoreCase("E"));
        if (nombreVariable.equalsIgnoreCase("E"))
        
         // para ver la ultima posición de un string
        char lastChar = dom.charAt(dom.length()-1);  
        
        //para comprobar si el carácter está dentro del rango de letras ASCII o numero con isDigit
        char firstChar = user.charAt(0);
    if (!Character.isDigit(firstChar) && !(firstChar >= 'a' && firstChar <= 'z') && !(firstChar >= 'A' && firstChar <= 'Z')) {
        return false; // Si no es una letra o un número, no es válido
    }
    //Tanto Character.isDigit como Character.isLetter son métodos estáticos que pertenecen a la clase Character
    char letraIni = user.charAt(0); 
        if (!Character.isLetterOrDigit(letraIni)){ //Si no es una letra compruebo si es un numero
            return false;
        }
char letraIni = user.charAt(0); 
        if (Character.isLetterOrDigit(user.charAt(0))){ //Si no es una letra compruebo si es un numero
            return false;
        }
    
        boolean letraOk = false; 
        char letraIni = user.charAt(0); 
        for (char letra : abc) { // recorro el array abc para ver si es una letra    
            if (letra == letraIni ){
                letraOk = true;
                break;
            }
        }    
        if (!letraOk)
            if (!Character.isDigit(letraIni)){ //Si no es una letra compruebo si es un numero
                return false; 
                
        }
        
    
        
    }
    
    
           
}
