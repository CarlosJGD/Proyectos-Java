package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas {
	private ArrayList<Persona> listaPersona = null;
	
	public ListaPersonas() {
		listaPersona = new ArrayList<Persona>();
	}
		
	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}

	public Iterator<Persona> iterator() {
		return new MiIteradorListaPersonas();
	}
	
	@Override
	public String toString() {
		return listaPersona.toString();
	}
	
	protected class MiIteradorListaPersonas implements Iterator<Persona> {
		private int posicion = 0;
		private boolean sePuedeEliminar = false;
		
		@Override
		public boolean hasNext() {
			return posicion < listaPersona.size();
		}
		
		@Override
		public Persona next() {
			Persona res = listaPersona.get(posicion);
			posicion++;
			sePuedeEliminar = true;
			return res;
		}
		
		@Override
		public void remove() {
			if (sePuedeEliminar) {
				listaPersona.remove(posicion-1);
				posicion-- ;
				sePuedeEliminar = false;
			}
		}
	}
}
