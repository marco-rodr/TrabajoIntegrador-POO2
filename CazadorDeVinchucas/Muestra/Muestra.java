package Muestra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Opinion.Opinion;
import ClasesVacias.Ranking;
import ClasesVacias.TipoDeMuestra;
import ClasesVacias.Ubicacion;

public class Muestra {
	
	private TipoDeMuestra vinchucaEncontrada; // por ahora es un string, quizas evolucione a objeto
	private String fotografiaVinchucaEncontrada; // por ahora es un string, quizas evolucione a objeto
	private Ubicacion ubicacion; // se utiliza una clase vacia solo para hacer test
	private Date fechaCreacion;
	private Integer ID_Muestra;
	private ArrayList<Opinion> Opiniones;
	private Ranking ranking;
	private String resultadoActual; 
	private Integer ID_Usuario;
	
	public Muestra(TipoDeMuestra vinchuca, String foto, Ubicacion ubic, Integer id, Integer id_usuario, String rango_usuario) {
		
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
		this.setResultadoActual(this.calcularResultadoActual());
		this.setFechaCreacion(hoy);
		this.setRanking(this.calcularRanking());
	}





	private Ranking calcularRanking() {
		// Se debe evaluar quienes hicieron las opiniones, si solo las hicieron usuario basicos es basica, si algun experto opino es experto a menos q al menos 2 expertos hayan coincidido
		for
	}

	private String calcularResultadoActual() {
		// se debe recorrer la lista de opiniones y guardar los resultados mas votados
	return null;
	}

	public void agregarOpinion(Opinion opinion) { // METODO LANZADO POR EL USUARIO
		if (true) { // hay que verificar que la publicacion no este validada (ranking), que el usuario no haya ya opinado, y si solo esta abierta a expertos entonces debe verificar el rango del usuario
			this.getOpiniones().add(opinion);
		}
	}



	//GETTERS y SETTERS
	
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
	
	private Ranking getRanking() {
		return ranking; }
	
	private void setRanking(Ranking ranking) {
		this.ranking = ranking; }
	
	private String getResultadoActual() {
		return resultadoActual; }
	
	private void setResultadoActual(String resultadoActual) {
		this.resultadoActual = resultadoActual; }

	private TipoDeMuestra getVinchucaEncontrada() {
		return vinchucaEncontrada; }

	private void setVinchucaEncontrada(TipoDeMuestra vinchucaEncontrada) {
		this.vinchucaEncontrada = vinchucaEncontrada; }

	private String getFotografiaVinchucaEncontrada() {
		return fotografiaVinchucaEncontrada; }

	private void setFotografiaVinchucaEncontrada(String fotografiaVinchucaEncontrada) {
		this.fotografiaVinchucaEncontrada = fotografiaVinchucaEncontrada; }

	private Ubicacion getUbicacion() {
		return ubicacion; }

	private void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion; }

	private Integer getID_Muestra() {
		return ID_Muestra; }

	private void setID_Muestra(Integer iD_Muestra) {
		ID_Muestra = iD_Muestra; }

}
