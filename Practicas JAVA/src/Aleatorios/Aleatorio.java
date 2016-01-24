package Aleatorios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Cosas que se pueden hacer para aprender:
//	Separar la clase Aleatorio de la vista.

public class Aleatorio {
	private ArrayList<Integer> valores;
	Random numeroAleatorio;
	
	public Aleatorio() {
		
		valores = new ArrayList<Integer>();
		numeroAleatorio = new Random();
	}
	
	public void anadirEnteroAleatorio () {
		valores.add(new Integer(numeroAleatorio.nextInt(10) + 1));
	}
	
	public void eliminarNumero(int numero) {
		Integer numeroAEliminar = new Integer(numero);
		
		if (valores.contains(numeroAEliminar)){
			valores.remove(numeroAEliminar);
			System.out.println("Objeto Eliminado");
		}
	}
	
	public int eliminarTodosLosNumeros (int numero) {
		Integer numeroAEliminar = new Integer(numero);
		int contador = 0;
		
		while (valores.contains(numeroAEliminar)) {
			valores.remove(numeroAEliminar);
			contador++;
		}
		return contador;
	}
	
	public void mostrarValoresEnteros() {
		Iterator<Integer> it = valores.iterator();
		int i = 1;
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println("Valor " + i + ": " + integer);
			i++;
		}
	}
		
}
