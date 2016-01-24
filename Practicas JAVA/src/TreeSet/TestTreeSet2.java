package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		TreeSet<Producto2> listaOrdenadaPorNombre = new TreeSet<Producto2>(new OrdenarPorNombre());
		listaOrdenadaPorNombre.add(new Producto2("Legumbres", 4.5));
		listaOrdenadaPorNombre.add(new Producto2("Anacardo", 4));	
		listaOrdenadaPorNombre.add(new Producto2("Coles", 5));
		listaOrdenadaPorNombre.add(new Producto2("Berros", 2.2));
		
		System.out.println("------- Ordenada por los Nombres -------");
		for (Producto2 unProducto: listaOrdenadaPorNombre) {
			System.out.println(unProducto.toString());
		}
		
		
		TreeSet<Producto2> listaOrdenadaPorPeso= new TreeSet<Producto2>(new OrdenarPorPeso());
		listaOrdenadaPorPeso.add(new Producto2("Legumbres", 4.5));
		listaOrdenadaPorPeso.add(new Producto2("Anacardo", 4));
		listaOrdenadaPorPeso.add(new Producto2("Coles", 4.01));
		listaOrdenadaPorPeso.add(new Producto2("Berros", 4.2));
		
		System.out.println("\n------- Ordenada por los Pesos (Menor a Mayor) -------");
		for (Producto2 unProducto: listaOrdenadaPorPeso) {
			System.out.println(unProducto.toString());
		}
		
		
		// Ahora lo vamos a hacer usando una clase anónima a la hora de pasarle el Comparator
		// Vamos a ordenar de Mayor a Menor
		TreeSet<Producto2> listaOrdenadaPorPesoDescendente = new TreeSet<Producto2>(new Comparator<Producto2>() {
			@Override
			public int compare(Producto2 o1, Producto2 o2) {
				double result = o1.getPeso() - o2.getPeso();
				if (result < 0)
					return 1;
				else
					if (result > 0)
						return -1;
				
				return 0;
			}
		});
		
		listaOrdenadaPorPesoDescendente.add(new Producto2("Legumbres", 4.5));
		listaOrdenadaPorPesoDescendente.add(new Producto2("Anacardo", 4));
		listaOrdenadaPorPesoDescendente.add(new Producto2("Coles", 4.01));
		listaOrdenadaPorPesoDescendente.add(new Producto2("Berros", 4.2));
		
		System.out.println("\n------- Ordenada por los Pesos (Mayor a Menor) -------");
		for (Producto2 unProducto: listaOrdenadaPorPesoDescendente) {
			System.out.println(unProducto.toString());
		}
		
	}

}
