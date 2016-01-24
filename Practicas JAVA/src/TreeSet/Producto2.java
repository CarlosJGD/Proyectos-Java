package TreeSet;

public class Producto2 implements Comparable<Producto2>{
	private String nombre;
	private double peso;
	
	public Producto2(String nombre) {
		this.nombre = nombre;
		peso = 0.0;
	}
	
	public Producto2(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	@Override
	public int compareTo(Producto2 otroProducto) {
		return nombre.compareTo(otroProducto.getNombre());
	}
	
	@Override
	public String toString() {
		return "[Nombre: " + nombre + "- Peso: " + peso + "]";
	}
}
