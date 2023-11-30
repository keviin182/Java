package appincial.imc;

import java.util.Scanner;

public class MainIMCFunciones {

	/**
	 * Pedimos el peso al usuario
	 * por la entrada estándar (teclado)
	 * 
	 * @return el peso introducido
	 */
	public static float pedirPeso (){
		
		float peso = 0;
		//Scanner scanner = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe tu peso (kg.)");
		peso = scanner.nextFloat();
		
		return peso;
	}
	
	/**
	 * Pedimos altura al usuario
	 * por la entrada estándar (teclado)
	 * @return la altura introducida
	 */
	public static float pedirAltura() {
		
		float altura = 0;
		//Scanner scanner = null;
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escribe tu altura (m.)");
			altura = scanner.nextFloat();
			
		return altura;
	}
	
	/**
	 * Función para calcular el IMC de una persona
	 * conociendo su peso  altura
	 * 
	 * @param peso el peso en kg
	 * @param altura la altura en m
	 * @return el IMC en formato decimal
	 */
	public static double calcularIMCnumerico (float peso, float altura) {
	
	double imcnum =  0;
 	imcnum = (peso / Math.pow(altura, 2));
 	return imcnum;
	
	}
	
	/**
	 * Calcula el imcNominal teniendo en cuenta
	 * el imcNumerico que ha devuelto calcularImcNumerico
	 * 
	 * @param imcnum calcula la IMC dependiendo del peso y altura
	 * @return el IMC nominal
	 */
	public static String calcularIMCNominal(double imcnum) {
		String imcNominal = null;

			if (imcnum < 16) {
				imcNominal = "DESNUTRIDO";
			} else if (imcnum >= 16 && imcnum < 18) {
				imcNominal = "DELGADO";
			} else if (imcnum >= 18 && imcnum < 25) {
				imcNominal = "IDEAL";
			} else if (imcnum >= 25 && imcnum < 31) {
				imcNominal = "SOBREPRESO";
			} else if (imcnum > 31) {
				imcNominal = "OBESO";
			}

		return imcNominal;
	}	
	/**
	 * Imprime acorde al icmnumerico e imcnominal
	 * 
	 * @param imcNominal
	 * @param imcNumerico
	 */
	public static void informarIMC (String imcNominal, double imcNumerico)
	{	
		System.out.println("SU IMC ES " + imcNumerico + " - " + imcNominal);	
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		float pesoUsuario = pedirPeso();
		float alturaUsuario = pedirAltura();
		double imcNumerico = calcularIMCnumerico(pesoUsuario, alturaUsuario);
		String imcNominal =	 calcularIMCNominal(imcNumerico);
		informarIMC(imcNominal, imcNumerico);		
		
	}
}


