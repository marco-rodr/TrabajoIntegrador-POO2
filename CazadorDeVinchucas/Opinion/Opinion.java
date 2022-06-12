package Opinion;

import java.util.Date;

import EnumerativosYClasesDoubles.Ranking;
import EnumerativosYClasesDoubles.TipoDeMuestra;

public class Opinion {
	
	private Integer id_usuario;
	private TipoDeMuestra tipoDeOpinion;
	private Date fechaDeOpinion;
	private Ranking ranking;
	
	// CONSTRUCTOR

	public Opinion(Integer id_usuario, TipoDeMuestra tipoDeOpinion, Date hoy, Ranking ranking_usuario) {
		
		this.setFechaDeOpinion(hoy);
		this.setId_usuario(id_usuario);
		this.setRanking(ranking_usuario);
		this.setTipoDeOpinion(tipoDeOpinion);
		
	}
	
	
	// METODOS PUBLICOS
	
	public Integer id_usuario() {
		return (this.getId_usuario());
	}

	public Ranking ranking() {
		return (this.getRanking());
	}

	public TipoDeMuestra tipoDeOpinion() {
		return (this.getTipoDeOpinion());
	}
	
	public Date fechaDeOpinion() {
		return (this.getFechaDeOpinion());
	}
	
	
	// METODOS PRIVADOS

	private Integer getId_usuario() {
		return id_usuario;
	}

	private void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	private TipoDeMuestra getTipoDeOpinion() {
		return tipoDeOpinion;
	}

	private void setTipoDeOpinion(TipoDeMuestra tipoDeOpinion) {
		this.tipoDeOpinion = tipoDeOpinion;
	}

	private Date getFechaDeOpinion() {
		return fechaDeOpinion;
	}

	private void setFechaDeOpinion(Date fechaDeOpinion) {
		this.fechaDeOpinion = fechaDeOpinion;
	}

	private Ranking getRanking() {
		return ranking;
	}

	private void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}



}
