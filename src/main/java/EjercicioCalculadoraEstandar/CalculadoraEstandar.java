package EjercicioCalculadoraEstandar;

public class CalculadoraEstandar {

	// Propiedades

	// Constructores
	public CalculadoraEstandar() {
	}

	// Métodos
	public double suma(double num1, double num2) {
		return num1 + num2;
	}

	public double resta(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	public double division(double num1, double num2) {
		return num1 / num2;
	}

	public double resto(double num1, double num2) {
		return num1 % num2;
	}

	public void calcular(String operador, double num1, double num2) {
		switch (operador) {
		case "+":
			suma(num1, num2);
			break;

		case "-":
			resta(num1, num2);
			break;

		case "*":
			multiplicacion(num1, num2);
			break;

		case "/":
			division(num1, num2);
			break;

		case "%":
			resto(num1, num2);
			break;
		}
	}
}