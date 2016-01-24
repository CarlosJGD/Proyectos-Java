package Cloneable;

public class TestCloneable {

	public static void main(String[] args) {
		Persona persona1 = new Persona(1, "Gloria", 167);
		
		Persona persona2 = persona1.clone();
		
		System.out.println("ID: "+persona1.idPersona+" Nombre: "+persona1.nombre+" Altura: "+persona1.altura);
		System.out.println("ID: "+persona2.idPersona+" Nombre: "+persona2.nombre+" Altura: "+persona2.altura);
	}

}
