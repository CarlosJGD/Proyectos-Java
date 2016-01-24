
public class TestTryCatch {
	public static void main(String[] args) {
		try {
            System.out.println("Ejecutamos el bloque de instrucciones:");
            System.out.println("Instrucción 1.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println("Instrucción 2.");
            System.out.println("Instrucción 3, etc.");
        }
        catch (Exception e) {
            System.out.println("Se ejecuta cuando se produce un error");
            System.out.println("Se ha producido el Error: " + e);
        }
        finally {
            System.out.println("Se ejecuta finalmente tanto si se producen errores como si no.");
        }
	}
}
