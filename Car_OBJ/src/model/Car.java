/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author miriamhernav
 */

public class Car extends Vehiculo{ // estends es para que herede de vehículo

// ATRIBUTOS ("encapsulación" : no permitir los accesos directos a los atributos) es peligroso

    private int numDors;   
    

// CONSTRUCTORES
    
    public Car(){
        // CONSTRUCTOR SIN PARAMETROS
        super();
    }
    
//   CONSTRUCTORS CON TODOS LOS PARAMETROS
    public Car(String marca, String plaque, String model, int power, int capacity, ColorEnum color, MotorEnum motor, double speed, String fabricationDate, int numDors, double peso) {
        super(marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, peso);
        
        this.numDors = numDors;
        
    }

    // ---- Aunque se llaman igual tienen distintos parametros de entrada ----
    // ---- así que dependiendo de los parametros introducidos se seleccionará el adecuado
    public Car(String Marca, String Model, int Power, int Capacity, MotorEnum Motor){ // i de input
       //CONSTRUCTROS CON TODOS LOS PARAMETROS (pero no todos los de arriba porque igual nos interesa no tener que poner todos los datos)
       // en el caso de los coches por ejemplo puede ser que al salir de fábrica no tengan matricula asignada o incluso color 
       super(Marca, Model, Power, Capacity, Motor);

    }

// GETTERs & SETTERs

    public int getNumDors() {
        return numDors;
    }

    public void setNumDors(int numDors) {
        this.numDors = numDors;
    }

    @Override //Esto es una anotación en Java que indica que estamos sobrescribiendo (modificando) un método que viene de una clase padre

    public String toString() { // Esto es mas eficiente que concatenar strings. Cada vez que concatenamos un string, se genera otro string que es almacenado
        // usando este metodo, modificamos el string original. Es un poco parecido a pasar datos por valor o referencia
        StringBuilder sb = new StringBuilder(); // esto es un objeto
        
        sb.append(super.toString());
        
        if (numDors > 0) sb.append("numDors: ").append(numDors);
       
        sb.append("\nFIN-COCHE\n");
        
        return sb.toString(); // esto retorna el string que se ha creado con el objeto 
    }
    
    // METODOS PROPIOS ----------------------------------------

    @Override // esto es por haber añadido el abstract
    public double calcularConsumo() {
       
        double consumo = 0;
        
        consumo = this.getPeso() * 10/100;
        
        return consumo;
        
    
    }
    
    

    
}

    
