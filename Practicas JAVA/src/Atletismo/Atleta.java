package Atletismo;

import java.util.ArrayList;

public class Atleta implements Comparable<Atleta>{
	private String nombre;
	private double puntuacionFinal;
	private String nacionalidad;
	private ArrayList<Pruebas> pruebasParticipa;
	
	public Atleta(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		puntuacionFinal = 0;
		pruebasParticipa = new ArrayList<Pruebas>();
	}
	
	
//	public void calcularPuntuacionFinal() {
//		double calculo = 0;
//		
//		for (Pruebas prueba: pruebasParticipa)
//			calculo += prueba.getPuntuacion();
//		puntuacionFinal = calculo;
//	}
	
	public double getPuntuacionFinal() {
		return puntuacionFinal;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void anadePrueba(String nombre, double puntuacion) {
		pruebasParticipa.add(new Pruebas(nombre, puntuacion));
		puntuacionFinal += puntuacion;
	}
	
	public void imprimeAtleta() {
		System.out.println("\nNombre: " + nombre);
		System.out.println("Nacionalidad: " + nacionalidad);
		System.out.println("Puntuación Final: " + puntuacionFinal);
		for (Pruebas prueba: pruebasParticipa) 
			System.out.print(prueba.getNombre() + " - ");
	}

	@Override
	public int compareTo(Atleta otroAtleta) {
		return nombre.compareTo(otroAtleta.getNombre());
	}

}
