package appincial.imc;

import java.util.Scanner;

/**
 * PROGRAMA IMC Índice de Masa Corporal Fórmula IMC = peso kg / altura al
 * cuadrado IMC < 16 Desnutrido IMC >= 16 Y < 18 DELGADO IMC >= 18 Y < 25 IDEAL
 * IMC >= 25 Y < 31 SOBREPESO IMC >= 31 OBESO
 * 
 * To Do: Hacer una aplicación que pida al usuario su peso y su estatura e
 * informe su IMC Numérico y Nominal
 * 
 * P.Ejem.: 22.35 IDEAL
 */

public class MainIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float peso = 0;
		float estatura = 0;
		float informeIMC = 0;

		System.out.println("Introduce tu peso (kg.)");
		peso = scanner.nextFloat();
		System.out.println("Introduce tu estatura (m.)");
		estatura = scanner.nextFloat();
		informeIMC = (float) (peso / Math.pow(estatura,2));

		if (informeIMC < 16) {
			System.out.println(informeIMC + " Desnutrido");
		} else {
			if ((informeIMC >= 16) && (informeIMC < 18)) {
				System.out.println(informeIMC + " Delgado");
			} else {
				if ((informeIMC >= 18) && (informeIMC < 25)) {
					System.out.println(informeIMC + " Ideal");
				} else {
					if ((informeIMC >= 25) && (informeIMC < 31)) {
						System.out.println(informeIMC + " Obeso");
					} else {
						if (informeIMC > 31) {
							System.out.println(informeIMC + " Sobrepeso");
						}
					}

				}
			}
		}
	}
}
