package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class recorrerArrayList {
	public static void main(String[] args) {
		ArrayList<Persona> miAgenda = new ArrayList<Persona>();
		
		miAgenda.add(new Persona(1, "Clara", 160));
		miAgenda.add(new Persona(2, "Lucio", 160));
		miAgenda.add(new Persona(3, "Antoni", 170));
		miAgenda.add(new Persona(4, "Luis", 170));

		Iterator<Persona> it = miAgenda.iterator();
		double suma = 0;
		Persona personaAux;
		while (it.hasNext()) {
			personaAux = it.next();
			suma += personaAux.getAltura();
		}
		double media = suma / miAgenda.size();
		
		System.out.println("La media es: " + media);
	}

}
