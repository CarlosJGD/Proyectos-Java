package Stack;
import java.util.Stack;

public class miStack {

	static boolean cadenaEquilibrada(String cadena) {
		Stack <String> pilaLIFO = new Stack<String>();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '(')
				pilaLIFO.push("(");
			
			if (cadena.charAt(i) == ')' && !pilaLIFO.empty())
				pilaLIFO.pop();
			else
				break;
		}
		if (pilaLIFO.empty())
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		
		String cadenaEquilibrada = "(Esta es (una cadena)) que está equilibrada)";
		String cadenaNoEquilibrada = "((Esta es (una cadena))))) que NO está equilibrada)";
		
		if (cadenaEquilibrada(cadenaEquilibrada))
			System.out.println("Cadena equilibrada");
		else
			System.out.println("Cadena NO equilibrada");
		
		if (cadenaEquilibrada(cadenaNoEquilibrada))
			System.out.println("Cadena equilibrada");
		else
			System.out.println("Cadena NO equilibrada");
		
		
	}

}
