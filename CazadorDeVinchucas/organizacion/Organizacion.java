package organizacion;

import java.util.List;

import Muestra.Muestra;
import ubicacion.Ubicacion;
import funcionalidadExterna.FuncionalidadExterna;

public class Organizacion implements ObservadorZona {
	private TipoDeOrganizacion tipo;
	private Ubicacion ubicacion;
	private int trabajadores;
	private List<ZonaDeCobertura> zonasDeCobertura;
	private FuncionalidadExterna funcionMuestraSubida;
	private FuncionalidadExterna funcionMuestraVerificada;
	
	public Organizacion(Ubicacion locacion, int cantidadDeTrabajadores, List<ZonaDeCobertura> zonas) {
		this.setUbicacion(locacion);
		this.setTrabajadores(cantidadDeTrabajadores);
		this.zonasDeCobertura = zonas;
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
	
	public void agregarZona(ZonaDeCobertura zona) {
		this.zonasDeCobertura.add(zona);
		zona.agregarObservador(this);
	}
	
	public void sacarZona(ZonaDeCobertura zona) {
		this.zonasDeCobertura.remove(zona);
		zona.sacarObservador(this);
	}

	@Override
	public void muestraSubida (ZonaDeCobertura zona, Muestra muestra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void muestraVerificada(ZonaDeCobertura zona, Muestra muestra) {
		// TODO Auto-generated method stub
		
	}
	
}
