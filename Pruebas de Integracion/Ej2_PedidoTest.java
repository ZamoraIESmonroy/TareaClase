package tema3_ejerciciosIntegracion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ej2_PedidoTest {
	
	@Test
	public void testEnvioPedido() {
		Ej2_ServicioEnvio se = new Ej2_ServicioEnvio();
		Ej2_ServicioPedido sp = new Ej2_ServicioPedido(se);
		
		sp.crearYEnviarPedido("1234");
		
		assertTrue(se.enviarPedido("1234"));
	}

}
