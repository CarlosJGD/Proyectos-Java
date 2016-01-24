package TreeSet;

import java.util.Comparator;

//ESta clase se podría poner dentro de la clase Producto2, como clase Interna.
public class OrdenarPorNombre implements Comparator<Producto2> {
	
	public OrdenarPorNombre() {}

	@Override
	public int compare(Producto2 o1, Producto2 o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}


