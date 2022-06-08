package ClasesVacias;

public enum Ranking {

	BASICO, EXPERTO, VALIDADO;

	public boolean rankingBasico() {
		
		if (this == BASICO) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean rankingExperto() {
		
		if (this == EXPERTO) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean rankingValidado() {
		
		if (this == VALIDADO) {
			return true;
		} else {
			return false;
		}
	}
	
}
