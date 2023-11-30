package appdni;

import java.util.Scanner;

public class MainNie {

	//public static final String SECUENCIA_LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	public static void main (String[] args) 
	{

		Scanner scanner = new Scanner(System.in);

		// PIDO LETRA
		System.out.println("INTRODUCE LA LETRA");
		String letra = scanner.next();
		String letraMayuscula = letra.toUpperCase();
		

		// PIDO NUMERO
		System.out.println("INTRODUCE EL NÚMERO DE DNI");
		int numdni = scanner.nextInt();
		int aux = 0;
		
		
		/*
		 	{
			int dniwil = 120994;
			char letraPrefijo = 'Z';
		
			DecimalFormat df = new DecimalFormat("0000000");
			String dniwilcad = df.format(dniwil);
			System.out.println(dniwilcad);
			
			if (letraPrefijo=='Z')
			{
				dniwilcad = "2"+dniwilcad;
			} else if (letraPrefijo=='Y')
			{
				dniwilcad = "1"+dniwilcad;
			}/*else {
				// sería poner un cero a la izquieda, que no tiene
				 * ningún efecto
			}
			int numero = Integer.parseInt(dniwilcad);
			int resto = numero%23;
			char letraFinal = Dni.SECUENCIA_LETRAS_DNI.charAt(resto);
			System.out.println("La letra final es " + letraFinal);
			}
		*/
		
		
		if (letraMayuscula.equals("X")) {
			aux = 0;
		} else if (letraMayuscula.equals("Y")) {
			aux = 1;
		} else if (letraMayuscula.equals("Z")) {
			aux = 2;
		}

		String numeroNieCompletoString = String.valueOf(aux) + String.valueOf(numdni);
		int numeroNieEntero = Integer.parseInt(numeroNieCompletoString);
		int resultadoNie = numeroNieEntero % Dni.SECUENCIA_LETRAS_DNI.length();
		char resultadoNieMasLetra = Dni.SECUENCIA_LETRAS_DNI.charAt(resultadoNie);
		System.out.println("La última letra del NIE es -" + resultadoNieMasLetra);
		
		
		
		/*switch (letraMayuscula) {
		case "X":
			System.out.println("El usuario introdujo X case");
			break;
		case "Y":
			System.out.println("El usuario introdujo Y case");
			break;
		case "Z":
			System.out.println("El usuario introdujo Z case");
			break;

		default:
			break;
		}*/

		// CONVERTIR NÚMERO EN CADENA
		/*int n2 = 100;
		String sn2 = n2 + "";// "100"
		sn2 = String.valueOf(n2);
		// CONVERTIR CADENA EN NÚMERO String --> int
		int n = Integer.parseInt("34234324");
		System.out.println(n); */

	}
}
