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
public class Camion extends Vehiculo{
    private static final double MAX = 120.0;
    // ATRIBUTOS ("encapsulación" : no permitir los accesos directos a los atributos) es peligroso
    
    private int carga;
    private int altura;

    // CONSTRUCTORES
    
    public Camion(){
        // CONSTRUCTOR SIN PARAMETROS
    }

    public Camion(String marca, String plaque, String model, int power, int capacity, ColorEnum color, MotorEnum motor, double speed, String fabricationDate, int carga, int altura, double peso) {
        //CONSTRUCTROS CON TODOS LOS PARAMETROS
        super(marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, peso);
        this.carga = carga;
        this.altura = altura;
    }
    
// GETTERs & SETTERs

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String toString() { // Esto es mas eficiente que concatenar strings. Cada vez que concatenamos un string, se genera otro string que es almacenado
        // usando este metodo, modificamos el string original. Es un poco parecido a pasar datos por valor o referencia
        StringBuilder sb = new StringBuilder(); // esto es un objeto
        
        if (carga > 0) sb.append("\ncarga: ").append(carga);
        if (altura > 0) sb.append("\naltura: ").append(altura);
        sb.append("\n FIN-CAMION\n");
        return sb.toString(); // esto retorna el string que se ha creado con el objeto 
    }
    
    // METODOS PROPIOS ----------------------------------------
    
     @Override
    public double calcularConsumo() {
       
        double consumo = 0;
        
        consumo = this.getPeso() * 15/100;
        
        return consumo;
        
    
    }
    
    
}

    
