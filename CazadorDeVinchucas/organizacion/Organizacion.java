package organizacion;

import java.util.List;

import ubicacion.Ubicacion;
import zonaCobertura.ZonaDeCobertura;

public class Organizacion {
	private TipoDeOrganizacion tipo;
	private Ubicacion ubicacion;
	private int trabajadores;
	private List<ZonaDeCobertura> zonasDeCobertura;
	
	public Organizacion(Ubicacion locacion, int cantidadDeTrabajadores, List<ZonaDeCobertura> zonas) {
		this.setUbicacion(locacion);
		this.setTrabajadores(cantidadDeTrabajadores);
		this.setZonasDeCobertura(zonas);
	}
	
	public TipoDeOrganizacion getTipoDeOrganizacion() {
		return tipo;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(Ubicacion locacion) {
		this.ubicacion = locacion;
	}

	public int getCantidadDeTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(int cantidadDeTrabajadores) {
		this.trabajadores = cantidadDeTrabajadores;
	}

	public List<ZonaDeCobertura> getZonasDeCobertura() {
		return zonasDeCobertura;
	}

	public void setZonasDeCobertura(List<ZonaDeCobertura> zonas) {
		this.zonasDeCobertura = zonas;
	}
	
	public void agregarZona(ZonaDeCobertura zona) {
		this.zonasDeCobertura.add(zona);
	}
	
	public void sacarZona(ZonaDeCobertura zona) {
		this.zonasDeCobertura.remove(zona);
	}
	
}
