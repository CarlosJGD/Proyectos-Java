package Compra.Venta;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int motor;
		
	public Vehiculo() {
		marca = "";
		modelo = "";
		motor = 0;
	}
	
	public Vehiculo(String marca, String modelo, int motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return "[MARCA: " + marca + " MODELO: " + modelo + " MOTOR: " + motor + "]";  
	}
}
