package TreeSet;

public class Producto implements Comparable<Producto>{
	private String nombre;
	private double peso;
	
	public Producto(String nombre) {
		this.nombre = nombre;
		peso = 0.0;
	}
	
	public Producto(String nombre, double peso) {
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
	public int compareTo(Producto otroProducto) {
		return nombre.compareTo(otroProducto.getNombre());
	}
	
	
}
