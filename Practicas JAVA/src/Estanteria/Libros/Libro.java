package Estanteria.Libros;

public class Libro {
	private String nombre;
	private int grosor;
	
	public Libro(String nombre) {
		this.nombre = nombre;
		grosor = 1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getGrosor() {
		return grosor;
	}
}
