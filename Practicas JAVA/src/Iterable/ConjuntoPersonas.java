package Iterable;
import java.util.Iterator;

public class ConjuntoPersonas implements Iterable<Persona>{
    public Persona[] conjuntoPersonas; 
    
    public ConjuntoPersonas (Persona[] p) { 
      conjuntoPersonas = p;  
    }

    @Override
    public Iterator<Persona> iterator() {    
    	Iterator<Persona> it = new MiIteratorPersona();
    	return it;         
    }

protected class MiIteratorPersona implements Iterator<Persona>   {
        protected int posicionarray;
        
        public MiIteratorPersona() { 
        	posicionarray = 0; 
        }

        public boolean hasNext() {
            boolean result;

            if (posicionarray < conjuntoPersonas.length) { result = true; }
            else { result = false; }
            return result;
        }

        public Persona next() {
            posicionarray++;
            return conjuntoPersonas[posicionarray-1];
        }

        public void remove(){
            throw new UnsupportedOperationException("No soportado.");
        }
    }
}
