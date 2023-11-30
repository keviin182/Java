package appincial.basico;
import java.util.Scanner;
/*
1) 1 PROGRAMA QUE PIDA 10 NÚMEROS AL USUARIO Y LOS IMPRIMA POR PANTALLA
2) 1 PROGRAMA QUE PIDA 10 NÚMEROS AL USUARIO Y DIGA CUÁNTOS IMPARES HAY DE ESOS DIEZ
3) 1 PROGRAMA QUE PIDA 10 NÚMEROS Y DIGA LA SUMA DE LOS 10
4) 1 PROGRAMA QUE PIDA 10 NÚMEROS Y DIGA EL MAYOR DE LOS 10
5) 1 PROGRAMA QUE PIDA 10 NÚMEROS Y DIGA EL MAYOR, LA MEDIA Y EL MENOR
*/
public class MainNumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numImpar = 0;

		for (int numero = 0; numero < 10; numero++) {
			System.out.println("Introduce un número");
			int numeroIntroducido = scanner.nextInt();
			System.out.println("Has introducido " + numeroIntroducido);

			if (numeroIntroducido % 2 != 0)

			{
				numImpar++;
			}
		}
		System.out.println("Hay " + numImpar + " números impares");
		System.out.println("Fin del programa");
	}
}


