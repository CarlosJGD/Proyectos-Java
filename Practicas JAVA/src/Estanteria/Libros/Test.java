package Estanteria.Libros;

//5.4 - Crea una estanteria que nos permita almacenar libros

public class Test {

	public static void main(String[] args) {
		Estanteria miEstanteria = new Estanteria();
		
		miEstanteria.ponLibro(new Libro("Caperucita"));
		miEstanteria.ponLibro(new Libro("Cenicienta"));
		miEstanteria.ponLibro(new Libro("Pulgarcito"));
		
		miEstanteria.imprimeLibros();
		miEstanteria.quitaLibro(2);
		System.out.println("-------------------");
		miEstanteria.imprimeLibros();
	}

}
