package appdni;

import java.util.Random;

	// TODO HACER UN NUEVO MAINDNI LLAMADO MAINDNI2
	/**
	 * PARA QUE GENERE 10 DNIS NUEVOS CADA NÚMERO DEL DNI SE TIENE QUE GENERAR
	 * AUTOMÁTICAMENTE /ALEATORIA Y PARA CADA DNI, SE TIENE QUE CALCULAR SU LETRA
	 * 
	 * EN LA CLASE DNI, SE TIENE QUE LLEVAR LA CUENTA DE CUÁNTOS DNIS SE CREAN Y
	 * MOSTRARLO AL FINAL DE LA EJECUCIÓN
	 */

	// public static final String SECUENCIA_LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";{
	public class MainDNI2 {
		
		public static final int MAX_NUMERO_DNI = 99999999; 
		
		public static void main(String[] args) {
			
			//FOR 10 veces
				//1 generar numero
				//2 crear dni
				//3 sacar letra de ese dni
			Dni[] arrayDnis = new Dni[10]; //me creo un array con espacio para 10 dnis
			for (int i = 0; i <= 9; i++) {
				
				//TODO Modificar este algoritmo para que en arrayDnis
				//haya un Dni en las posiciones pares
				//y un NIE en las impares
				
				Random random = new Random();
				int numDni = random.nextInt(MAX_NUMERO_DNI) + 1;
				Dni dni = new Dni(numDni);
				
				char letraDNI = dni.calcularLetra();
				dni.setLetra(letraDNI);
				
				//add el dni al array
				arrayDnis[i] = dni;
				System.out.println("Tu numero: " + dni.getNumero() + " - " + dni.getLetra());
				
				if (i%2 == 0) //si a posicion es par  
				{
					arrayDnis[i] = dni;
					
				} else {
					
					arrayDnis[i] = new Nie();
				}
				
			}
			
			//TODO imprimir el número total de DNIS creados
			System.out.println("SE HAN  CREADO " + Dni.contador + " dnis");
			
			//VAMOS A LLAMAR A BUSCAR AL MAYOR DE LOS DNIS
			int nummayor = Dni.obtenerDniMayor(arrayDnis);
			System.out.println("El mayor DNI es " + nummayor);
			
			for (Dni dni : arrayDnis) 
			{
				
				if (dni instanceof Nie) {
					System.out.println("Es un NIE");
					
				}else //if (dni instanceOf Dni) 
				{
					System.out.println("ES UN DNI");
				}
				
			}
	
			//METER EN LA ÚLTIMA POSICIÓN DE LA ARRAY DE DNIS, UN NIE
			Nie nie = new Nie();
			arrayDnis[arrayDnis.length -1] = nie;
			
			//TODO haced un método estático QUE RECIBA un array
			//de DNIS y me diga cuántos NIES hay en ese array
				
		}	
		
		public static int contarNies(Dni[] arrayDnies) {
			int numNies = 0;
			Dni dniActual = null;

			for (int i = 0; i < arrayDnies.length; i++) {
				dniActual = arrayDnies[i];
				if (dniActual instanceof Nie) {
					numNies = numNies + 1;
				}
			}

			return numNies;
		}
		
	}