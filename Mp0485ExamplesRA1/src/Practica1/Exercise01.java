/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

/**
 *
 * @author miriamhernav
 */
public class Exercise01 {
      static String id = "41008859U";
    public static void main(String args[ ]) {
            System.out.println("Miriam");
            boolean idOk = true;
             
            if (idOk) { // Si todo lo demás da true
                char letraId = id.charAt(8); //esta parte comprueba la letra del NIF
                char[] letrasPermitidas = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                for (char letra : letrasPermitidas) {
                    if (letra == letraId){
                        System.out.println(" Es valido LETRA");
                        idOk = true;
                        
                    } else {
                        System.out.println("Novale letra");
                        idOk = false;
                        
                    } 
                    
                }
            } 
            
            
            
            
            
            
            
            
            
    }
}
