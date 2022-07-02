package entity;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import Muestra.Muestra;

public class Usuario {
	
	protected String alias;
	private List<Verificacion> verificaciones;
	private List<Muestra> muestras;
	
	
	public Usuario(List<Verificacion> verificaciones, List<Muestra> muestras, String alias) {
		super();
		this.alias = alias;
		this.verificaciones = verificaciones;
		this.muestras = muestras;
	}

	public int muestrasDelMes() {
		int cant = 0;
		Date hoy = new Date();
		for (Muestra m : this.muestras) {
			if (true) { //se debe agregar un Utils para manejar el tema de las fechas.
				cant++;
			}	
		}
		return cant;
	}
	public int verificacionesDelMes() {
		int cant = 0;
		Date hoy = new Date();
		for (Verificacion v : this.verificaciones) {
			if(true) {
			cant++;
			}
		}
		return  cant;
	}
	
	public NivelUsuario getNivel() {
		NivelUsuario nivel = null;
		if (this.muestrasDelMes() >= 10 && this.verificacionesDelMes() >= 20) {
			nivel = nivel.EXPERTO;
		}
		else {
			nivel = nivel.BASICO;
		}
		return nivel;
	}
	
	public void agregarVerificacion(Verificacion verificacion) {
		this.verificaciones.add(verificacion);
	}
	
	public void agregarMuestras(Muestra muestra) {
		this.muestras.add(muestra);
		
	}
	// Getters y Setters.
	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public List<Verificacion> getVerificaciones() {
		return verificaciones;
	}


	public void setVerificaciones(List<Verificacion> verificaciones) {
		this.verificaciones = verificaciones;
	}


	public List<Muestra> getMuestras() {
		return muestras;
	}


	public void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}

	
	
}
