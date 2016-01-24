package Comparable;

public class Persona implements Comparable<Persona>{
	public int idPersona;
	public String nombre;
	public int altura;
	
	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
 
	@Override
	public int compareTo(Persona o) {
		int resultado = 0;
		
		if (this.altura < o.altura) resultado = -1;
		else 
			if (this.altura == o.altura) resultado = 0;
			else resultado = 1;		
		return resultado;
	}
}
