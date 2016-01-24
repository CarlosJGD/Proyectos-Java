package Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Persona> miLista = new ArrayList<Persona>();
		
		miLista.add(new Persona(1, "Carlos", 195));
		miLista.add(new Persona(1, "Luis", 174));
		miLista.add(new Persona(1, "Angel", 174));
		
		Collections.sort(miLista);
		System.out.println("Personas Ordenadas por orden Natural: " + miLista);
		
		Collections.sort(miLista, new OrdenarPersonaPorAltura());
		System.out.println("Personas Ordenadas por Altura: " + miLista);
	}

}
