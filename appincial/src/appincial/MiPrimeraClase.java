package appincial;

import java.util.Scanner;

public class MiPrimeraClase {

	public static void main(String[] args) {

		for (int a = 0; a <= 50; a++) {

			if (a % 2 == 0) {

				System.out.println(a);
			}
		}
		System.out.println("The End For");

		
		
		
		int numero = 0;
		do {
			if ((numero % 2) == 0) // es par
			{
				System.out.println(numero);
			}
			numero = numero + 1;

		} while (numero <= 50);
		System.out.println("THE END WHILE");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número");
		int numeroLeido = scanner.nextInt();
		System.out.println("El numero introducido es " + numeroLeido);
	}

}
