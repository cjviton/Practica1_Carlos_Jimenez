package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class metodosCRUD {


	//Método parapedir un número entero dentro de un rango
	
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



	//Método para pedir un palabra

public static String pedirString(String texto) {

	String palabra;
	Scanner lector = new Scanner(System.in);

	System.out.println(texto);
	palabra = lector.nextLine();

	return palabra;
}
	
	



	//Método para pedir un número entero

public static int pedirInt(String texto) {

	int numero;

	Scanner lector = new Scanner(System.in);

	System.out.println(texto);
	numero = lector.nextInt();
	lector.nextLine();

	return numero;
}


	//método para que muestre el contenido de un array de String

public static void muestraArrayS(String[] array) {
	System.out.println("Esta es tu lista  ");
	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ,");
	  }
	}	


	//método para que muestre el contenido de un array de Int


public static void muestraArrayI(int[] array) {
	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ,");
	  }
	}	

}
