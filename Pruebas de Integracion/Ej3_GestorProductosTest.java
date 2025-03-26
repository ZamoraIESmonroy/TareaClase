package tema3_ejerciciosIntegracion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ej3_GestorProductosTest {
	
	@Test
	public void testGestionProductos() {
		Ej3_BaseDeDatosProductos bdp = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gp = new Ej3_GestorProductos(bdp);
		
		gp.registrarProducto("9876");
		
		assertTrue(gp.productoRegistrado("9876"));
		
	}

}
