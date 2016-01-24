package Exepciones;

import javax.swing.JOptionPane;

public class TestExcepcionThrow {

	private static void chequeaMail(String mail) throws InterruptedException {
		int arroba = 0;
		boolean punto = false;
		
		if (mail.length() < 3)
			// Lanzamos una excepción que NO tiene que ver con nuestro problema.
			// No es lógico solo es para ver como podemos lanzar una excepción.
			// Si lanzamos una excepción manualmente debemos de indicar en el método que se lanza una excepción
			// y por supuesto debemos de capturarla desde donde se llama con un try ... catch ...
			throw new InterruptedException();
		else {
			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@')
					arroba++;
				
				if (mail.charAt(i) == '.')
					punto = true;
			}
			
			if ((arroba == 1) && punto)
				System.out.println("Dirección Mail Correcta");
			else {
				System.out.println("Dirección Mail NO Correcta");
			}
		}
	}
	
	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Introduce el Mail: ");
		try {
			chequeaMail(mail);
		} catch (InterruptedException e) {
			System.out.println("Email de menos de tres caracteres: " + e.getClass().getName());
		}
	}

}
