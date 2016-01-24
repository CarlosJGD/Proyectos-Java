package Urnas;

//import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Urna {

	private HashSet<Integer> miUrna;
	private Random numeroAleatorio;
	
	public Urna(int numeroElementos) {
		miUrna = new HashSet<Integer>();
		numeroAleatorio = new Random();
		iniciarUrnaAleatoria(numeroElementos);
	}
	
	public void iniciarUrnaAleatoria(int numeroElementos) {
//		numeroAleatorio.setSeed(new Date().getTime());
		miUrna.clear();
		while (miUrna.size() < numeroElementos) 
			miUrna.add(new Integer(numeroAleatorio.nextInt(100)));
	}
	
	public void meterBola (Integer nuevaBola) {
		if (miUrna.contains(nuevaBola))
			System.out.println("Ya existe esa bola en la urna");
		else {
			miUrna.add(nuevaBola);
			System.out.println("Bola añadida correctamente");
		}
	}
	
	public void sacarBola(Integer bola) {
		if (miUrna.contains(bola)) {
			miUrna.remove(bola);
			System.out.println("Bola " + bola + " borrada correctamente");
		}
		else 
			System.out.println("La bola " + bola + " no esta en la urna");
	}
	
	public void mostrarUrna () {
		Iterator<Integer> it = miUrna.iterator();
		
		while (it.hasNext()) 
			System.out.print((Integer) it.next() + "\t");
		
		System.out.println();
	}

}
