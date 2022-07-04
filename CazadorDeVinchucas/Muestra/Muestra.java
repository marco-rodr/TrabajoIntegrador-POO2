package Muestra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import EnumerativosYClasesDoubles.Ranking;
import EnumerativosYClasesDoubles.TipoDeMuestra;

import Opinion.Opinion;
import entity.Ubicacion;

public class Muestra {
	
	private TipoDeMuestra vinchucaEncontrada; // colaborador inutil
	private String fotografiaVinchucaEncontrada; // colaborador inutil
	private Ubicacion ubicacion;
	private Date fechaCreacion;
	private Integer ID_Muestra;
	private ArrayList<Opinion> Opiniones;
	// private Ranking ranking;
	// private TipoDeMuestra resultadoActual; 
	private Integer ID_Usuario;
	
	// CONSTRUCTOR
	
	public Muestra(TipoDeMuestra vinchuca, String foto, Ubicacion ubic, Integer id, Integer id_usuario, Ranking rango_usuario) {
		
		this.setVinchucaEncontrada(vinchuca);
		this.setFotografiaVinchucaEncontrada("foto");
		this.setUbicacion(ubic); 
		this.setID_Muestra(id); 
		this.setOpiniones(new ArrayList<Opinion>()); 
		this.setID_Usuario(id_usuario);
		
		Calendar calendar = Calendar.getInstance();
		Date hoy = calendar.getTime();
		Opinion opinion = new Opinion(id_usuario, vinchuca, hoy, rango_usuario);
		
		this.agregarOpinion(opinion);
		this.setFechaCreacion(hoy);
		
	}



	// METODOS PUBLICOS
	
	public boolean agregarOpinionSiEsPosible(Opinion opinion) { // METODO LANZADO POR EL USUARIO
		
		if (this.elUsuarioYaOpino(opinion.id_usuario()) || this.rankingValidado() ) {  // si el usuario ya opino o la muestra esta verificada la opinion se rechaza y se devuelve un false
			return (false);
		} else if (this.rankingExperto() && opinion.ranking().rankingExperto()) {      // si la muestra solo acepta opiniones expertas y el usuario es experto se agrega y retorna true
			this.agregarOpinion(opinion);
			return (true);
		} else if (this.rankingBasico()) { 											   // si la muestra acepta opiniones basicas entonces se agrega directamente sin verificar ranking del usuario
			this.agregarOpinion(opinion);
			return (true);
		} else { 																	   // esta caso se ejecuta si la muestra requiere opiniones expertas y el usuario no lo es						
			return (false);
		}
	}


	public TipoDeMuestra resultadoActual() {
		
		Map<TipoDeMuestra, Integer> options = this.mapaDeOpiniones();
		TipoDeMuestra resultadoActual = TipoDeMuestra.Ninguna;
		
		for (Map.Entry<TipoDeMuestra, Integer> option : options.entrySet()) {
			if (option.getValue() > options.get(resultadoActual)) {
				resultadoActual = option.getKey();
			}
		}
		return (resultadoActual);
	}
	
	public ArrayList<Opinion> listaDeOpiniones() {
		return (this.getOpiniones());
	}
	
	public Ubicacion ubicacion() {
		return (this.getUbicacion());
	}
	
	public boolean rankingBasico() {
		return (this.calcularRanking().rankingBasico());
	}

	public boolean rankingExperto() {
		return (this.calcularRanking().rankingExperto());
	}
	
	public boolean rankingValidado() {
		return (this.calcularRanking().rankingValidado());
	}
	
	public Integer id_usuario() {
		return (this.getID_Usuario());
	}
	
	public Integer id_muestra() {
		return (this.getID_Muestra());
	}
	
	public Date fechaDeCreacion() {
		return (this.getFechaCreacion());
	}
	
	
	// METODOS PRIVADOS
	

	private boolean elUsuarioYaOpino(Integer id_usuario) {
		
		ArrayList<Opinion> opiniones = new ArrayList<Opinion>();
		boolean yaOpino = false;
		
		for (Opinion opinion : opiniones) {
			if (opinion.id_usuario() == id_usuario) {
				yaOpino = true;
			}
		}
		
		return yaOpino;
	}
	
