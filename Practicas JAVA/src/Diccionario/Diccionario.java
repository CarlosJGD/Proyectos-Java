package Diccionario;

import java.util.HashMap;
import java.util.Iterator;

public class Diccionario {
	private HashMap<String, Palabras> diccionario;
	
	public Diccionario() {
		diccionario = new HashMap<String, Palabras>();
	}

	public void anadePalabra (String cadena) {
		Palabras nuevaPalabra = new Palabras(cadena);
		diccionario.put(cadena, nuevaPalabra);
	}
	
	public void anadeDefinicion (String cadena, String definicion) {
		Palabras palabra = (Palabras)diccionario.get(cadena);
		palabra.anadeDefiniciones(definicion);
	}
	
	public void imprimeDiccionario() {
		Iterator<Palabras> it = diccionario.values().iterator();
		
		while (it.hasNext()) {
			Palabras unaPalabra = (Palabras)it.next();
			unaPalabra.mostrarDefiniciones();
		}
	}
	
	public static void main(String[] args) {
		Diccionario miDiccionario = new Diccionario();
		
		miDiccionario.anadePalabra("Saludo");
		miDiccionario.anadeDefinicion("Saludo", "Se realiza cuando ves a otra persona");
		miDiccionario.anadeDefinicion("Saludo", "Se realiza por la mañana");
		miDiccionario.anadeDefinicion("Saludo", "Se realiza por la tarde");
		
		miDiccionario.anadePalabra("Chorizo");
		miDiccionario.anadeDefinicion("Chorizo", "Los hay de perro");
		miDiccionario.anadeDefinicion("Chorizo", "Los hay de cerdo");
		miDiccionario.anadeDefinicion("Chorizo", "Los hay de político");
				
		miDiccionario.imprimeDiccionario();
	}

}
