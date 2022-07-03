package ubicacionTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ubicacion.Ubicacion;

public class UbicacionTest {
	
	// SUT
	Ubicacion ubicacion;
	Ubicacion ubicacion2;
	
	@Before
	public void setUp() throws Exception {
		ubicacion = new Ubicacion(1, 1);
		ubicacion2 = new Ubicacion (100, 100);
	}
	
	@Test
	public void latitudTest() {
		//Exercise
		float latObtenida = ubicacion.getLatitud();
		
		//Verify
		assertEquals(1, latObtenida, 0);
	}
	
	@Test
	public void longitudTest() {
		//Exercise
		float longObtenida = ubicacion.getLongitud();
		
		//Verify
		assertEquals(1, longObtenida, 0);
	}
	
	@Test
	public void setLatitudTest() {
		//Exercise
		ubicacion.setLatitud(1);
		
		//Verify
		float latObtenida = ubicacion.getLatitud();
		assertEquals(1, latObtenida, 0);
	}
	
	@Test
	public void setLongitudTest() {
		//Exercise
		ubicacion.setLongitud(1);
		
		//Verify
		float longObtenida = ubicacion.getLongitud();
		assertEquals(1, longObtenida, 0);
	}
	
	@Test
	public void distanciaTest() {
		//Exercise
		float distanciaObtenida = ubicacion.distancia(ubicacion2);
		
		//Verify
		
		assertEquals(9724, distanciaObtenida, 3);
	}
	
	@Test
	public void sinUbicacionesEnRangoTest() {
		//Exercise
		Ubicacion miUbicacion = new Ubicacion(43, 72);
		List<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		ubicaciones.add(ubicacion);
		ubicaciones.add(ubicacion2);
		
		
		//Verify
		List<Ubicacion> ubicacionesEnRango = miUbicacion.ubicacionesAMenosDe(ubicaciones, 0);
		assertEquals(0, ubicacionesEnRango.size());
	}
	
	@Test
	public void conUbicacionesEnRangoTest() {
		//Exercise
		Ubicacion miUbicacion = new Ubicacion(43, 72);
		List<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		ubicaciones.add(ubicacion);
		ubicaciones.add(ubicacion2);
		
		
		//Verify
		List<Ubicacion> ubicacionesEnRango = miUbicacion.ubicacionesAMenosDe(ubicaciones, 10000);
		assertEquals(2, ubicacionesEnRango.size());
	}
}
