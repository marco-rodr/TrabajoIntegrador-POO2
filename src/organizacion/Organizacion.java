package organizacion;

import ubicacion.Ubicacion;

public class Organizacion {
	private String TipoDeOrganizacion;
	private Ubicacion ubicacion;
	private int trabajadores;
	
	public Organizacion(Ubicacion locacion, int cantidadDeTrabajadores) {
		this.setUbicacion(locacion);
		this.setTrabajadores(cantidadDeTrabajadores);
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(Ubicacion locacion) {
		this.ubicacion = locacion;
	}
	
	public String getTipoDeOrganizacion() {
		return TipoDeOrganizacion;
	}

	public void setTipoDeOrganizacion(String tipoDeOrganizacion) {
		TipoDeOrganizacion = tipoDeOrganizacion;
	}

	public int getCantidadDeTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(int cantidadDeTrabajadores) {
		this.trabajadores = cantidadDeTrabajadores;
	}
	
	
}
