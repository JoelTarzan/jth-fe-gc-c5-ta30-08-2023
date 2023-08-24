package EjercicioGeometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {

	Geometria geom;
	
	@BeforeEach
	public void before() {
		geom = new Geometria();
	}
	
	@Test
	public void testAreaCuadrado() {
		int resultado = geom.areacuadrado(3);
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geom.areaCirculo(3);
		double esperado = 28.2744;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTriangulo() {
		double resultado = geom.areatriangulo(3, 5);
		double esperado = 7.5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRectangulo() {
		int resultado = geom.arearectangulo(3, 5);
		int esperado = 15;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaPentagono() {
		double resultado = geom.areapentagono(10, 3);
		double esperado = 15;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRombo() {
		double resultado = geom.arearombo(9, 7);
		double esperado = 31.5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRomboide() {
		int resultado = geom.arearomboide(6, 4);
		int esperado = 24;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTrapecio() {
		double resultado = geom.areatrapecio(6, 9, 7);
		double esperado = 52.5;
		assertEquals(esperado, resultado);
	}
}