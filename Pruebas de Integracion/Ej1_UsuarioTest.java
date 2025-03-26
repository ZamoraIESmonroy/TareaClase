package tema3_ejerciciosIntegracion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ej1_UsuarioTest {
	
	@Test
	public void testRegistrarUsuario() {
		Ej1_BaseDeDatos db = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios su = new Ej1_ServicioUsuarios(db);
		
		su.registrarUsuario("Carlos");
		
		assertTrue(su.usuarioRegistrado("Carlos"));
		
	}
}
