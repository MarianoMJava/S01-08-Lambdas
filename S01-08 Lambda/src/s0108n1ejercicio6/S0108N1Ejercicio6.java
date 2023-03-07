package s0108n1ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class S0108N1Ejercicio6 {

	public static void main(String[] args) {
		
		ArrayList<String> cadena = new ArrayList<String>();
		
		cadena.add("Mariano");
		cadena.add("100390");
		cadena.add("MAriano32");
		cadena.add("Hola mundo");
		
		cadena.stream()
		   .sorted(Comparator.comparing(String::length))
		   .forEach(System.out::println);	
		}
	
}


