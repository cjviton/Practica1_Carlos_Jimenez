package Practica1;

import java.util.Scanner;

public class Utilidades {

	

	// Pide y devuelve un número int entero

	public static int pedirInt(String texto) {

		int numero;

		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		numero = lector.nextInt();
		lector.nextLine();

		return numero;
	}

	// Pide un número entero dentro de un rango

	public static int pedirIntRango(String texto, int inicio, int fin) {

		int numero;
		boolean valido = true;

		Scanner lector = new Scanner(System.in);

		do {
			System.out.println(texto);
			numero = lector.nextInt();
			lector.nextLine();
			if (numero < inicio || numero > fin) {
				System.out.println("El número introducido no es correcto");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido);

		return numero;
	}

	// Pedir numero decimal

	public static double pedirDecimal(String texto) {

		double numero;

		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		numero = lector.nextDouble();
		lector.nextLine();

		return numero;
	}

	// Pide número decimal dentro de un rango

	public static double pedirDecimalRango(String texto, double inicio, double fin) {

		double numero;
		boolean valido = true;

		Scanner lector = new Scanner(System.in);

		do {
			System.out.println(texto);
			numero = lector.nextDouble();
			lector.nextLine();
			if (numero < inicio || numero > fin) {
				System.out.println("El número introducido no es correcto");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido);

		return numero;
	}

	// Pedir int sin parametro de texto

	public static int pedirInt() {

		int numero;

		Scanner lector = new Scanner(System.in);

		System.out.println("intruduce nuemro");
		numero = lector.nextInt();
		lector.nextLine();

		return numero;
	}

	// Pide int número entero positivo

	public static int numeroPositivo(String texto) {

		int numero;
		boolean valido = true;

		Scanner lector = new Scanner(System.in);

		do {
			System.out.println(texto);
			numero = lector.nextInt();
			lector.nextLine();
			if (numero < 0) {
				System.out.println("El número introducido no es correcto. Tiene que ser un número positivo");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido);

		return numero;

	}

	// Pregunta si desea continuar. Si es 'S' devuelve false. desea continuar false.
	// si es cualquier ota letra devuelce true.

	public static boolean deseaContinuar() {

		String deseaContinuar;
		boolean continuo = true;

		Scanner lector = new Scanner(System.in);

		System.out.println("¿Desea continuar?");
		deseaContinuar = lector.nextLine();
		if (deseaContinuar.charAt(0) == 's' || deseaContinuar.charAt(0) == 'S') {
			continuo = false;
		} else {
			continuo = true;
		}
		return continuo;
	}

	// Pide y devuelve un String

	public static String pedirString(String texto) {

		String palabra;
		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		palabra = lector.nextLine();

		return palabra;
	}

	// Recorre un Array o String

	public static void recorreArray() {

		String palabra = "cafeteria";

		int longitud; // Declaramos la variable longitud

		longitud = palabra.length(); // Con el método length sabremos cuanto mide el string o array

		for (int i = 0; i < longitud; i++) // con un bucle for recorro el array
			if (palabra.charAt(i) == 'f') { // con el metodo charAt comparo cada caracter recorrido por el bucle for con
											// una'e'
				System.out.println("Hay una letra en: " + i);
			}

	}

	// introduciendo los datos por teclado

	public static void recorreArray2(String palabra, char letra) {

		int longitud;

		longitud = palabra.length();

		for (int i = 0; i < longitud; i++)
			if (palabra.charAt(i) == letra) {
				System.out.println("Hay una letra en: " + i);
			}

	}
	
	
	//MÉTODOS PARA ARRAYS-----------------------------------------------------------------------------------
	
	// 1 CREO UN MÉTODO QUE AÑADA EL ARRAY palabras
	
	
		private static void anadirPalabras (String[]palabras, int posicion) {
			
			palabras[posicion]="hola";
		}	
			
		
		// 2 CREO UN MÉTODO QUE BUSQUE EN TODO EL ARRAY buscarTodoArray
			
		private static void	buscarTodoArray (String[] lista, String nombre) {  //este nombre del array no tiene que ser igual que el array
			int longitud=lista.length;										   //de arriba. este solo es para el método
			for (int i=0;i<longitud;i++) {
				if(lista[i].equals(nombre)) {
					System.out.println("Hay un " + nombre + " en la posición " + i);
				}
			}
		}
		

		// 3 CREO UN MÉTODO QUE ME DEVUELVE EL NÚMERO DE PERSONAS CON UN DETERMINADO NOMBRE 
		
		
		private static int buscarNumeroNombre(String[] lista, String nombre) {
			
			int longitud=lista.length;
			int contador=0;
			
			for(int i=0;i<longitud; i++) {
				if(lista[i].equals(nombre)) {
					contador++;
				}
			}
			
			return contador;
			
		}
		
		
		// 4 CREO UN MÉTODO QUE ME DEVUELVA LA POSICIÓN EN LA QUE ESTA LO QUE BUSCO
		
		
		private static int buscarPosicionNombre(String[] lista, String nombre) {
			
			int longitud=lista.length;
			int i=0;
			int posicion=-1;
			boolean encontrado=false;
			
			if(longitud>0) {
				do {
					if(lista[i].equals(nombre)) {
						posicion=i;
						encontrado=true;
					}
					i++;
				}while(i<longitud && !encontrado); 
			}
			
			
			return posicion;
			
		}
		

}
