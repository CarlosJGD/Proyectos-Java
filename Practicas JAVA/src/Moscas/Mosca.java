package Moscas;

import java.util.Random;

public class Mosca {
	private boolean cazada;
	private Random aleatorio;
	private double probabilidad; // Probabilidad de atrapar la mosca en porcentaje
	
	public Mosca() {
		cazada = false;
		aleatorio = new Random();
		probabilidad = 0.1;  // 10% de probabilidad
	}
	
	public Mosca(double probabilidad) {
		cazada = false;
		aleatorio = new Random();
		this.probabilidad = probabilidad;
	}
	
	public String toString() {
		if (!cazada)
			return "Viva";
		else
			return "Muerta";
	}
	
	public void atrapar() {
		if (aleatorio.nextDouble() < probabilidad)
			cazada = true;		
	}

}
