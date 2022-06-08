package Muestra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Opinion.Opinion;
import ClasesVacias.Ubicacion;

public class Muestra {
	
	private String vinchucaEncontrada; // por ahora es un string, quizas evolucione a objeto
	private String fotografiaVinchucaEncontrada; // por ahora es un string, quizas evolucione a objeto
	private Ubicacion ubicacion; // se utiliza una clase vacia solo para hacer test
	private Integer ID_Muestra;
	private ArrayList<Opinion> Opiniones;
	private Integer ranking; 
	private String resultadoActual; 
	
public Muestra(String vinchuca, String foto, Ubicacion ubic, Integer id, Integer id_usuario, String rango_usuario) {
		
		this.setVinchucaEncontrada(vinchuca);
		this.setFotografiaVinchucaEncontrada(vinchuca);
		this.setUbicacion(ubic);
		this.setID_Muestra(id);
		this.setOpiniones(new ArrayList<Opinion>());
		
		Calendar calendar = Calendar.getInstance();
		Date hoy = calendar.getTime();
		Opinion opinion = new Opinion(id_usuario, vinchuca, hoy, rango_usuario);
		
		this.agregarOpinion(opinion);
		this.setResultadoActual(this.calcularResultadoActual());
	}



	private String calcularResultadoActual() {
		// se debe recorrer la lista de opiniones y guardar los resultados mas votados
	return null;
	}

	private void agregarOpinion(Opinion opinion) {
		this.getOpiniones().add(opinion);
	
	}



	//GETTERS y SETTERS
	
	private ArrayList<Opinion> getOpiniones() {
	return Opiniones;
	}
	
	private void setOpiniones(ArrayList<Opinion> opiniones) {
		Opiniones = opiniones;
	}
	
	private Integer getRanking() {
		return ranking;
	}
	
	private void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	private String getResultadoActual() {
		return resultadoActual;
	}
	
	private void setResultadoActual(String resultadoActual) {
		this.resultadoActual = resultadoActual;
	}

	private String getVinchucaEncontrada() {
		return vinchucaEncontrada;
	}

	private void setVinchucaEncontrada(String vinchucaEncontrada) {
		this.vinchucaEncontrada = vinchucaEncontrada;
	}

	private String getFotografiaVinchucaEncontrada() {
		return fotografiaVinchucaEncontrada;
	}

	private void setFotografiaVinchucaEncontrada(String fotografiaVinchucaEncontrada) {
		this.fotografiaVinchucaEncontrada = fotografiaVinchucaEncontrada;
	}

	private Ubicacion getUbicacion() {
		return ubicacion;
	}

	private void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	private Integer getID_Muestra() {
		return ID_Muestra;
	}

	private void setID_Muestra(Integer iD_Muestra) {
		ID_Muestra = iD_Muestra;
	}

}
