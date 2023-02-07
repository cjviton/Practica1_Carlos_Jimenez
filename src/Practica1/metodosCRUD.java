package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class metodosCRUD {

	/**
	 * Método para pedir un número entero dentro de un rango
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param texto  Es el mensaje que se mostrará al usuario para pedir el número.
	 * @param inicio Numero menor que se puede introducir en el rango.
	 * @param fin    Número mayor que se puede introducir en el rengo.
	 * @return numero Número entero introducido por el usuario y que se encuentra dentro
	 *         del rango.
	 */
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

	/**
	 * Método para pedir un palabra.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param texto Es el mensaje que se mostrará al usuario para pedir la palabra.
	 * @return Palabra introducida por el usuario.
	 */

	public static String pedirString(String texto) {

		String palabra;
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		palabra = lector.nextLine();

		return palabra;
	}

	/**
	 * Método para pedir un número entero.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param texto Es el mensaje que se mostrará al usuario para pedir el número.
	 * @return El número entero introducido por el usuario.
	 */

	public static int pedirInt(String texto) {

		int numero;

		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		numero = lector.nextInt();
		lector.nextLine();

		return numero;
	}

	/**
	 * Método para que muestre el contenido de un array de String.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param array Nombre del array del que se mostrará el contenido.
	 */
	public static void muestraArrayS(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ,");
		}
		System.out.println("   ");
	}

	/**
	 * Método para que muestre el contenido de un array de tipo Int.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param array Nombre del array del que se mostrará el contenido.
	 */
	public static void muestraArrayI(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ,");
		}
		System.out.println("   ");
	}

	/**
	 * Método para que me devuelva el numero de null o "" que hay en un string
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param lista Nombre del array del que se mostrará el contenido.
	 * @return  numero entero de la suma de veces que aparece en el array un Null o
	 *         un " ".
	 */
	public static int NumeroNull(String[] lista) {

		int longitud = lista.length;
		int contador = 0;

		for (int i = 0; i < longitud; i++) {
			if (lista[i] == null || lista[i].equals("")) {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * Método para mostrar texto.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param texto Nombre del array del que se mostrará el contenido.
	 */
	public static void mostrarTexto(String texto) {

		System.out.println(texto);
	}

	/**
	 * Método para buscar la posición de un String dentro de un array.
	 * @author Carlos_Jiménez
	 * @version 1.0
	 * @param lista Nombre del array del que se mostrará el contenido.
	 * @param nombre Nombre que quieres buscar en el array
	 * @return Devuelve un numero entero
	 */
	public static int buscarPosicionArray(String[] lista, String nombre) {

		int longitud = lista.length;
		int i = 0;
		int posicion = -1;
		boolean encontrado = false;

		if (longitud > 0) {
			do {
				if (lista[i].equals(nombre)) {
					posicion = i;
					encontrado = true;
				}
				i++;
			} while (i < longitud && !encontrado);
		}

		return posicion;

	}

}
