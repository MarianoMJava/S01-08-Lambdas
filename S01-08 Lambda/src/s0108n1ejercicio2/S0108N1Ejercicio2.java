package s0108n1ejercicio2;

import java.util.ArrayList;

public class S0108N1Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> listaO = new ArrayList<String>();

		lista.add("Mariano");
		lista.add("Alberto");
		lista.add("Laura");
		lista.add("Maria");
		lista.add("Ana");
		lista.add("Lautaro");
		lista.add("Mauro");

		lista.forEach((n) -> {
			if (n.contains("o") && n.length()>5) {
				listaO.add(n);
			}
		});
		
		System.out.println(listaO);
	}

}
