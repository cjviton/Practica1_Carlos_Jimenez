package Practica1;


import java.util.Arrays;

public class GestionCRUD {

	public static void main(String[] args) {
			                                   
		//no referencio código porque no hay nada copiado 
		
		//Crear 4 arrays con datos con 20 posiciones
		//Array Nombre de la Montaña
		//Array Atura
		//Array puntoDePartida
		//Array desnivel
		
		
		String[] montana=new String [4];
		int longMontana=montana.length; 
		
		int[] altura=new int [4];
		int longAltura=altura.length;	
		
		String[] puntoInicio=new String [4];
		int longPuntoInicio=puntoInicio.length;
		
		int[] desnivel=new int [4];
	    int longdesnivel=desnivel.length;	
	    
	    int contador=0;
	    int contador1=0;	    
	    boolean anadido=false;
	    
		int opcion=0;    
	    
		String montanaout;
		String montanain;
		int contador2=0;
		boolean encontrado2= false;
	    
		String montanadel;
		int contador3=0;
		boolean encontrado3=false;
       
	    while(opcion !=5) { //El switch se debe repetir hasta que elija la opción 5 Salir
	     
	    	//Pregunto al usuario que opcion quiere realizar. Con el método pedir rango si introduce un número que no es corecto le marcará el error
	        opcion=metodosCRUD.pedirIntRango("\n¿Qué quiere hacer?\n\n 1.-Añadir una montaña\n 2.-Modificar una montaña\n 3.-Eliminar una montaña\n 4.-Buscar una montaña\n 5.-Salir", 1, 5);
			    
		
			 switch (opcion) {
			 
			 case 1://Añadir a los arrays de la base de datos
				 
				 anadido=false;  //inicializo el booleano en false, porque estaría en true del último uso
				 
				 if (contador<longMontana){ //condición para que no deje ejecutar si el array está lleno. Si ahay algún null de inicio o algún 
					 						//hueco vacio de algún dato borrado
					 do {                  
						 if (montana[contador1]==null || montana[contador1].equals("")) {
								
							 						 
								 for (int i=0;i<1 ;i++) { //con el bucle for relleno los arrays en la posición vacia o null
									 montana[contador1]=metodosCRUD.pedirString("Introduce el nombre de la montaña que quieres introducir en tu Base de datos"); 
									 altura[contador1]=metodosCRUD.pedirInt("Intruduce su altura en metros");
									 puntoInicio[contador1]=metodosCRUD.pedirString("¿Desde donde quieres subir?");
									 desnivel[contador1]=metodosCRUD.pedirInt("¿Que desnivel hay desde ese punto?");
								 }
								
								 metodosCRUD.muestraArrayS(montana);  //Método wque me muestra el contenido del array tipo String
								 
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
				
				
					/*	for (int i=0;i<=longMontana;i++) {
					if(montana[i] is null);			//if(montana[i].equals(null));	//if(montana[i].isEmpty());	
				 } System.out.println("No hay datos que modificar¡");
				*/
				 contador2=0;        //inicializo el contador y restauro el booleano de inicio
				 encontrado2=false;
				 
				 if (montana[0] == null) { //si no hay datos en el array no me deja modificar   AUN TENGO QUE DEPURARLO. SÓLO DUN CINA PARA LA POSICIÓN 0
					 System.out.println("No hay datos que modificar¡");              //puedo hacerlo contando los null y comparando con .length si es igual está vacio
				 }else {
				 							
						System.out.println("Estás son las montañas que tienes en tu base de datos" ); 
						System.out.println(Arrays.toString(montana)); 
						
						montanaout= metodosCRUD.pedirString("¿Qué montaña quieres cambiar?");
						montanain=metodosCRUD.pedirString("¿Qué montaña quieres introducir en su lugar?");
						
						do {
							if (montana[contador2].equals(montanaout)) {					
								montana[contador2]=montanain;
								altura[contador2]=metodosCRUD.pedirInt("Intruduce su altura en metros");
								puntoInicio[contador2]=metodosCRUD.pedirString("¿Desde donde quieres subir?");
								desnivel[contador2]=metodosCRUD.pedirInt("¿Que desnivel hay desde ese punto?");						
							    encontrado2=true;
							}					
						    contador2++;				    
						}while(contador2<longMontana && !encontrado2);
						
						
						
						System.out.println(Arrays.toString(montana));
						System.out.println(Arrays.toString(altura));
					    System.out.println(Arrays.toString(puntoInicio));
						System.out.println(Arrays.toString(desnivel));
						
				 } 
				 					 
				break;
			
			 case 3://elimina una montaña
				 
				 contador3=0;              //inicializo el contador y restauro el booleano de inicio
				 encontrado3=false;
				 
				 if (montana[0] == null) {   
					 System.out.println("No hay datos que modificar¡"); 
			    }else {
				 
				    	System.out.println("Estás son las montañas que tienes en tu base de datos" ); 
						System.out.println(Arrays.toString(montana)); 
				    	
				    	montanadel=metodosCRUD.pedirString("¿Qué montaña quieres eliminar?");
				    	
				    	do {   
				    		//if montana[contador3]==null
				    	    //else if contador++
				    		
				    		if (montana[contador3].equals(montanadel)){					
				    	
								montana[contador3]="";
								altura[contador3]=0;
								puntoInicio[contador3]=null;
								desnivel[contador3]=0;
								
								encontrado3=true;	
								contador--;              //resto 1 en el contador de añadidos que he quitdo del array
								contador1=0;             //inicializo el contador del array para que busque la posición eliminada desde el indice 0
								
				    		}	
							
						contador3++;
						}while(contador3<longMontana && !encontrado3);
			    	    
			    }
				 
				    System.out.println(Arrays.toString(montana));
					System.out.println(Arrays.toString(altura));
				    System.out.println(Arrays.toString(puntoInicio));
					System.out.println(Arrays.toString(desnivel));
			  
				
					break;
				 
				 			 
			 case 4:
				 
				 
				 break;
				 
         
   
			 }
		 
		 }
		
	}

}
