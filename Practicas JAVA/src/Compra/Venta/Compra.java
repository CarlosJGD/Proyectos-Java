package Compra.Venta;

public class Compra {
	// Con la palabra static conseguimos que codigoAux sea compartida por todos los objetos.
	// de la clase Compra. Por lo que el valor de la variable siguienteCodigo será compratida.
	private static int siguienteCodigo = 0;  
	private int codigoCompra;
	private Cliente comprador;
	private Vehiculo coche;
	private double precio;
	
	public Compra(Cliente comprador, Vehiculo coche, double precio) {
		this.comprador = comprador;
		this.coche = coche;
		this.precio = precio;
		codigoCompra = siguienteCodigo;  // Asignamos el Codigo de compra por el que vamos
		siguienteCodigo++;			     // Incrementamos el código para la próxima compra
	}
	
	@Override
	public String toString() {
		return "Código Compra: " + codigoCompra +
			   "\nComprador: " + comprador.toString() + 
			   "\nCoche: " + coche.toString() + 
			   "\nPrecio: "	+ precio + "€";
	}
}
