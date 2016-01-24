package Cloneable;

public class Persona implements Cloneable{
	public int idPersona;
	public String nombre;
	public int altura;
	
	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
	
	@Override
	public Persona clone() {
		Persona clon;
		clon = new Persona(idPersona, nombre, altura);
		return clon;		
	}
}