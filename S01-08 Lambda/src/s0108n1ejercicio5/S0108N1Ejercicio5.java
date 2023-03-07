package s0108n1ejercicio5;

public class S0108N1Ejercicio5 {

	@FunctionalInterface
	interface PiValue {

		public double getPiValue(double x);

	}

	public static void main(String[] args) {

		final double PI = 3.1415;

		PiValue pi = (x) -> x;
		System.out.println(pi.getPiValue(PI));

	}

}
