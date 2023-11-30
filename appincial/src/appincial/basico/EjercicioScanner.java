package appincial.basico;
import java.util.Scanner;

/*HACED UNA APLICACIÓN QUE VAYA PIDIENDO
NÚMEROS AL USUARIO
SI EL NÚMERO ES IMPAR, LO IMPRIME
SI NO, IMPRIME EL MENSAJE "hAS METIDO UN PAR"

EL PROGRAMA DEJA DE PEDIR NÚMEROS
(ACABA)
CUANDO EL USUARIO METE UN CERO*/
public class EjercicioScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número");
		
		int numeroImparLeido = scanner.nextInt();
		do {
			if ((numeroImparLeido % 2) == 0) {

				System.out.println("Haz introducido un número par");
			} else {
				System.out.println(numeroImparLeido);

			}

		} while (numeroImparLeido != 0);
		{
			System.out.println("Has metido cero, se acaba el programa.");
		}
	}
}