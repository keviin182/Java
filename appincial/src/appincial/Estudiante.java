package appincial;


public class Estudiante extends Persona {
	
	private int numero;
	private int promedio;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public Estudiante(int numero, int promedio) {
		super();
		this.numero = numero;
		this.promedio = promedio;
	}

	public Estudiante() {
		super();
	}
	
	
	@Override //"redefinir un método en la clase HIJA
	public void mostrarPersona() {
			System.out.println("NOMBRE = " + this.getNombre());
			System.out.println("TELÉFONO = " + this.getTelefono());
			System.out.println("EMAIL = " + this.getEmail());
			System.out.println("NÚMERO ESTUDIANTE = " + this.numero);
			System.out.println("NOTA MEDIA = " + this.promedio);
			
	
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean iguales = false;
		
		if (obj != null) {
			
			if (obj instanceof Estudiante) {
				
				Estudiante e = (Estudiante)obj;
				
				if (this.getNombre().equals(e.getNombre()) &&
					this.getEmail().equals(e.getEmail()) &&
					this.getTelefono() == e.getTelefono() &&
					this.getNumero() == e.getNumero() &&
					this.getPromedio() == e.getPromedio())
				
				{
					iguales = true;
				}
				
			}
			
		}
			
		return iguales;
	}

	@Override
	public String toString() {
		return "Estudiante [numero=" + numero + ", promedio=" + promedio + ", getNumero()=" + getNumero()
				+ ", getPromedio()=" + getPromedio() + "]";
	}

	
	
}