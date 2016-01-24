package Iterable;
import java.util.Iterator;

public class TestIterable {

	public static void main(String arg[]) {
        Persona p1 = new Persona(74999999,35);
        Persona p2 = new Persona(72759474,30);
        Persona p3 = new Persona(74853735,25);
        Persona[] pp = {p1,p2,p3};
        
        ConjuntoPersonas cp = new ConjuntoPersonas(pp);

        Iterator<Persona> it1 = cp.iterator();
        while (it1.hasNext()){
            Persona tmp = it1.next();
            System.out.println("La persona:"+tmp.dni+" tiene una edad de:"+tmp.edad);
        }
	}
}
