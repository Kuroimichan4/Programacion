/* caracteres caracteres
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;

import java.time.LocalDate; // mirar como hacer modo debug en java
import model.exceptions.NonAlphabeticException;
import model.exceptions.NonNumericException;

public class UserDataValidations {
    
    public static void isNumeric(String isNumeric) throws NonNumericException{
        boolean isNumericOk = false;
        
        for (int i = 0; i < isNumeric.length(); i++) {
            if (!Character.isDigit(isNumeric.charAt(i))) {
                throw new NonNumericException("Se han introducido caracteres no numericos");
                 
            } 
        }
    }
    public static void isAlphabetic(String isAlphabetic) throws NonAlphabeticException{
        boolean isAlphabeticOk = false;
        
        for (int i = 0; i < isAlphabetic.length(); i++) {
            if (!Character.isLetter(isAlphabetic.charAt(i))) {
                throw new NonAlphabeticException("Se han introducido caracteres no alfabeticos");
            }
        }
    }
}



