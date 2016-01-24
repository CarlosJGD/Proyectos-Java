package ArrayList.vs.LinkedList;
public class Persona {
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
		return "Persona -> ID: " + idPersona + " Nombre: " + nombre + " Altura: " + altura + "\n"; 
	}
}
