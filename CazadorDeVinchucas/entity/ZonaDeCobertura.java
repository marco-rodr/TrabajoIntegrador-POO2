package zonaCobertura;


public class ZonaDeCobertura {
	private String nombre;
	private Ubicacion epicentro;
	private float radio;
	
	public ZonaDeCobertura(String nombre, float latitud, float longitud, float radio) {
		this.setNombre(nombre);
		this.setEpicentro(latitud, longitud);
		this.setRadio(radio);
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
	
	public boolean seSolapan(ZonaDeCobertura zona) {
		return (this.radio + zona.radio >= 
				this.getEpicentro().distancia(zona.getEpicentro()));
	}
	
}
