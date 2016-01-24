import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Ronaldo=Fútbol;Gasol=Baloncesto;","=;",true);
        System.out.println("Hay un total de: "+st.countTokens()+" tokens.");

        while (st.hasMoreTokens()) {  
        	System.out.println(st.nextToken());   
        }
    }
}
