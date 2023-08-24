package EjercicioCalculadoraEstandar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraEstandarTest {

	CalculadoraEstandar calc;

	@BeforeEach
	public void before() {
		calc = new CalculadoraEstandar();
	}

	@Test
	public void testSuma() {
		double resultado = calc.suma(3, 2);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		double resultado = calc.resta(5, 2);
		double esperado = 3;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testMultiplicacion() {
		double resultado = calc.multiplicacion(5, 2);
		double esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDivision() {
		double resultado = calc.division(18, 2);
		double esperado = 9;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResto() {
		double resultado = calc.resto(31, 2);
		double esperado = 1;
		assertEquals(esperado, resultado);
	}
}