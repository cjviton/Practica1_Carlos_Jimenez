package Practica1;

import java.util.Arrays;

/**
 * Crear 4 arrays con datos relaccionados con un máximo de 20 posiciones. Array
 * Nombre de la Montaña. Array Atura. Array puntoDePartida. Array tiempo de
 * actividad. Permitira sobre menú, añadir, modificar,eliminar,consultar y
 * salir.
 * 
 * @author Carlos_jiménez.
 * @version 1.0
 * @fecha 2023/01/07
 */

public class GestionCRUD {

	public static void main(String[] args) {

		String[] montana = new String[20];
		int longMontana = montana.length;
		int[] altura = new int[20];
		String[] puntoInicio = new String[20];
		int[] desnivel = new int[20];

		int contador = 0;
		int contador1 = 0;
		boolean anadido = false;

		int opcion = 0;

		int arrayVacio = 0;
		String montanaout;
		String montanain;
		int contador2 = 0;
		boolean encontrado2 = false;

		String montanadel;
		int contador3 = 0;
		boolean encontrado3 = false;

		int opcionfind;
		String findS;
		int findI = 0;
		int posicionFind;

		try {

			while (opcion != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir

				// Pregunto al usuario que opcion quiere realizar. Con el método pedir rango si
				// introduce un número que no es corecto le marcará el error
				opcion = metodosCRUD.pedirIntRango(
						"\n¿Qué quiere hacer?\n\n 1.-Añadir una montaña\n 2.-Modificar una montaña\n 3.-Eliminar una montaña\n 4.-Buscar una montaña\n 5.-Salir",
						1, 5);

				switch (opcion) {

				case 1:// Añadir a los arrays de la base de datos

					anadido = false; // inicializo el booleano en false, porque si ya ha sido usado estará en true

					if (contador < longMontana) { // condición para que no deje ejecutar si el array está lleno. Si hay
													// algún null de inicio o algún
													// hueco vacio de algún dato borrado
						do {
							if (montana[contador1] == null || montana[contador1].equals("")) {

								for (int i = 0; i < 1; i++) { // con el bucle for relleno los arrays en la posición
																// vacía o
																// null
									montana[contador1] = metodosCRUD.pedirString(
											"Introduce el nombre de la montaña que quieres introducir en tu Base de datos");
									altura[contador1] = metodosCRUD.pedirInt("Intruduce su altura en metros");
									puntoInicio[contador1] = metodosCRUD.pedirString("¿Desde donde quieres subir?");
									desnivel[contador1] = metodosCRUD.pedirInt("¿Cuánto desnivel hay que salvar?");
								}

								contador++; // contador que gestiona el total de posiciones del array
								anadido = true;
							}

							contador1++; // contador que gestiona la posición indice dentro del array

						} while (!anadido);

					} else { // Si contador1 es mayor que longmontana. El array está lleno
						System.out.println("La base de datos está llena");
						metodosCRUD.mostrarTexto("Estas son las montañas que tienes en tu base de datos");
						metodosCRUD.muestraArrayS(montana);
					}

					break;

				case 2: // Modificar una montaña

					contador2 = 0; // inicializo el contador del indice del array y restauro el booleano por si ya
									// ha sido usado
					encontrado2 = false;

					arrayVacio = metodosCRUD.NumeroNull(montana); // El método me cuenta el numero de indices vacíos que
																	// hay. Si son 4 (todos) lanza mensaje "no hay datos
																	// que
																	// modificar"

					if (arrayVacio == 20) {
						metodosCRUD.mostrarTexto("No hay datos que modificar¡");
					} else {
						metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");
						metodosCRUD.muestraArrayS(montana);

						montanaout = metodosCRUD.pedirString("¿Qué montaña quieres cambiar?");

						montanain = metodosCRUD.pedirString("¿Qué montaña quieres introducir en su lugar?");

						do {
							if (montana[contador2].equals(montanaout)) {
								montana[contador2] = montanain; // Cambia la que quiero quitar por la nueva
								altura[contador2] = metodosCRUD.pedirInt("Introduce su altura en metros");
								puntoInicio[contador2] = metodosCRUD.pedirString("¿Desde donde quieres subir?");
								desnivel[contador2] = metodosCRUD.pedirInt("¿Cuánto desnivel hay que salvar?");
								encontrado2 = true;
							}
							contador2++; // sumo 1 al contador que gestiona el indice dentro del array
						} while (contador2 < longMontana && !encontrado2);

						metodosCRUD.mostrarTexto("Estas son las montañas que tienes en tu base de datos");
						metodosCRUD.muestraArrayS(montana); // Muestro los arrays para que el usuario pueda ver su
															// estado
															// despues de los cambios
					}
					break;

				case 3:// elimina una montaña

					contador3 = 0; // inicializo el contador del indice del array y restauro el booleano por si ha
									// sido usado
					encontrado3 = false;

					arrayVacio = metodosCRUD.NumeroNull(montana); // El método me cuenta el numero de indices vacíos que
																	// hay. Si son 4 (todos) lanza mensaje "no hay datos
																	// que
																	// modificar"
					if (arrayVacio == 20) {
						metodosCRUD.mostrarTexto("No hay datos que eliminar¡");
					} else {
						metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");
						metodosCRUD.muestraArrayS(montana);

						montanadel = metodosCRUD.pedirString("¿Qué montaña quieres eliminar?");

						do {
							if (montana[contador3].equals(montanadel)) {

								montana[contador3] = ""; // En el indice que elimine el numbre introducira un espacio
								altura[contador3] = 0;
								puntoInicio[contador3] = "";
								desnivel[contador3] = 0;

								encontrado3 = true;
								contador--; // resto 1 en el contador de añadidos que le quitdo del array
								contador1 = 0; // inicializo el contador del array para que busque la posición eliminada
												// desde el indice 0
							}
							contador3++; // sumo 1 al contador que gestiona el indice dentro del array
						} while (contador3 < longMontana && !encontrado3);

						metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");
						metodosCRUD.muestraArrayS(montana); // Muestro los arrays para que el usuario pueda ver su
															// estado
															// despues de los cambios
					}
					break;

				case 4:

					arrayVacio = metodosCRUD.NumeroNull(montana); // El método me cuenta el numero de indices vacíos que
																	// hay. Si son 4 (todos) lanza mensaje "no hay datos
																	// que
																	// modificar"
					if (arrayVacio == 20) {
						metodosCRUD.mostrarTexto("No hay datos que para buscar¡");
					} else { // El usuarioo pude realizar la busqueda de cualquiera de los datos que hay en
								// la base

						opcionfind = metodosCRUD.pedirIntRango( // Elije que tipo de dato quiere buscar
								"\n¿Qué tipo de búsqueda quieres hacer?\n\n 1.-Una montaña\n 2.-Una altura\n 3.-Desde un punto de partida del trekking\n 4.-Con un desnivel determinado",
								1, 4);

						switch (opcionfind) {

						case 1: // Busqueda de montaña
							metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");
							metodosCRUD.muestraArrayS(montana);// Método que muestra el array tipo String
							findS = metodosCRUD.pedirString("¿Qué montaña quieres consultar?");
							posicionFind = metodosCRUD.buscarPosicionArrayS(montana, findS);
							metodosCRUD.mostrarTexto("La montaña seleccionada es: " + findS);
							metodosCRUD
									.mostrarTexto("La altura de esta montaña son " + altura[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("Puedes iniciar la marcha para ascender esta montaña desde "
									+ puntoInicio[posicionFind]);
							metodosCRUD.mostrarTexto("y el desnivel que hay que salvar en este trekking es de "
									+ desnivel[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("");

							break;

						case 2: // Busqueda por altura
							metodosCRUD
									.mostrarTexto("Estás son las alturas que tienen las montañas de tu base de datos");
							metodosCRUD.muestraArrayI(altura);// Método que muestra el array tipo int
							findI = metodosCRUD.pedirInt("¿Qué altura quieres consultar?");
							posicionFind = metodosCRUD.buscarPosicionArrayI(altura, findI);
							metodosCRUD.mostrarTexto("La altura seleccionada es: " + findI);
							metodosCRUD.mostrarTexto(
									"El nombre de la montaña con esa altura es  " + montana[posicionFind]);
							metodosCRUD.mostrarTexto("Puedes iniciar la marcha desde " + puntoInicio[posicionFind]);
							metodosCRUD.mostrarTexto("y el desnivel que hay que salvar en este trekking es de "
									+ desnivel[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("");
							break;

						case 3: // Busqueda por punto de inicio del trekking
							metodosCRUD.mostrarTexto(
									"Estos son los puntos desde donde parten los trekking que tienes en tu base de datos");
							metodosCRUD.muestraArrayS(puntoInicio);
							findS = metodosCRUD.pedirString("¿Cuál quieres consultar?");
							posicionFind = metodosCRUD.buscarPosicionArrayS(puntoInicio, findS);
							metodosCRUD.mostrarTexto("El punto de inicio seleccionad es: " + findS);
							metodosCRUD.mostrarTexto("La montaña que puedes subir desde ese punto de partida es "
									+ montana[posicionFind]);
							metodosCRUD.mostrarTexto("Tiene una altura de " + altura[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("y el desnivel que hay que salvar en este trekking es de "
									+ desnivel[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("");
							break;

						case 4: // Busqueda por tiempo de duración del trekking
							metodosCRUD.mostrarTexto(
									"Estos son los diferentes desniveles que hay que salvar en los trekking que tienes en tu base de datos");
							metodosCRUD.muestraArrayI(desnivel);
							findI = metodosCRUD.pedirInt("¿Qué desnivel estás preparado para subir?");
							posicionFind = metodosCRUD.buscarPosicionArrayI(desnivel, findI);
							metodosCRUD.mostrarTexto("Con un desnivel de " + findI);
							metodosCRUD.mostrarTexto("puedes subir esta montaña " + montana[posicionFind]);
							metodosCRUD.mostrarTexto("podrías iniciar la marcha desde " + puntoInicio[posicionFind]);
							metodosCRUD.mostrarTexto("Y tendrás que prepararte para subir a la altura de "
									+ altura[posicionFind] + " metros");
							metodosCRUD.mostrarTexto("");
							break;
						}

						break;
					}
				}
			}
		} catch (Exception e) {

		}
	}
}