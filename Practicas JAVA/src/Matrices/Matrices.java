package Matrices;
import java.util.Random;

public class Matrices {

	private static final int X = 4;
	private static final int Y = 4;
	private static final int Z = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] puntos3D = new int[X][Y][Z];
		Random numeroAleatorio = new Random();
		
		for (int x = 0; x < X; x++)
			for (int y = 0; y < Y; y++)
				for (int z = 0; z < Z; z++) 
					puntos3D[x][y][z] = numeroAleatorio.nextInt(10);
		
		for (int z = 0; z < Z; z++) {
			System.out.println("Plano Z: " + z);
			for (int x = 0; x < X; x++) {
				for (int y = 0; y < Y; y++) 
					System.out.print(puntos3D[x][y][z] + "\t");
				System.out.println();
			}
		}
	}

}
