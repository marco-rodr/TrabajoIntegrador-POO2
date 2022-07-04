package organizacion;

import java.util.ArrayList;
import java.util.List;

import ubicacion.Ubicacion;

public class ZonaDeCobertura {
	private String nombre;
	private Ubicacion epicentro;
	private float radio;
	private List<ObservadorZona> observadores;
	
	public ZonaDeCobertura(String nombre, float latitud, float longitud, float radio) {
		this.setNombre(nombre);
		this.setEpicentro(latitud, longitud);
		this.setRadio(radio);
		this.observadores = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ubicacion getEpicentro() {
		return epicentro;
	}
	public void setEpicentro(float latitud, float longitud) {
		this.epicentro = new Ubicacion(latitud, longitud);
	}
		public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public List<ObservadorZona> getObservadores() {
		return observadores;
	}
	public void setObservadores(List<ObservadorZona> observadores) {
		this.observadores = observadores;
	}
	
	public void agregarObservador(ObservadorZona observador) {
		this.observadores.add(observador);
	}
	
	public void sacarObservador(ObservadorZona observador) {
		this.observadores.remove(observador);
	}
	
	public boolean seSolapan(ZonaDeCobertura zona) {
		return (this.radio + zona.radio >= 
				this.getEpicentro().distancia(zona.getEpicentro()));
	}
	
}
