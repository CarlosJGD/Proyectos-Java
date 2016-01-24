package Iterator;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		ListaPersonas miLista = new ListaPersonas();
		Iterator<Persona> it;
		Persona p;
		
		miLista.getListaPersona().add(new Persona(1, "Carlos", 175));
		miLista.getListaPersona().add(new Persona(2, "Ana", 165));
		miLista.getListaPersona().add(new Persona(3, "Lucio", 185));
		
		System.out.println("Lista antes de recorrer/eliminar: \n" + miLista.toString());
		
		it = miLista.iterator();
		while (it.hasNext()) {
			p = it.next();
			if (p.getAltura() > 178) 
				it.remove();
		}
		System.out.println("Lista después de recorrer/eliminar: \n" + miLista.toString());
	}

}
