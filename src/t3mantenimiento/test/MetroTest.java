package t3mantenimiento.test;



import junit.framework.TestCase;
import t3mantenimiento.metro.Metro;


public class MetroTest extends TestCase {
	Metro m;

	public void setUp() {
		m = new Metro();
	}

	public void testEstadoParado() {
		int esperado = 0;
		assertTrue(m.getEstado() == esperado);
	}

	public void testEstadoArrancando() {
		int esperado = 1;
		m.siguienteEstado();
		assertTrue(m.getEstado() == esperado);
	}

	public void testEstadoEnMarcha() {
		int esperado = 2;
		m.siguienteEstado();
		m.siguienteEstado();
		assertTrue(m.getEstado() == esperado);
	}

	public void testEstadoParando() {
		int esperado = 3;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		assertTrue(m.getEstado() == esperado);
	}
	
	public void testEstadoFinTrayecto() {
		int esperado = 4;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		assertTrue(m.getEstado() == esperado);
	}

	public void testEstadoParadoFinal() {
		int esperado = 0;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		assertTrue(m.getEstado() == esperado);
	}
}