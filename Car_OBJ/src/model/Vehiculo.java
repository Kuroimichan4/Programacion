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
// public class Vehiculo {  (como estaba antes)
public abstract class Vehiculo {
    //Una clase normal es aquella que podemos instanciar directamente (crear objetos a partir de ella).
    // ✅ Ventaja: Se puede instanciar sin restricciones.
    // ❌ Desventaja: No impide que alguien cree una Persona genérica, lo que podría ser un problema si solo queremos que existan Soldados y Médicos
    // Una clase abstracta es una plantilla para otras clases. No se puede instanciar directamente y puede contener métodos sin implementación (abstract).
    //
   
    private static final double MAX = 120.0;
    // ATRIBUTOS ("encapsulación" : no permitir los accesos directos a los atributos) es peligroso
    private String marca; // marca
    private Double peso;
    private String plaque; //(matricula)
    private String model;
    private int power;
    private int capacity;
    private ColorEnum color;
    private MotorEnum motor;
    private double speed;
    private String fabricationDate;
  
    // CONSTRUCTORES
    
    public Vehiculo(){
        // CONSTRUCTOR SIN PARAMETROS
    }
//       CONSTRUCTROS CON TODOS LOS PARAMETROS
    public Vehiculo(String marca, String plaque, String model, int power, int capacity, ColorEnum color, MotorEnum motor, double speed, String fabricationDate, double peso) {
        this.marca = marca;
        this.plaque = plaque;
        this.model = model;
        this.power = power;
        this.capacity = capacity;
        this.color = color;
        this.motor = motor;
        this.speed = speed;
        this.fabricationDate = fabricationDate;
        this.peso = peso;
    }

    // ---- Aunque se llaman igual tienen distintos parametros de entrada ----
    // ---- así que dependiendo de los parametros introducidos se seleccionará el adecuado
    public Vehiculo(String iMarca, String iModel, int iPower, int iCapacity, MotorEnum iMotor){ // i de input
       //CONSTRUCTROS CON TODOS LOS PARAMETROS (pero no todos los de arriba porque igual nos interesa no tener que poner todos los datos)
       // en el caso de los coches por ejemplo puede ser que al salir de fábrica no tengan matricula asignada o incluso color 
        marca = iMarca;
        model = iModel;
        power = iPower;
        capacity = iCapacity;
        motor = iMotor; 
    }

// GETTERs & SETTERs
// SETTERs (establece valores)
// GETTERs
    

    public String getMarca() {
        return marca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public MotorEnum getMotor() {
        return motor;
    }

    public void setMotor(MotorEnum motor) {
        this.motor = motor;
    }
    
    public void setSpeed(double speed) { 
        if (speed >= MAX){ 
            this.speed = MAX;
        } else if (speed < 0) {
            this.speed = 0;
        } else {
             this.speed = speed;
        }
    }
    
    public double getSpeed() {
        return speed;
    }

    public String getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(String fabricationDate) {
        this.fabricationDate = fabricationDate;
    }  

    @Override //Esto es una anotación en Java que indica que estamos sobrescribiendo (modificando) un método que viene de una clase padre 'no se puede quitar'
    
    public String toString() { // Esto es mas eficiente que concatenar strings. Cada vez que concatenamos un string, se genera otro string que es almacenado y se crea otro objeto
        // usando este metodo, modificamos el string original. Es un poco parecido a pasar datos por valor o referencia
        StringBuilder sb = new StringBuilder(); // esto es un nuevo objeto creado
        sb.append("INICIO-CAR\n");
        if (marca != null) sb.append("Marca: ").append(marca).append("\n");
        if (plaque != null) sb.append("Plaque: ").append(plaque); // .append modificador de objeto que agrega partes el string
        if (model != null) sb.append("\nModel: ").append(model);
        if (power > 0) sb.append("\nPower: ").append(power);
        if (capacity > 0) sb.append("\nCapacity: ").append(capacity);
        if (color != null) sb.append("\nColor: ").append(color);
        if (motor != null) sb.append("\nMotor: ").append(motor);
        sb.append("\nSpeed: ").append(speed);
        if (peso != null) sb.append("\nPeso: ").append(peso);
        sb.append("\nConsumo: ").append(calConsumo()).append(" litros por cada 100 km");
        if (fabricationDate != null)sb.append("\nFabrication Date: ").append(fabricationDate).append("\n");
        
        // cada .append("") es como un + que concatena con el objeto
    
        return sb.toString(); // esto retorna el objeto en formato String
    }
 
    // METODOS PROPIOS ----------------------------------------
     
    public int calcularAntiguedad() {
        if (fabricationDate == null) {
            System.out.println("La fecha de fabricación no está disponible");
        }
        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period p = Period.between(LocalDate.parse(fabricationDate, dateTimeFormatter), currentDate);
        return p.getYears();
    }
    
    public void accelerate() {
        setSpeed(speed + 10);
    }
    
    public void brake() {
        setSpeed(speed - 10);
    }
    
    public void acelerate(float numA) {
        setSpeed(speed + numA);
    }
    
    public void brake(float numD) {
        setSpeed(speed - numD);
    }
    
    public double calConsumo(){
    if (peso == null) {
        System.out.println("Peso no disponible, no se puede calcular consumo.");
        return 0.0;
    }
    return peso * 10 / 100; // Por ejemplo 100KM 10L
    }
    // nuevo metodo abstracto
    public abstract double calcularConsumo();
    // esto es como el prototipo de una función
        
    

}

    
