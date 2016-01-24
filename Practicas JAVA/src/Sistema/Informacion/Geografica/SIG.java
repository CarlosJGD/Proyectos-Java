package Sistema.Informacion.Geografica;

import java.util.HashMap;
import java.util.Iterator;

public class SIG {
	private int tamanoX;
	private int tamanoY;
	private HashMap<String, CapaMapa> capas;
	
	public SIG() {
		tamanoX = 10;
		tamanoY = 10;
		capas = new HashMap<String, CapaMapa>();
	}
	
	public SIG(int tamanoX, int tamanoY) {
		this.tamanoX = tamanoX;
		this.tamanoY = tamanoY;
		capas = new HashMap<String, CapaMapa>();
	}
	
	public void anadeCapa (String nombre, CapaMapa capa) {
		capas.put(nombre, capa);
	}
	
	public void anadeElementoCapa (String nombre, int coorX, int coorY) {
		CapaMapa capa = (CapaMapa)capas.get(nombre);
		capa.anadeElemento(coorX, coorY);
	}
	
	public void pintaCapa (String nombre) {
		CapaMapa capa =(CapaMapa)capas.get(nombre);
		capa.pintaCapa();
	}
	
	public void activaCapa (String nombre) {
		CapaMapa capa = capas.get(nombre);
		capa.cambiaEstado(true);
	}
	
	public void desactivaCapa (String nombre) {
		CapaMapa capa = capas.get(nombre);
		capa.cambiaEstado(false);
	}
	
	public void imprimeListaCapas() {
		System.out.println(" ---- CAPAS ---- ");
		
		Iterator<String> it = capas.keySet().iterator();
		while (it.hasNext()) {
			System.out.println((String)it.next());
		}
	}
	
	public void pintarSIG() {
		
		for (int i = 0; i < tamanoX; i++) {
			for (int j = 0; j < tamanoY; j++) {
				boolean elementoPintado = false;
				
				Iterator<CapaMapa> it = capas.values().iterator();
				while (it.hasNext()) {
					CapaMapa capa = (CapaMapa)it.next();
					if (capa.estaActiva() && capa.hayElemento(i,j)) {
						capa.pintaSimbolo();
						elementoPintado = true;
						break;
					}
				}
				if (!elementoPintado) {
					System.out.print("_");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANOX = 5;
		final int TAMANOY = 5;
		
		SIG miSig = new SIG(TAMANOX,TAMANOY);
		
		miSig.anadeCapa("Hospital", new CapaMapa(TAMANOX,TAMANOY,'+'));
		miSig.anadeCapa("Restaurantes", new CapaMapa(TAMANOX,TAMANOY,'R'));
		miSig.anadeCapa("Autobuses", new CapaMapa(TAMANOX,TAMANOY,'P'));
		
		miSig.anadeElementoCapa("Hospital", 0, 0);
		miSig.anadeElementoCapa("Hospital", 0, 1);
		miSig.anadeElementoCapa("Hospital", 0, 2);
		miSig.anadeElementoCapa("Hospital", 0, 3);
		miSig.anadeElementoCapa("Restaurantes", 0, 1);
		miSig.anadeElementoCapa("Restaurantes", 0, 2);
		miSig.anadeElementoCapa("Restaurantes", 0, 3);
		miSig.anadeElementoCapa("Restaurantes", 0, 4);
		miSig.anadeElementoCapa("Autobuses", 0, 1);
		miSig.anadeElementoCapa("Autobuses", 0, 2);
		miSig.anadeElementoCapa("Autobuses", 0, 3);
		miSig.anadeElementoCapa("Autobuses", 0, 4);
		miSig.anadeElementoCapa("Autobuses", 0, 5);
		
		miSig.imprimeListaCapas();
	
		miSig.pintarSIG();
	}

}
