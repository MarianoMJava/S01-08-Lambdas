package s0108n1ejercicio8;

import java.util.Scanner;

public class S0108N1Ejercicio8 {
	
	@FunctionalInterface
	interface Reverse{
		
		public void reverse(String frase);
	
	};

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String frase;
		
		System.out.println("Introduzca la frase a invertir");
		
		frase = sc.nextLine();
		
		Reverse rev = (f) -> {for(int i=f.length();i>0;i--) {
			System.out.print(f.charAt(i-1));
		
		}
		
		System.out.println();
		
	};
	
	rev.reverse(frase);
	
	rev.reverse("Mariano");
	
	
			
	}

}
