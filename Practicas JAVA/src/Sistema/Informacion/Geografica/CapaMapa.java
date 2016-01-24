package Sistema.Informacion.Geografica;

public class CapaMapa {
	private boolean activa;
	private boolean mapa[][];
	private char simbolo;
	
	public CapaMapa(int tamX, int tamY, char simbolo) {
		activa = true;
		this.simbolo = simbolo;
		mapa = new boolean[tamX][];
		
		for (int i = 0; i < tamX; i++) {
			mapa[i] = new boolean[tamY];
			for (int j = 0; j < tamY; j++)
				mapa[i][j] = false;
		}
	}
	
	public void anadeElemento (int coordenadaX, int coordenadaY) {
		mapa[coordenadaX][coordenadaY] = true;
	}
	
	public boolean hayElemento (int coordenadaX, int coordenadaY) {
		return mapa[coordenadaX][coordenadaY];
	}
	
	public boolean estaActiva () {
		return activa;
	}
	
	public void cambiaEstado (boolean nuevoEstado) {
		activa = nuevoEstado;
	}
	
	public void pintaSimbolo() {
		System.out.print(simbolo);
	}
	
	public void pintaCapa() {
		for (int i = 0; i < mapa.length; i++) {
			System.out.println();
			for (int j = 0; j < mapa[i].length; j++)
				if (mapa[i][j])
					System.out.print(simbolo);
				else
					System.out.print("O");
		}
	}
}
