package Moscas;

public class TestHabitacion {

	public static void main(String[] args) {
		Habitacion miHabitacion = new Habitacion(5, 5, 7);
		
		
		for (int i = 0; i < 20; i++)
			miHabitacion.entraMosca();
		
		miHabitacion.cazaMosca();
		miHabitacion.mostrarHabitacion();
		
	}

}
