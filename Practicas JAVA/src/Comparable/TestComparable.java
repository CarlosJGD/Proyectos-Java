package Comparable;

public class TestComparable {
	public static void main(String[] args) {
		Persona persona1 = new Persona(1, "Luis", 178);
		Persona persona2 = new Persona(2, "Gloria", 160);
		
		if (persona1.compareTo(persona2) < 0)
			System.out.println(persona1.nombre+ " es menor que "+ persona2.nombre);
		else
			if (persona1.compareTo(persona2) == 0)
				System.out.println(persona1.nombre+ " es igual que "+ persona2.nombre);
			else
				System.out.println(persona1.nombre+ " es mayor que "+ persona2.nombre);
	}
}
