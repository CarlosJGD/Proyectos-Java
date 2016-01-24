package Urnas;
import java.util.Scanner;

public class TestUrna {
	private static final int NUMEROELEMENTOS = 10;
	private static Scanner entrada = new Scanner(System.in);
	

	public static void anadirBola (Urna miUrna) {
		
		System.out.print("Bola a meter: ");
		miUrna.meterBola(new Integer(entrada.nextInt()));	
	}

	public static void eliminarBola (Urna miUrna) {
		
		System.out.print("Bola a eliminar: ");
		miUrna.sacarBola(new Integer(entrada.nextInt()));	
	}
	
	public static void main(String[] args) {
		Urna miUrna = new Urna(NUMEROELEMENTOS);
		String opcion = "";
		

		do {
			System.out.println("1 - Insertar una bola");
			System.out.println("2 - Eliminar una bola");
			System.out.println("3 - Mostrar el contenido de la Urna");
			System.out.println("4 - Reiniciar Urna");
			
			System.out.print("Elige una opción: "); 
			entrada = new Scanner(System.in);
			opcion = entrada.next();
			
			if (opcion.equals("1"))
				anadirBola(miUrna);
			if (opcion.equals("2"))
				eliminarBola(miUrna);
			if (opcion.equals("3"))
				miUrna.mostrarUrna();
			if (opcion.equals("4"))
				miUrna.iniciarUrnaAleatoria(NUMEROELEMENTOS);
			
			System.out.print("\nPara salir pulsa S: ");
			entrada = new Scanner(System.in);
			opcion = entrada.next();
			
		} while (!opcion.equals("S") && !opcion.equals("s")); 
	}
}
