package TreeSet;

import java.util.Comparator;

// ESta clase se podría poner dentro de la clase Producto2, como clase Interna.
public class OrdenarPorPeso implements Comparator<Producto2>{

	public OrdenarPorPeso() {}

	// IMPORTANTE si usamos un Set debemos tener en cuenta que si este método retorna 0
	// lo toma como que son objetos iguales y no lo introduce.
	// Osea si son del mismo Peso lo considera iguales y NO lo añade.
	// Ordena de Menor a Mayor, cambiamos los return ordena de Mayor a Menor
	@Override
	public int compare(Producto2 o1, Producto2 o2) {
		double result = o1.getPeso() - o2.getPeso();
		if (result < 0)
			return -1;
		else
			if (result > 0)
				return 1;
		
		return 0;
	}
}
