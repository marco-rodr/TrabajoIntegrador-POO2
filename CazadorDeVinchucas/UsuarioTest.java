import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Muestra.Muestra;
import entity.NivelUsuario;
import entity.Usuario;
import entity.Verificacion;

class UsuarioTest {
	
	
	
	
	private Usuario usuario1;
	@Before
	public void setUp() {
		Verificacion verifMocked = mock(Verificacion.class);
		Muestra muestraMocked = mock(Muestra.class);
		when(verifMocked.getFecha()).thenReturn(new Date());
		when(muestraMocked.getFechaCaptura()).thenReturn(new Date());
		this.usuario1 = new Usuario("Usuno");
		this.usuario1.agregarVerificacion(verifMocked);
		this.usuario1.agregarMuestras(muestraMocked);
	}
	

	@Test
	public void testUsuario_getAlias() {
		assertEquals("Usuno", this.usuario1.getAlias());
	}
	@Test
	public void testUsuario_muestrasDelMes() {
		assertEquals(1, this.usuario1.muestrasDelMes());
	}
	@Test
	public void testUsio_verificacionesDelMes() {
		assertEquals(1, this.usuario1.verificacionesDelMes());
	}
	@Test
	public void testUsuario_getNivel_BASICO() {
		assertEquals(NivelUsuario.BASICO, this.usuario1.getNivel());
	}
	@Test
	public void testUsuario_getNivel_EXPERTO() {
		for (int i=0; i<30; i++) {
			
			Muestra mockedMuestra = mock(Muestra.class);
			when(mockedMuestra.getFechaCaptura()).thenReturn(new Date());
			Verificacion mockedVerificacion = mock(Verificacion.class);
			when(mockedVerificacion.getFecha()).thenReturn(new Date());
			
			this.usuario1.agregarVerificacion(mockedVerificacion);
			this.usuario1.agregarMuestras(mockedMuestra);
			
		}
		assertEquals(NivelUsuario.EXPERTO, this.usuario1.getNivel());
	}
	@Test
	public void testUsuario_agregarVerificacion() {
		Verificacion newVerif = mock(Verificacion.class);
		when(newVerif.getFecha()).thenReturn(new Date());
		this.usuario1.agregarVerificacion(newVerif);
		assertEquals(2, this.usuario1.verificacionesDelMes());
	}
	@Test
	public void testUsuario_agregarMuestra() {
		Muestra newMuestra = mock(Muestra.class);
		when(newMuestra.getFechaCaptura()).thenReturn(new Date());
		this.usuario1.agregarMuestras(newMuestra);
		assertEquals(2, this.usuario1.muestrasDelMes());
	}
}
	
}
