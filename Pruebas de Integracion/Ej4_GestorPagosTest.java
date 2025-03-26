package tema3_ejerciciosIntegracion;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Ej4_GestorPagosTest {
	
	@Test
	public void testGestorPagosExitoso() {
		
		Ej4_ServicioPagos sp = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes so = new Ej4_ServicioOrdenes(sp);
		
		boolean resultado = so.procesarOrden(200);
		assertTrue(resultado);
	}
	
	@Test
	public void testGestorPagoInsuficiente() {
		
		Ej4_ServicioPagos sp = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes so = new Ej4_ServicioOrdenes(sp);
		
		boolean resultado = so.procesarOrden(2000);
		assertFalse(resultado);
		
		
	}

}
