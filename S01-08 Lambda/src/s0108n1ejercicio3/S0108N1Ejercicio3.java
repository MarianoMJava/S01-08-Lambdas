package s0108n1ejercicio3;

import java.util.ArrayList;

public class S0108N1Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<String> meses = new ArrayList<String>();

		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");

		meses.forEach((n) -> {
			System.out.println(n);
		});

	}

}
