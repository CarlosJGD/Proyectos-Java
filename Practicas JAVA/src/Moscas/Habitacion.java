package Moscas;

import java.util.Random;

public class Habitacion {
	Mosca[][][] coordenadas;
	int maxX, maxY, maxZ;
	
	public Habitacion(int maxX, int maxY, int maxZ) {
		this.maxX = maxX;
		this.maxY = maxY;
		this.maxZ = maxZ;
		coordenadas = new Mosca[maxX][maxY][maxZ];
	}
	
	public void entraMosca() {
		Random posicionAleatoria = new Random();
		int x, y, z;
		
		// Buscamos una posición libre en la habitacion
		do {
			x = posicionAleatoria.nextInt(maxX);
			y = posicionAleatoria.nextInt(maxY);
			z = posicionAleatoria.nextInt(maxZ);
		} while (coordenadas[x][y][z] != null);
		
		coordenadas[x][y][z] = new Mosca();
	}
	
	public void mostrarHabitacion() {
		for (int x = 0; x < maxX; x++) {
			System.out.print("\nEmpezamos X" + x);
			for (int y = 0; y < maxY; y++) {
				System.out.println();
				for (int z = 0; z < maxZ; z++)
					System.out.print(coordenadas[x][y][z] + "\t");
			}
			System.out.println();
		}
	}
	
	public void cazaMosca() {
		for (int x = 0; x < maxX; x++) 
			for (int y = 0; y < maxY; y++) 
				for (int z = 0; z < maxZ; z++) {
					if (coordenadas[x][y][z] != null)
						coordenadas[x][y][z].atrapar();			
				}
	}

}
