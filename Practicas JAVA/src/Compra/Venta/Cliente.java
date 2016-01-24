package Compra.Venta;

public class Cliente {
	private String dni;
	private String nombre;
	private int edad;
	
	public Cliente() {
		dni = "";
		nombre = "";
		edad = 0;
	}

	public Cliente(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "[DNI: " + dni + " NOMBRE: " + nombre + " EDAD: " + edad + "]";  
	}
}
