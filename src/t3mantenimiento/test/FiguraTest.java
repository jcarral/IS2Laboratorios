package t3mantenimiento.test;

import junit.framework.TestCase;
import t3mantenimiento.figuras.Figura;

public class FiguraTest extends TestCase {
	Figura circulo;
	Figura cuadrado;
	Figura rectangulo;
	
	public void setUp(){
		circulo = new Figura();
		cuadrado = new Figura();
		rectangulo = new Figura();
		circulo.setR(3);
		cuadrado.setA(5.3);
		rectangulo.setA(11.3);
		rectangulo.setB(2.88);
		
	}
	public void testCalculateAreaCirculo() {
		double esperado = 28.274333882308138;
		double resultado = circulo.calculateArea(Figura.CIRCLE);
		assertEquals(esperado, resultado);
	}

	public void testCalculatePerimeterCirculo() {
		double esperado = 18.84955592153875943077586029967701730518301639625063492584;
		double resultado = circulo.calculatePerimeter(Figura.CIRCLE);
		assertEquals(esperado, resultado);
	}
	
	public void testCalculateAreaSquare(){
		double esperado = 28.09;
		double resultado = cuadrado.calculateArea(Figura.SQUARE);
		assertEquals(esperado, resultado);
	}

	public void testCalculatePerimeterSquare(){
		double esperado = 21.2;
		double resultado = cuadrado.calculatePerimeter(Figura.SQUARE);
		assertEquals(esperado, resultado);
	}
	
	public void testCalculateAreaRectangle(){
		double esperado = 32.544000000000004;
		double resultado = rectangulo.calculateArea(Figura.RECTANGLE);
		assertEquals(esperado, resultado);
	}
	
	public void testCalculatePerimeterRectangle(){
		double esperado = 28.36;
		double resultado = rectangulo.calculatePerimeter(Figura.RECTANGLE);
		assertEquals(esperado, resultado);
	}
}
