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
public class Moto extends Vehiculo {
    private static final double MAX = 120.0;
    // ATRIBUTOS ("encapsulación" : no permitir los accesos directos a los atributos) es peligroso
    
    private boolean tieneSidecar;
    private int cilindrada;
    
    

    // CONSTRUCTORES
    
    public Moto(){
        // CONSTRUCTOR SIN PARAMETROS
        super();
    }

    public Moto(String marca, String plaque, String model, int power, int capacity, ColorEnum color, MotorEnum motor, double speed, String fabricationDate, boolean tieneSidecar, int cilindrada, double peso) {
        //CONSTRUCTROS CON TODOS LOS PARAMETROS
        super(marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, peso);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
        
    }
    
    public boolean isTieneSidecar() {         return tieneSidecar; 
    }
 
    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

// GETTERs & SETTERs

    public void setCilindrada(int cilindrada) {    
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        // Esto es mas eficiente que concatenar strings. Cada vez que concatenamos un string, se genera otro string que es almacenado
        // usando este metodo, modificamos el string original. Es un poco parecido a pasar datos por valor o referencia
        StringBuilder sb = new StringBuilder(); // esto es un objeto
        
        sb.append(super.toString());
        if (tieneSidecar) sb.append("\ntieneSidecar: ").append(tieneSidecar);
        if (cilindrada > 0) sb.append("\ncilindrada: ").append(cilindrada);
        sb.append("FIN-MOTO\n");
        return sb.toString(); // esto retorna el string que se ha creado con el objeto 
    }
    // METODOS PROPIOS ----------------------------------------

    @Override
    public double calcularConsumo() {
       
        double consumo = 0;
        
        consumo = this.getPeso() * 5/100;
        
        return consumo;
        
    
    }
    
    
    
    
    
}

    
