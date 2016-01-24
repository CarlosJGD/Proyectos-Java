package ClaseFinal;
// Declarar la clase como final, evita la extensión de la clase. NO SE PUEDE HEREDAR.
// NO tiene sentido crear instancia de esta clase
// Todos los atributos y funciones de la clase serán STATIC.

public class ClaseFinal {
	private final static double valorPi = 3.1415;
	
	// Constructor privado ya que no se pueden crear instancias de la clase.
	private ClaseFinal() { } 

	public static double devuelvePI() {
		return valorPi;
	}
	
	public static int sumaEntera (int v1, int v2) {
		return v1 + v2;
	}
	
	public static int restaEntera (int v1, int v2) {
		return v1 - v2;
	}
}


