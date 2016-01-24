package CorreoElectronico;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorCorreo {
	ArrayList<CorreoElectronico> listaCorreos;
	
	public GestorCorreo() {
		listaCorreos = new ArrayList<CorreoElectronico>();
	}

	public void anadeCorreo (CorreoElectronico nuevoCorreo) {
		listaCorreos.add(nuevoCorreo);
	}
	
	public void eliminaCorreo (int numeroCorreo) {
		listaCorreos.remove(numeroCorreo);
	}
	
	public void imprimeTodosCorreos() {
		Iterator<CorreoElectronico> it = listaCorreos.iterator();
		CorreoElectronico correo;
		
		while (it.hasNext()) {
			correo = (CorreoElectronico) it.next();
			correo.imprimeCorreo();
		}
	}
	
	public static void main(String[] args) {
		GestorCorreo misCorreos = new GestorCorreo();
		misCorreos.anadeCorreo(new CorreoElectronico("Lola", "Yo", "Vacaciones", "Las vacaciones serán en el mes de ..."));
		misCorreos.anadeCorreo(new CorreoElectronico("Yo", "Tu", "Libros", "Las libros están en Burgos ..."));
		misCorreos.anadeCorreo(new CorreoElectronico("Juan", "Yo", "Editoriales", "Las editoriales no se encuentran ..."));
		misCorreos.anadeCorreo(new CorreoElectronico("Yo", "Rocio", "Días Libre", "Los días libres solicitados se ..."));
		System.out.println("------ Listado de mis Correos ------\n");
		misCorreos.imprimeTodosCorreos();
	}
}
