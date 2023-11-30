package appincial.basico;

//import java.util.Iterator;
import java.util.Random;

public class MainArray
{

	public static void main(String[] args) {

		// TODO haced un main, que recibe
		// una serie de argumentos
		// y meimprima el argumento de mayor longitud
		
		if (args.length>0)
		{
			int longitudMayor = 0;
			String palabraMayor = null;
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
				// si la longitud de la cadena actual (args[i])
				if (args[i].length() >= longitudMayor) {
					longitudMayor = args[i].length();
					palabraMayor = args[i];
				}

			}
			System.out.println("Palabra Mayor = " + palabraMayor + " su longitud es " + longitudMayor);
			
		} else {
			System.out.println("No se han proporcionado argumentos");
		}
		
		System.out.println("RECORRER CON FOR EACH");
		for (String palabra : args)
		{
			System.out.println(palabra);
		}
		
		System.out.println("RECORRER CON FOR NORMAL");
		String palabraActual = null;
		for (int j = 0; j<args.length;j++)
		{
			palabraActual = args[j];
			System.out.println(palabraActual);
		}
		
			
			
		int[] arrayNumeros = new int[5];
		int[] arrayNumeros2 = { 1, 2, 3, 4, 5 };

		// vamos a recorrer el array de Numeros
		// y en cada posición, vamos meter un
		// número aleatorio

		int tamanio = arrayNumeros.length;
		//System.out.println(tamanio);
		Random random = new Random();
		for (int posicion = 0; posicion < tamanio; posicion++) {
			arrayNumeros[posicion] = random.nextInt(100);
		}
		// System.out.println(arrayNumeros.toString());

	}

}