package Estanteria.Libros;

import java.util.ArrayList;

public class Estanteria {
	private ArrayList<Libro> listadoLibros;
	
	public Estanteria() {
		listadoLibros = new ArrayList<Libro>();
	}

	public void ponLibro (Libro nuevoLibro) {
		listadoLibros.add(nuevoLibro);
	}
	
	public void quitaLibro (int indice) {
		listadoLibros.remove(indice);
	}
	
	public void imprimeLibros() {
		for (Libro libro: listadoLibros) {
			System.out.println(libro.getNombre());
		}	
	}
}
