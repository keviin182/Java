package appincial;

import java.util.ArrayList;
import java.util.List;

public class MainHerencia {
	
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = null;
		
		listaPersonas = new ArrayList<Persona>();
		
		
		
		Persona persona = new Persona();
		
		Estudiante estudiante = new Estudiante();
		//CASTING 
		Persona persona2 = (Persona) estudiante;
		
		//Estudiante estudiante2 = (Estudiante)persona;
		
        Object opersona = 	(Object) persona;
		
		Estudiante estudiante2 = (Estudiante)persona2;
		
		estudiante.setNombre("Defeng");
		estudiante.setEmail("defeng@kuku.ch");
		estudiante.setTelefono(9874521);
		estudiante.setNumero(1);
		estudiante.setPromedio(5);
		
		
		persona.setNombre("Laura");
		persona.setEmail("lau@correo.es");
		persona.setTelefono(4545848);
		
		
		listaPersonas.add(estudiante);
		listaPersonas.add(persona);
		
		
		Persona personaPos0 = listaPersonas.get(0);
		System.out.println("El nombre de 0 es " +personaPos0.getNombre());
		
		Persona personaPos1 = listaPersonas.get(1);
		System.out.println("El nombre de 1 es " +personaPos1.getNombre());
		
		for (Persona p : listaPersonas)
		{
			System.out.println(p.getNombre());
		}
		
		Persona p = null;
		for (int pos=0; pos<listaPersonas.size(); pos++)
		{
			p = listaPersonas.get(pos);
			p.mostrarPersona();
		}
		
		//listaPersonas.add((Persona)opersona);
		
		int longi =  listaPersonas.size();
		System.out.println(longi);
		
		
		
		if (estudiante instanceof Persona)
		{
			System.out.println("Sí, el estudiante es Persona");
		} else {
			System.out.println("NO, el estudiante No es Persona");
		}
		
		if (persona instanceof Estudiante)
		{
			System.out.println("Sí, la persona es Estudiante");
		} else {
			System.out.println("NO, la persona  No es Estudiante");
		}
		}
	
		/*1) UN MÉTDO QUE RECIBA UN ALUMNO Y UNA LISTA DE ALUMNOS Y DIGA EN QUE POSICIÓN ESTÁ ESE ALUMNO
		O -1 SI ESE ALUMNO NO EXISTE EN AL LISTA*/
		public static int posicionEstudiante (Estudiante estudianteBuscado, List<Estudiante> listaEstudiantes)
		{
			int posicion = -1;
			int posicionActual = 0;
			int longitud = listaEstudiantes.size();
			boolean encontrado = false;
			Estudiante estudianteAux = null;
			//hago esto hasta llegar al final o encontrar al alumno
			//recorro la lista lista y voy buscando
				//si el estudiante actual es igula al buscado, me guardo la posición
				//si no voy a la siguiente
			while ((posicionActual<longitud)&& (!encontrado)){
				estudianteAux = listaEstudiantes.get(posicionActual);
				//si el estudianteAux es igual a estudianteBuscado
				//encontrado = true y actualizo posicion
				if (estudianteAux.equals(estudianteBuscado))
				{
					encontrado = true;
					posicion = posicionActual;
				} 
				//si no, voy al siguiente
				else {
					posicionActual++;
				}
			}
			return posicion;
		}
		
		/*2) UN MÉTODO QUE RECIBA UNA LISTA DE ESTUDIANTES 
		Y DEVUELVA LA NOTA MEDIA*/

		
		public static float notaMedia(List <Estudiante> listaEstudiantes){
			
			float notaMedia = 0;
			float suma = 0;
			Estudiante estudiante = null;
			
			for (int i = 0 ; i < listaEstudiantes.size() ; i++) {
				
				estudiante = listaEstudiantes.get(i);
				estudiante.getPromedio();
				suma = suma + estudiante.getPromedio();
			
			}
			
			notaMedia = suma / listaEstudiantes.size();
			
		return notaMedia;
			
		}
		/*3) IGUAL QUE EL 2, PERO HACED QUE USE 
		EL ENUMERADO TipoNota y devuelva un 
		TipoNota en vez de el número*/
	
		
	
}