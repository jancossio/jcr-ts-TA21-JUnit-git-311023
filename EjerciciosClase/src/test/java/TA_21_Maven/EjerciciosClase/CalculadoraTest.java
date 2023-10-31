package TA_21_Maven.EjerciciosClase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc = new Calculadora();
	private double calcDelta = 0.33;
	
	@Test
	public void testSuma() {
		String tmpResult = calc.calculate("+", "3", "8");
		double resultado = Double.parseDouble(tmpResult);
		double esperado = 11.0;
		System.out.println("Error: "+resultado+" Esperado: "+esperado);
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testResta() {
		String tmpResult = calc.calculate("-", "15", "8");
		double resultado = Double.parseDouble(tmpResult);
		double esperado = 7.0;
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testMultiplicacion() {
		String tmpResult = calc.calculate("x", "5", "6");
		double resultado = Double.parseDouble(tmpResult);
		double esperado = 30.0;
		System.out.println("Error: "+resultado+" Esperado: "+esperado);
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testDivision() {
		String tmpResult = calc.calculate("/", "28", "4");
		double resultado = Double.parseDouble(tmpResult);
		double esperado = 7.0;
		assertEquals(esperado, resultado, calcDelta);
	}
	
	@Test
	public void testDivisionExcep() {
		String resultado = calc.calculate("/", "28", "0");
		String esperado = "Error";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testValorErroneo() {
		String resultado = calc.calculate("+", "3a5", "8");
		String esperado = "Error";
		assertEquals(esperado, resultado);
	}
}
