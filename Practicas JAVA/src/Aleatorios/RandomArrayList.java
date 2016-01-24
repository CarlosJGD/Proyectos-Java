package Aleatorios;

import java.util.ArrayList;
import java.util.Random;

// 5.1 Programa que almacena 10 números aleatorios. Usando la clase java.util.Random()

public class RandomArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
		Random numeroAleatorio = new Random();
		
		for (int i = 0; i < 10; i++) {
			numerosAleatorios.add(new Integer(numeroAleatorio.nextInt(100)));
			System.out.print(numerosAleatorios.get(i) + " - ");
		}
		
		

	}

}
