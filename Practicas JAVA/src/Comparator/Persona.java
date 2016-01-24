package Comparator;

public class Persona implements Comparable<Persona>{
	private int idPersona;
	private String nombre;
	private int altura;
	
	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
 
	public int getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return new Integer(this.altura).compareTo(new Integer(o.getAltura()));
//		return this.nombre.compareTo(o.nombre);
	}
}
