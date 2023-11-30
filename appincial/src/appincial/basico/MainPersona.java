package appincial.basico;

public class MainPersona {

	public static void main(String[] args) {
		Persona kevin = new Persona();
		kevin.edad = 26;
		kevin.nombre = "Kevin";

		Persona bernabe = new Persona();
		bernabe.edad = 16;
		bernabe.nombre = "Bernabé";

		System.out.println(bernabe.edad);
		System.out.println(bernabe.nombre);
		System.out.println(kevin.edad);
		System.out.println(kevin.nombre);
	}

}
