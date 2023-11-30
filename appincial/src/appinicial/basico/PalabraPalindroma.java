package appinicial.basico;

/**
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class PalabraPalindroma {

	private static boolean esPalindromo (String cad)
	{
		boolean palindromo = true;

		int inicioSecuencia = 0;
		int finalSecuencia = cad.length()-1;

			while ((inicioSecuencia<=finalSecuencia)&&(palindromo))
			{
				palindromo = cad.charAt(inicioSecuencia)==cad.charAt(finalSecuencia);
				inicioSecuencia++;
				finalSecuencia--;
			}
		return palindromo;
	}
	
	public static void main(String[] args) {
		if (esPalindromo("pelota"))
		{
			System.out.println("Es palíndromo");
		} else 
		{
			System.out.println("No es palíndromo");
		}
	}
}