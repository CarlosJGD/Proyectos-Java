package Vector;
import java.util.Vector;

public class miVector {

	public static void main(String[] args) {
		Vector <Persona> miVector = new Vector<Persona>();
		
		System.out.println("Capacidad Inicial: " + miVector.capacity());
		for (int i = 0; i < 15; i++)
			miVector.add(new Persona(i, "Persona"+i, i));
		
		System.out.println("Capacidad Actual: " + miVector.capacity());
		miVector.trimToSize();
		System.out.println("Capacidad Actual: " + miVector.capacity());
		miVector.ensureCapacity(50);
		System.out.println("Capacidad Actual: " + miVector.capacity());
	}

}
