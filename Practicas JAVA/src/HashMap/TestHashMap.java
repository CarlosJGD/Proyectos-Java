package HashMap;
import java.util.HashMap;
import java.util.Map;
public class TestHashMap {
    public static void main (String []args)     {
        Map <Integer,Persona> mp = new HashMap<Integer,Persona>();
        Persona p = new Persona(4,"María",167);
        mp.put(4, p); 
        p = new Persona(1,"Marta",165);
        mp.put(1, p); 
        p = new Persona(3,"Elena",185);
        mp.put(3, p); 
        p = new Persona(2,"Yolanda",174);
        mp.put(2, p); 
        p = new Persona(5,"María Dolores",169);
        mp.put(4, p); // Esto crea una colisión ¡Dos objetos no pueden tener la misma clave!

        System.out.println("Personas en el mapa: \n"+mp.toString().replaceAll(",", "\n"));
    }
}