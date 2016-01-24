package TreeSet;

import java.util.TreeSet;

public class TestTreeSet {
	private TreeSet<Producto> compra;
	
	public TestTreeSet() {
		compra = new TreeSet<Producto>();
	}
	
	public void anadeProducto(Producto nuevoProducto) {
		compra.add(nuevoProducto);
	}
	
	public void imprimirCompra() {
		for (Producto unProducto: compra) {
			System.out.println(unProducto.getNombre());
		}
	}

	public static void main(String[] args) {
		TestTreeSet miCompra = new TestTreeSet();
		
		miCompra.anadeProducto(new Producto("Pan", 3.4));
		miCompra.anadeProducto(new Producto("Col", 3.4));
		miCompra.anadeProducto(new Producto("Lechuga", 3.4));
		
		miCompra.imprimirCompra();
		
		miCompra.compra.remove(new Producto("Lechuga"));
		miCompra.compra.add(new Producto("Xoricho"));
			
		
		miCompra.imprimirCompra();
		

	}

}
