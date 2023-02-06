package Practica1;


import java.util.Arrays;

public class GestionCRUD {

	public static void main(String[] args) {
			                                   
		//no referencio código porque no hay nada copiado 
		
		//Crear 4 arrays con datos con 20 posiciones
		//Array Nombre de la Montaña
		//Array Atura
		//Array puntoDePartida
		//Array tiempo
		
		
		String[] montana=new String [4];
		int longMontana=montana.length; 	
    	int[] altura=new int [4];		
		String[] puntoInicio=new String [4];			
		int[] tiempo=new int [4];
	    
	    int contador=0;
	    int contador1=0;	    
	    boolean anadido=false;
	    
		int opcion=0;    
	    
		int arrayVacio=0;
		String montanaout;
		String montanain;
		int contador2=0;
		boolean encontrado2= false;
	    
		String montanadel;
		int contador3=0;
		boolean encontrado3=false;
		
		String montanaFind;
		int posicionMontanaFind;
        int contador4=0;
        boolean encontrado4=false;
        
        
	    while(opcion !=5) { //El switch se debe repetir hasta que elija la opción 5 Salir
	     
	    	//Pregunto al usuario que opcion quiere realizar. Con el método pedir rango si introduce un número que no es corecto le marcará el error
	        opcion=metodosCRUD.pedirIntRango("\n¿Qué quiere hacer?\n\n 1.-Añadir una montaña\n 2.-Modificar una montaña\n 3.-Eliminar una montaña\n 4.-Buscar una montaña\n 5.-Salir", 1, 5);
			    		
			 switch (opcion) {
			 
			 case 1://Añadir a los arrays de la base de datos
				 
				 anadido=false;  //inicializo el booleano en false, porque si ya ha sido usado estará en true
				 
				 if (contador<longMontana){ //condición para que no deje ejecutar si el array está lleno. Si ahay algún null de inicio o algún 
					 						//hueco vacio de algún dato borrado
					 do {                  
						 if (montana[contador1]==null || montana[contador1].equals("")) {
															 						 
								 for (int i=0;i<1 ;i++) { //con el bucle for relleno los arrays en la posición vacía o null
									 montana[contador1]=metodosCRUD.pedirString("Introduce el nombre de la montaña que quieres introducir en tu Base de datos"); 
									 altura[contador1]=metodosCRUD.pedirInt("Intruduce su altura en metros");
									 puntoInicio[contador1]=metodosCRUD.pedirString("¿Desde donde quieres subir?");
									 tiempo[contador1]=metodosCRUD.pedirInt("¿Cuánto tiempo se tarda?");
								 }
																 
								 contador++;    //contador que gestiona el total de posiciones del array
								 anadido=true;	
						 }     
						 
						         contador1++;  //contador que gestiona la posición indice dentro del array
						         						         
			    	  }while(!anadido);
					 					 					 
		    	   }else {         //Si contador1 es mayor que longmontana. El array está lleno						 
						 System.out.println("La base de datos está llena");
						 metodosCRUD.muestraArrayS(montana);							 				 
		    		 }
			 
			      break;
		 
			 case 2: //Modificar una montaña
				
				 contador2=0;        //inicializo el contador del indice del array y restauro el booleano por si ya ha sido usado
				 encontrado2=false;
				 
				 arrayVacio=metodosCRUD.NumeroNull(montana);    //El método me cuenta el numero de indices vacíos que hay. Si son 4 (todos) lanza mensaje "no hay datos que modificar"
				 															 
				 if (arrayVacio==4) { 
					 metodosCRUD.mostrarTexto("No hay datos que modificar¡");        
				 }else {
					 metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos" );
					 metodosCRUD.muestraArrayS(montana);
						
					 montanaout= metodosCRUD.pedirString("¿Qué montaña quieres cambiar?");
					 
					 montanain=metodosCRUD.pedirString("¿Qué montaña quieres introducir en su lugar?");
						
						do {
							if (montana[contador2].equals(montanaout)) {					
								montana[contador2]=montanain;             //Cambia la que quiero quitar por la nueva
								altura[contador2]=metodosCRUD.pedirInt("Intruduce su altura en metros");
								puntoInicio[contador2]=metodosCRUD.pedirString("¿Desde donde quieres subir?");
								tiempo[contador2]=metodosCRUD.pedirInt("¿Cuánto tiempo se tarda?");						
							    encontrado2=true;
							}					
						    contador2++;	//sumo 1 al contador que gestiona el indice dentro del array			    
					   }while(contador2<longMontana && !encontrado2);
						
						
					 metodosCRUD.muestraArrayS(montana);      //Muestro los arrays para que el usuario pueda ver su estado despues de los cambios
					 metodosCRUD.muestraArrayI(altura);
					 metodosCRUD.muestraArrayS(puntoInicio);
					 metodosCRUD.muestraArrayI(tiempo);
				 } 
			     break;
			
			 case 3://elimina una montaña
				 
				 contador3=0;            //inicializo el contador del indice del array y restauro el booleano por si ha sido usado
				 encontrado3=false;
				 
				 arrayVacio=metodosCRUD.NumeroNull(montana);    //El método me cuenta el numero de indices vacíos que hay. Si son 4 (todos) lanza mensaje "no hay datos que modificar"
				 if (arrayVacio==4) {   
					metodosCRUD.mostrarTexto("No hay datos que modificar¡"); 
			     }else {
			    	 	metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");
				    	metodosCRUD.muestraArrayS(montana);
								    	
				    	montanadel=metodosCRUD.pedirString("¿Qué montaña quieres eliminar?");
				    	
				    	do {   			    		
				    		if (montana[contador3].equals(montanadel)){					
				    	
								montana[contador3]="";       //En el indice que elimine el numbre introducira un espacio 
								altura[contador3]=0;
								puntoInicio[contador3]=null;
								tiempo[contador3]=0;
								
								encontrado3=true;	
								contador--;              //resto 1 en el contador de añadidos que he quitdo del array
								contador1=0;             //inicializo el contador del array para que busque la posición eliminada desde el indice 0								
				    		}								
						contador3++;    //sumo 1 al contador que gestiona el indice dentro del array	
						}while(contador3<longMontana && !encontrado3);
			    	    
			    }
				 
				 metodosCRUD.muestraArrayS(montana);      //Muestro los arrays para que el usuario pueda ver su estado despues de los cambios
				 metodosCRUD.muestraArrayI(altura);
				 metodosCRUD.muestraArrayS(puntoInicio);
				 metodosCRUD.muestraArrayI(tiempo); 
				   
	  			break;
				 
				 			 
			 case 4:
				 contador4=0;            //inicializo el contador del indice del array y restauro el booleano por si ha sido usado
				 encontrado4=false;
				 
				 arrayVacio=metodosCRUD.NumeroNull(montana);    //El método me cuenta el numero de indices vacíos que hay. Si son 4 (todos) lanza mensaje "no hay datos que modificar"
				 
				 if (arrayVacio==4) {   
						metodosCRUD.mostrarTexto("No hay datos que para buscar¡"); 
				 }else {
				 
					 metodosCRUD.mostrarTexto("Estás son las montañas que tienes en tu base de datos");    
					 metodosCRUD.muestraArrayS(montana);
					 montanaFind= metodosCRUD.pedirString("¿Qué montaña quieres consultar?");
							 
				     posicionMontanaFind=metodosCRUD.buscarPosicionArray(montana, montanaFind);
				 
				  metodosCRUD.mostrarTexto("La montaña seleccionada es: " + montanaFind);
				  metodosCRUD.mostrarTexto("La altura de esta montaña son " + altura[posicionMontanaFind] + " metros");
				  metodosCRUD.mostrarTexto("Es aconsejable iniciar la marcha para el ascenso desde " + puntoInicio[posicionMontanaFind]);  
				  metodosCRUD.mostrarTexto("El tiempo estimado para el ascenso es de " + tiempo[posicionMontanaFind] + "horas sin contar las paradas");
				  metodosCRUD.mostrarTexto("");
				     
				 break;
				   
			    }
			 }
	      }
	}      
}