package Exepciones;

import javax.swing.JOptionPane;

class MailCortoException extends Exception {
	public MailCortoException() {
		
	}
	
	public MailCortoException(String msgError) {
		super(msgError);
	}
}

public class TestExceptionPropia {
	
	private static void chequeaMail(String mail) throws MailCortoException {
		int arroba = 0;
		boolean punto = false;
		
		if (mail.length() <= 3)
			// Lanzamos una excepción que creamos nosotros MailCortoException
			// Si lanzamos una excepción manualmente debemos de indicar en el método que se lanza una excepción
			// y por supuesto debemos de capturarla desde donde se llama con un try ... catch ...
			throw new MailCortoException("El Mail NO puede tener 3 o menos caracteres");
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
		} catch (MailCortoException e) {
			System.out.println("Email de menos de tres caracteres: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
