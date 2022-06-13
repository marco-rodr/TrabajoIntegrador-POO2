package zonaCoberturaTest;

import static org.junit.Assert.*;

import zonaCobertura.ZonaDeCobertura;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ZonaDeCoberturaTest {
	//SUT
	ZonaDeCobertura zona;
	ZonaDeCobertura zona2;
	
	@Before
	public void setUp() throws Exception {
		zona = new ZonaDeCobertura("Varela", 4, 67, 1500);
		zona2 = new ZonaDeCobertura("Quilmes", 17, 52, 2500);
	}
	
	@Test
	public void setNombreTest() {
		//Exercise
		zona.setNombre("Bernal");
		
		//Verify
		assertSame(zona.getNombre(), "Bernal");
	}
	/*
	@Test
	public void setEpicentroTest() {
		//Exercise
		zona2.setEpicentro(4, 67);
		
		//Verify
		assert
	}*/
}
