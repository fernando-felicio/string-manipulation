package moduleStrings;
import java.util.Scanner;

public class StringConfig {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String testString;
		
		
		
		// Tratando exceções para receber somente letras:
		
		do {
			System.out.println("Digite apenas números : ");
			testString = sc.nextLine();

		// Criando regra de negócio
		} while (!testString.matches ("[0-9 ]+"));
		String[] vect = testString.split(" ");
	
		int countNumber= 1;
		
		for (String item : vect) {
			
			System.out.println("Saída de número " + countNumber + "º é igual a: " + item);
			countNumber ++;
		}
		
		System.out.println(countNumber);
		
		
	}
}
