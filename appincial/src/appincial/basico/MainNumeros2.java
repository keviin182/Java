package appincial.basico;

import java.util.Scanner;

//3) 1 PROGRAMA QUE PIDA 10 NÚMEROS Y DIGA LA SUMA DE LOS 10

public class MainNumeros2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sumaTotal = 0;
		int numeroIntroducido = 0;
		
		for (int numero = 0; numero < 10; numero++) {
			System.out.println("Introduce un número");
			numeroIntroducido = scanner.nextInt();

			{
				sumaTotal += numeroIntroducido;

			}
		}
		System.out.println("Hay " + sumaTotal + " en total");
		System.out.println("Fin del programa");
	}
}
