package Quinielas;
import java.util.Scanner;

// 5.2 - Programa para crear quinielas. Se creará una matriz de boolean de 3 columnas y 15 filas.
// Debe permitir rellenar la columna indicando el números partido y el resultado
public class QuinielasOO {
	final int NUMEROAPUESTAS = 15;
	final int NUMEROOPCIONES = 3;
	boolean[][] quiniela;
	
	public QuinielasOO() {
		quiniela = new boolean[NUMEROAPUESTAS][NUMEROOPCIONES];
		for (int i = 1; i < NUMEROAPUESTAS; i++)
			for (int j = 0; j < NUMEROOPCIONES; j++)
				quiniela[i][j] = false;
	}
	
	public void rellenaQuiniela() {
		Scanner entrada = new Scanner(System.in);
		boolean resultadoValido = true;
		
		for (int i = 0; i < NUMEROAPUESTAS; i++) {
			do {
				resultadoValido = true;
				System.out.print("Resultado partido " + i + "(1X2): ");
				String resultado = entrada.nextLine();
				if (!resultado.isEmpty())					
					switch (resultado.charAt(0)) {
						case '1':
							quiniela[i][1] = true;
							break;
						case 'X':
						case 'x':
							quiniela[i][0] = true;
							break;
						case '2':
							quiniela[i][2] = true;
							break;
						default:
							System.out.println("Resultado NO válido");
							resultadoValido = false;
					}
				else
					resultadoValido = false;
			} while (!resultadoValido);
		}
		entrada.close();
	}
	
	public void imprimeApuesta () {
		for (int i = 1; i < NUMEROAPUESTAS; i++) {
			System.out.print("Partido " + i + ": ");
			for (int j = 0; j < NUMEROOPCIONES; j++) {
				if (quiniela[i][j])
					if (j == 0)
						System.out.println("X");
					else
						System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		QuinielasOO miQuiniela = new QuinielasOO();
		
		miQuiniela.rellenaQuiniela();
		miQuiniela.imprimeApuesta();
	}
}
