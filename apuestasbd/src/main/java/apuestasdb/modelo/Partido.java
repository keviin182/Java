package apuestasdb.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	 private int id;
	 private LocalDate fecha;
	 private int golesLocal;
	 private int golesVisitante;
	 private Equipo equipoLocal;
	 private Equipo equipoVisitante;
	 
	 
	 
	 public Partido(Equipo equipo1, Equipo equipo2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	/**
	  * El método crea una lista de partidos donde los equipos recibidos
	  * se enfrentan ida y vuelta
	  * 	  * 
	  * @param listaEquipos
	  * @return la lista de partidos creada
	  */
	 public static List<Partido> generarPartidos (List<Equipo> listaEquipos)
	 {
		 List<Partido> listaPartidos = null;
		 
		 	int numPartidos = listaEquipos.size() * (listaEquipos.size()-1); 
		 	listaPartidos = new ArrayList<Partido>(numPartidos);
		 	
		 	//TODO completar partidos con fecha
		 
		 	for (int i = 0; i < listaEquipos.size()-1; i++) {
		 		
		 		for (int j = i + 1; j < listaEquipos.size(); j++) {
		 			
		 			Equipo equipoLocal = listaEquipos.get(i);
		 			Equipo equipoVisitante = listaEquipos.get(j);
		 			
		 			Partido partidoIda = new Partido(equipoLocal, equipoVisitante);
		 			listaPartidos.add(partidoIda);
		 			Partido partidoVuelta = new Partido (equipoVisitante, equipoLocal);
		 			listaPartidos.add(partidoVuelta);
			
				}
				
			}
		 	
		 return listaPartidos;
	 }
	 
	 public static void main(String[] args) {
		 
		 LocalDate fecha= LocalDate.now();
		 System.out.println(fecha); 
		 fecha = fecha.plusWeeks(1);
		 System.out.println(fecha);
		 System.out.println(System.currentTimeMillis());
		//System.out.println(LocalDateTime.now());
		 
			}
	 
	 
	 

}