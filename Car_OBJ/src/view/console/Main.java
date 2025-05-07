/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.util.ArrayList;
import java.util.Scanner;
import model.Camion;
import model.Car;
import model.ColorEnum;
import model.Moto;
import model.MotorEnum;
import model.Vehiculo;

/** // pedir a usuario introducción de datos de vehiculo, hacer menú para usuarios, dar matrículas creadas, a partir de una matricula encontrar los datos de ese vehículo, pedir matrícula y eliminar el vehículo
 *
 * @author miriamhernav
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { // mirar lo que es e implica static
        
//        Car c3 = new Car();
//        c3.setNumPuertas(5);
//        Vehiculo v = c3;
//        Car c4 = null;
//        if (v instanceof Car){
//        c4 =(Car) v;
//        }
//        System.out.println(c4);
        
        // ArrayList       
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        ArrayList<Car> listaCoches = new ArrayList<>();
        ArrayList<Moto> listaMotos = new ArrayList<>();
        ArrayList<Camion> listaCamiones = new ArrayList<>();

        String op = "";
        
        do {
            System.out.println("1. Crear e introducir datos de un Coche");
            System.out.println("2. Crear e introducir datos de una Moto");
            System.out.println("3. Crear e introducir datos de un Camion");
            System.out.println("4. Ver matriculas");
            System.out.println("5. Ver datos de los vehiculos (intoduce matricula)");
            System.out.println("6. Total de Vehiculos");
            System.out.println("7. Total de Coches");
            System.out.println("8. Total de Motos");
            System.out.println("9. Total de Camoines");
            System.out.println("10. Eliminar vehiculo (intoduce matricula)");
            
            op = sc.nextLine().trim();
        
            switch (op) {
                case "1":
                    addCar(listaVehiculos, listaCoches);
                    break;
                case "2":
                    addMoto(listaVehiculos, listaMotos);
                    break;
                case "3":
                    addCamion(listaVehiculos, listaCamiones);
                    break;
                case "4":
                    matriculas(listaVehiculos);
                    break;
                case "5":
                    info(listaVehiculos);
                    break;
                case "6":
                    listaV(listaVehiculos);
                    break;
                case "7":
                    listaC(listaCoches);
                    break;
                case "8":
                    listaM(listaMotos);
                    break;
                case "9":
                    listaT(listaCamiones);
                    
                    break;
                case "10":
                    erase(listaVehiculos);
                    break;
            }
        } while (!op.equalsIgnoreCase("E")); {
        }                    
    }  
    private static Car createCar(){
        
        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Matricula: ");
        String plaque = sc.nextLine();

        System.out.print("Modelo: ");
        String model = sc.nextLine();

        System.out.print("Potencia: ");
        int power = Integer.parseInt(sc.nextLine());

        System.out.print("Capacidad: ");
        int capacity = Integer.parseInt(sc.nextLine());

        System.out.print("Color (RED, BLUE, GREEN, etc.): ");
        ColorEnum color = ColorEnum.valueOf(sc.nextLine().toUpperCase());
        
//         //Para recorrer la clase colorEnum y no tener que poner red, blue y poner un numero
//                int num = 1;
//                for (ColorEnum value : ColorEnum.values()) {
//                    System.out.println(num + value.toString());
//                    num++;
//                }

        System.out.print("Motor (GAS, DIESEL, ELECTRIC): ");
        MotorEnum motor = MotorEnum.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Velocidad: ");
        double speed = Double.parseDouble(sc.nextLine());

        System.out.print("Fecha de fabricacion (dd/MM/yyyy): ");
        String fabricationDate = sc.nextLine();

        System.out.print("Numero de puertas: ");
        int numDors = Integer.parseInt(sc.nextLine());

        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        
        Car newCar = new Car(marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, numDors, peso);
        return newCar;
    }
    private static Moto createMoto(){
        
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        
        System.out.println("Matricula: ");
        String plaque = sc.nextLine();
        
        System.out.println("Modelo: ");
        String model = sc.nextLine();
        
        System.out.println("Potencia: ");
        int power = Integer.parseInt(sc.nextLine());
        
        System.out.println("Capacidad: ");
        int capacity = Integer.parseInt(sc.nextLine());
        
        System.out.println("Motor (GAS, DIESEL, ELECTRIC): ");
        ColorEnum color = ColorEnum.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("Motor (GAS, DIESEL, ELECTRIC): ");
        MotorEnum motor = MotorEnum.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("Speed: ");
        int speed = sc.nextInt();
        
        System.out.println("Fecha de fabricacion (dd/MM/yyyy): ");
        String fabricationDate = sc.nextLine();
        
        System.out.println("Tiene sidecar? ");
        boolean tieneSidecar = Boolean.parseBoolean(sc.nextLine());
        
        System.out.println("Cilindrada: ");
        int cilindrada = Integer.parseInt(sc.nextLine());
        
        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        
        Moto newMoto = new Moto(marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, tieneSidecar, cilindrada, peso);
        return newMoto;
    }
    private static Camion createCamion(){
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        
        System.out.println("Matricula: ");
        String plaque = sc.nextLine();
        
        System.out.println("Modelo: ");
        String model = sc.nextLine();
        
        System.out.println("Potencia: ");
        int power = Integer.parseInt(sc.nextLine());
        
        System.out.println("Capacidad: ");
        int capacity = Integer.parseInt(sc.nextLine());
        
        System.out.println("Color: ");
        ColorEnum color = ColorEnum.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("Motor: ");
        MotorEnum motor = MotorEnum.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("Speed: ");
        int speed = sc.nextInt();
        
        System.out.println("Fecha de fabricacion (dd/MM/yyyy): ");
        String fabricationDate = sc.nextLine();
        
        System.out.println("Carga: ");
        int carga = Integer.parseInt(sc.nextLine());
        
        System.out.println("Altura: ");
        int altura = Integer.parseInt(sc.nextLine());
        
        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        
        Camion newCamion = new Camion (marca, plaque, model, power, capacity, color, motor, speed, fabricationDate, carga, altura, peso);
        return newCamion;
    }
    
    private static void addCar(ArrayList<Vehiculo> listaVehiculos, ArrayList<Car> listaCoches ){
        // ArrayList<Vehiculo> es como el tipo de variable como decir int y listaVehiculos es el nombre de la variable nomo si fuera num1
        Car newCar = createCar();
        listaCoches.add(newCar);
        System.out.println("Coche creado correctamente:");
        System.out.println(newCar);
        listaVehiculos.add(newCar);
    }
    private static void addMoto(ArrayList<Vehiculo> listaVehiculos,ArrayList<Moto> listaMotos){
        Moto newMoto = createMoto();
        System.out.println("Moto creada correctamente:");
        System.out.println(newMoto);
        listaVehiculos.add(newMoto);
        listaMotos.add(newMoto);
    }
    private static void addCamion(ArrayList<Vehiculo> listaVehiculos,ArrayList<Camion> listaCamiones){
        Camion newCamion = createCamion();
        System.out.println("Camion creado correctamente:");
        System.out.println(newCamion);
        listaVehiculos.add(newCamion);
        listaCamiones.add(newCamion);
    }      

    private static void matriculas(ArrayList<Vehiculo> listaVehiculos){
        System.out.println("-------- Matriculas --------");

            for (Vehiculo vehiculo : listaVehiculos) {
                System.out.println("1. " + vehiculo.getPlaque());
                System.out.println("");
            }
    }
    private static void info(ArrayList<Vehiculo> listaVehiculos){
       
        System.out.println("---- Informacion de vehiculos ----");
        System.out.println("Introduzca la matricula del vehiculo a consultar: ");
        String plaqueS = sc.nextLine();
        boolean save = false;

        for (Vehiculo elemVehiculo : listaVehiculos) {
            if (elemVehiculo.getPlaque().equalsIgnoreCase(plaqueS)){
                System.out.println(elemVehiculo);
            }
        }
        if (!save){
            System.out.println("La matricula no se encuentra registrada");
        }
                   
    }
    private static void listaV(ArrayList<Vehiculo> listaVehiculos){
       
        System.out.println("------- Vehiculos Almacenados -------");
        for (Vehiculo coche : listaVehiculos) {
            System.out.println(coche);
        }

        System.out.println(listaVehiculos.size());   
    }
    private static void listaC(ArrayList<Car> listaCoches){
       
        System.out.println("------- Coches Almacenados -------");
        System.out.println("Total de Coches: " + listaCoches.size());
        for (Vehiculo coche : listaCoches) {
            System.out.println(coche);
        }   
    }
    private static void listaM(ArrayList<Moto> listaMotos){
       
        System.out.println("------- Motos Almacenadas -------");
        System.out.println("Total de Motos: " + listaMotos.size());
        for (Moto moto : listaMotos) {
            System.out.println(moto);
        }
    }
    private static void listaT(ArrayList<Camion> listaCamiones){
       
        System.out.println("------- Camiones Almacenados -------");
        System.out.println("Total de Camiones: " + listaCamiones.size());
        for (Camion camion : listaCamiones) {
            System.out.println(camion);
        }
    }
    private static void erase(ArrayList<Vehiculo> listaVehiculos){
        System.out.println("Introduzca la matricula del vehiculo que desee eliminar: ");
        String plaqueErase = sc.nextLine();
        boolean in = false;
        for (Vehiculo elemVehiculo : listaVehiculos) {
            if (elemVehiculo.getPlaque().equalsIgnoreCase(plaqueErase)){
                listaVehiculos.remove(elemVehiculo);
                System.out.println("Elemento borrado");
                break;
            }
        }
        if (!in){
            System.out.println("La matricula no se encuentra registrada");
                    }
    }
    
    
    
        
    
}