	private Ranking calcularRanking() {

		Ranking ranking = Ranking.BASICO;
		Map<TipoDeMuestra, Integer> options = this.mapaDeOpiniones();
		
		for (Map.Entry<TipoDeMuestra, Integer> option : options.entrySet()) {
			if (option.getValue() == 1) {
				ranking = Ranking.EXPERTO;
			} else if (option.getValue() == 2) {
				ranking = Ranking.VALIDADO;
				break;
			}
		}
		return ranking;
	}

	private Map<TipoDeMuestra, Integer> mapaDeOpiniones() {
		
		Integer infestans = 0;
		Integer sordida = 0;
		Integer guasayana = 0;
		Integer chinche_Foliada = 0;
		Integer phtia_Chinche = 0;
		Integer ninguna = 0;
		Integer imagen_poco_clara = 0;
		
		for (Opinion opinion : this.getOpiniones()) {
			if (opinion.ranking().rankingExperto()) {
				if (opinion.tipoDeOpinion().esInfestans()) {
					infestans = infestans + 1;
				} else if (opinion.tipoDeOpinion().esSordida()) {
					sordida = sordida + 1;
				} else if (opinion.tipoDeOpinion().esGuasayana()) {
					guasayana = guasayana + 1;
				} else if (opinion.tipoDeOpinion().esChinche_Foliada()) {
					chinche_Foliada = chinche_Foliada + 1;
				} else if (opinion.tipoDeOpinion().esPhtia_Chinche()) {
					phtia_Chinche = phtia_Chinche + 1;
				} else if (opinion.tipoDeOpinion().esNinguna()) {
					ninguna = ninguna + 1;
				} else if (opinion.tipoDeOpinion().imagen_poco_clara()) {
					imagen_poco_clara = imagen_poco_clara + 1;
				}
			}
		}
		
		Map<TipoDeMuestra, Integer> options = new HashMap<TipoDeMuestra, Integer>();
		options.put(TipoDeMuestra.Infestans, infestans);
		options.put(TipoDeMuestra.Sordida, sordida);
		options.put(TipoDeMuestra.Guasayana, guasayana);
		options.put(TipoDeMuestra.Chinche_Foliada, chinche_Foliada);
		options.put(TipoDeMuestra.Phtia_Chinche, phtia_Chinche);
		options.put(TipoDeMuestra.Ninguna, ninguna);
		options.put(TipoDeMuestra.Imagen_poco_clara, imagen_poco_clara);
		
		return options;
	}

	private void agregarOpinion(Opinion opinion) {
		this.getOpiniones().add(opinion);
	}


	// GETTERS y SETTERS
	
	private Date getFechaCreacion() {
		return fechaCreacion; }

	private void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion; }

	private Integer getID_Usuario() {
		return ID_Usuario; }
	
	private void setID_Usuario(Integer id_usuario) {
		this.ID_Usuario = id_usuario; }
	
	private ArrayList<Opinion> getOpiniones() {
	return Opiniones; }
	
	private void setOpiniones(ArrayList<Opinion> opiniones) {
		Opiniones = opiniones; }

	private TipoDeMuestra getVinchucaEncontrada() {
		return vinchucaEncontrada; }

	private void setVinchucaEncontrada(TipoDeMuestra vinchucaEncontrada) {
		this.vinchucaEncontrada = vinchucaEncontrada; }

	private String getFotografiaVinchucaEncontrada() {
		return fotografiaVinchucaEncontrada; }

	private void setFotografiaVinchucaEncontrada(String fotografiaVinchucaEncontrada) {
		this.fotografiaVinchucaEncontrada = fotografiaVinchucaEncontrada; }

	public Ubicacion getUbicacion() {
		return ubicacion; }

	private void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion; }

	private Integer getID_Muestra() {
		return ID_Muestra; }

	private void setID_Muestra(Integer iD_Muestra) {
		ID_Muestra = iD_Muestra; }

}
