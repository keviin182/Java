package appdni;

import java.util.Scanner;

public class MainDNI {
	
	//TODO pedir número de DNI 
	//y decir que letra tiene
	
	public static final String SECUENCIA_LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void main(String[] args) {
		System.out.println("Introduce el número de DNI sin letra");
		Scanner scanner = new Scanner(System.in);
		int numeroDNI = scanner.nextInt();
		System.out.println("DNI introducido: " + numeroDNI);
		
		int resto = numeroDNI % SECUENCIA_LETRAS_DNI.length();
		//System.out.println(resto);
		//String secuenciaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = SECUENCIA_LETRAS_DNI.charAt(resto);
		System.out.println("Su letra es: " + letra);
		
	}
	
}