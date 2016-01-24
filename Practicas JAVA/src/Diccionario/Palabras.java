package Diccionario;

import java.util.ArrayList;
import java.util.Iterator;

public class Palabras {
	private String palabra;
	private ArrayList<String> definiciones;
	
	public Palabras() {
		palabra = "";
		definiciones = new ArrayList<String>();
	}
	
	public Palabras(String nuevaPalabra) {
		palabra = nuevaPalabra;
		definiciones = new ArrayList<String>();
	}
	
	public Palabras(String nuevaPalabra, String definicion) {
		palabra = nuevaPalabra;
		definiciones = new ArrayList<String>();
		definiciones.add(definicion);
	}
	
	public void anadeDefiniciones(String definicion) {
		definiciones.add(definicion);
	}
	
	public void eliminaDefinicion(int index) {
		definiciones.remove(index);
	}
	
	public void mostrarDefiniciones() {
		System.out.println("Palabra: " + palabra);
		Iterator<String> it = definiciones.iterator();
		
		while(it.hasNext()) {
			System.out.println("- " + (String)it.next());
		}
		
	}

}
