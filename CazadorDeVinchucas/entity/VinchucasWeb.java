package entity;

import java.util.ArrayList;
import java.util.List;

import EnumerativosYClasesDoubles.Ubicacion;
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
	
	
	/** 
	 * Retorna y almacena una nueva instancia de Usuario
	 * @param alias:String nombre del nuevo usuario
	 * @return Usuario usuario creado.
	 * */
	public Usuario registrarUsuario(String alias) {
		Usuario usuario = new Usuario(alias);
		this.usuarios.add(usuario);
		return usuario;
		
	}
	//public Muestra registrarMuestra(String )
	
	
	/** 
	 * Retorna y almacena una nueva instancia de Organizacion
	
	 * @return Organizacion organizacion creada.
	 * */
	public Object registrarOrganizacion() {
		Object organizacion = new Object(); //El objeto Object se debe cambiar por el objeto Organizacion.
		this.organizaciones.add(organizacion);
		return organizacion;
	}
	
	/** 
	 * Retorna y almacena una nueva instancia de ZonaDeCobertura
	 * @param nombre:String nombre de la zona
	 * @param epicentro:Ubicacion ubicacion donde se encuentra la zona
	 * @param radio:Double que representa el radio de cobertura
	 * @return ZonaDeCobertura zona creada.
	 * */
	public Object registrarZonaDeCobertura(String nombre, Ubicacion epicentro, Double radio) {
		Object zona = new Object(); // se debe agregar ZonaDeCobertura
		this.zona.add(zona);
		return zona;
	}
	
	//Getters y Setters
	public List<Muestra> getMuestras() {
		return muestras;
	}


	public void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public List<Object> getOrganizaciones() {
		return organizaciones;
	}


	public void setOrganizaciones(List<Object> organizaciones) {
		this.organizaciones = organizaciones;
	}


	public List<Object> getZona() {
		return zona;
	}


	public void setZona(List<Object> zona) {
		this.zona = zona;
	}
	
	
	
}