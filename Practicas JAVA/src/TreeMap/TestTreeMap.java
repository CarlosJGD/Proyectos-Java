package TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		Persona p = new Persona(1,"María",167);
        p.agendatel.put("Trabajo", "954825748");
        p.agendatel.put("Oficina", "958746362");
        p.agendatel.put("Móvil","666555444");
        p.agendatel.put("Casa","952473456");
        System.out.println("Personas en el mapa: \n"+p);
	}
}
