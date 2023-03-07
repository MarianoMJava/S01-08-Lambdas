package s0108n1ejercicio7;

import java.util.ArrayList;

import java.util.Comparator;

public class S0108N1Ejercicio7 {

	public static void main(String[] args) {
		
		ArrayList<String> cadena = new ArrayList<String>();
		
		cadena.add("Mariano");
		cadena.add("100390");
		cadena.add("MAriano32");
		cadena.add("Hola mundo");
		
		cadena.stream()
		   .sorted(Comparator.comparing(String::length));
		
		for(int i = cadena.size();i>0; i--) {
			System.out.println(cadena.get(i-1));
		
		}
	}


}
