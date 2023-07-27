package moduleStrings;
import java.util.Scanner;

public class StringConfig {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String testString;
		
		
		
		// Tratando exceções para receber somente letras:
		
		do {
			System.out.println("Digite apenas letras, frases ou números : ");
			testString = sc.nextLine();

		// Criando regra de negócio
		} while (!testString.matches ("[a-zA-Z- ]+"));
		String[] vect = testString.split(" ");
	
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
	}
}
