package Atletismo;

import java.util.TreeSet;

public class EventoAtletismo {
	private String nombre;
	private TreeSet<Atleta> listadoAtletas;
	
	public EventoAtletismo(String nombre) {
		this.nombre = nombre;
		listadoAtletas = new TreeSet<Atleta>();
	}
	
	public void imprimeAtletas() {	
		for (Atleta atleta: listadoAtletas) {
			System.out.println(atleta.getNombre());
		}
	}
	
	public static void main(String[] args) {
		EventoAtletismo miEvento = new EventoAtletismo("Ruta del Puerto");
		
		miEvento.listadoAtletas.add(new Atleta("Paco", "Español"));
		miEvento.listadoAtletas.add(new Atleta("Ivan", "Ruso"));
		miEvento.listadoAtletas.add(new Atleta("Zidane", "Francés"));
		miEvento.listadoAtletas.add(new Atleta("Ronaldo", "Brasileño"));
		
		System.out.println("Listado de atletas del evento: " + miEvento.nombre);
		miEvento.imprimeAtletas();	
		
	}

}
