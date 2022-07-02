package entity;

import java.util.ArrayList;
import java.util.List;

import Muestra.Muestra;

public class VinchucasWeb {
	
	private List<Muestra> muestras;
	private List<Usuario> usuarios;
	private List<Object> organizaciones;
	private List<Object> zona; // zonaDeCoberturas agregar aca.
	
	
	public VinchucasWeb() {
		super();
		this.muestras = new ArrayList<Muestra>();
		this.usuarios = new ArrayList<Usuario>();
		this.organizaciones = new ArrayList<Object>(); //agregar Organizacion
		this.zona = new ArrayList<Object>(); // agregar ZonaDeCobertura
	}
	
	
	
}
