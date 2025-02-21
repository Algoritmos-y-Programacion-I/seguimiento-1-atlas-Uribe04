/*
* Analisis
* Descripcion del programa: El programa consiste en un formulario el cual buscara guiar
* Entradas: Nombre del cliente, edad, documento, Cantidad de dias que se va a quedar, tipo de viaje que va a hacer
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_NOCHE = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudad;
        int edad, documento, noches;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();  
        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...
        System.out.println("Cual es tu edad?");
        edad = escaner.nextInt();
         // ...
        System.out.println("Porfavor dinos el numero de tu documento");
        documento = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Desde que ciudad vas a partir?");
        ciudad = escaner.nextLine();
        //...
        System.out.println("Bienvenido a nuestro serivicio de ATLAS, cuantas noches te vas a hospedar?");
        noches = escaner.nextInt();
        //...
        System.out.println("Perfecto te vas a quedar " + noches + " noches en Bogota, ahora vas a ver el resumen de tu compra:");

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros

        double totalnoches;
        totalnoches = calculartotalnoches(noches); 

        double totalfinal;
        totalfinal = calculartotalfinal(totalnoches, totalTransporte);
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return COSTO_TRAYECTO_AVION*2; // Completar operacion
    }

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calculartotalnoches(int noches) {
        return COSTO_NOCHE* noches; // Completar operacion
    }
	
    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calculartotalfinal(double totalnoches, totalTransporte) {
        return totalnoches + totalTransporte; // Completar operacion
    }

	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudad;
        int edad, documento, noches;
        // Saludo
        System.out.println("Salida: " + ciudad + " Llegada: Bogota, teniendo eso en cuenta el costo total seria: " + totalfinal );
         System.out.println("Su nombre es: "  + nombre );
          System.out.println("Su edad es: " + edad );
          System.out.println("Su documento es: " + documento );
        
	}

}