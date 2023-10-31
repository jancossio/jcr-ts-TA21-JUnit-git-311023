package TA_21_Maven.EjerciciosClase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest1 {
	
	Geometria geo = new Geometria();
	private double calcDelta = 0.33;
	
	
	@Test
	public void testAreacuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreacirculo() {
		double resultado = geo.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testArearectangulo() {
		int resultado = geo.arearectangulo(2,4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreapentagono() {
		int resultado = geo.areapentagono(30,4);
		int esperado = 60;
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testArearombo() {
		int resultado = geo.arearombo(2,4);
		int esperado = 4;
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testArearomboide() {
		int resultado = geo.arearomboide(2,4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreatrapecio() {
		int resultado = geo.areatrapecio(3,5,2);
		int esperado = 8;
		assertEquals(esperado, resultado,calcDelta);
	}
	
	@Test
	public void testFigura0() {
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura1() {
		String resultado = geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura2() {
		String resultado = geo.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetId() {
		geo.setId(5);
		int resultado = geo.getId();
		assertEquals(5, resultado);
	}
	
	@Test
	public void testGetNom() {
		geo.setNom("pentagono_num4");
		String resultado = geo.getNom();
		assertEquals("pentagono_num4", resultado);
	}
	
	@Test
	public void testGetArea() {
		Double tmpArea = 40.0;
		geo.setArea(tmpArea);
		double resultado = geo.getArea();

		assertEquals(tmpArea, resultado);
	}
	
	@Test
	public void testToString() {
		String resultado = geo.toString();
		assertEquals("Geometria [id=9, nom=Default, area=0.0]", resultado);
	}
	
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

}
