package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class metodosCRUD {


	
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




public static String pedirString(String texto) {

	String palabra;
	Scanner lector = new Scanner(System.in);

	System.out.println(texto);
	palabra = lector.nextLine();

	return palabra;
}
	
	



	
public static int pedirInt(String texto) {

	int numero;

	Scanner lector = new Scanner(System.in);

	System.out.println(texto);
	numero = lector.nextInt();
	lector.nextLine();

	return numero;
}




	
	
	
	
	
	
	
	
	
	
	

}
