package Aleatorios;
import java.util.Scanner;

public class TestAleatorio {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		Aleatorio misValores = new Aleatorio(); 
		
		
		for (int i = 0; i < 10; i++) 
			misValores.anadirEnteroAleatorio();

		misValores.mostrarValoresEnteros();	
		System.out.print("Introduce el número a eliminar: ");
		entrada = new Scanner(System.in);
		System.out.println(misValores.eliminarTodosLosNumeros(entrada.nextInt()) + " Objetos Eliminados");	
		misValores.mostrarValoresEnteros();
	}
}
