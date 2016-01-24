package ArrayList.vs.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 Para probar las velocidades a la hora de insertar elemento dentro de
 ArrayList y LinkedList podemos probar:
	 - Hacer una inserción:
		 - Al principio, posición 0.
		 - A la mitad, posición aprox. 5000
		 - Al final opción por defecto si no le indicamos la posición
		 
	 - Hacer varias inserciones:
		 - Al principio, posición 0.
		 - A la mitad, posición aprox. 5000
		 - Al final opción por defecto si no le indicamos la posición
*/
public class insertarLinkedList {
	final static int NUMEROINSERCIONES = 1;
	
	public static void main(String[] args) {
		ArrayList<Persona> miArrayList = new ArrayList<Persona>();
		LinkedList<Persona> miLinkedList = new LinkedList<Persona>();
		
		for (int i = 0; i < 10000; i++) {
			miArrayList.add(new Persona(i, "Persona" + i, i));
			miLinkedList.add(new Persona(i, "Persona" + i, i));
		}
		
		System.out.println("Tiempo en insertar " + NUMEROINSERCIONES + " elemento en el ArrayList(en nseg):");
        long antes = System.nanoTime();

        for (int i=0; i < NUMEROINSERCIONES; i++)
        	miArrayList.add(5000,new Persona(10001,"Prueba",10001));
        System.out.println(System.nanoTime()- antes); 

		System.out.println("Tiempo en insertar " + NUMEROINSERCIONES + " elemento en el LinkedList(en nseg):");        antes = System.nanoTime();
        
        for (int i=0; i < NUMEROINSERCIONES; i++)
        miLinkedList.add(5000,new Persona(10001,"Prueba",10001));  

        System.out.println(System.nanoTime()- antes);
		
	}

}
