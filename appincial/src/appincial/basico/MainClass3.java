package appincial.basico;

import java.util.Scanner;

//4) 1 PROGRAMA QUE PIDA 10 NÚMEROS Y DIGA EL MAYOR DE LOS 10

public class MainClass3 {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		int total = 0;

		for (int contador = 1; contador < 11; contador++) {

			System.out.println("METE UN NÚMERO");
			int numLeido = scanner1.nextInt();
			total = total + numLeido;

			System.out.println(" Numero " + contador + " = " + numLeido);

			System.out.println("SUMA = " + total);//
			System.out.println("FIN DE PROGRAMA");

			int numLeido2 = scanner1.nextInt();

			System.out.println("Numero " + contador + " = " + numLeido2);
		}
		System.out.println("FIN DE PROGRAMA");

	}
}