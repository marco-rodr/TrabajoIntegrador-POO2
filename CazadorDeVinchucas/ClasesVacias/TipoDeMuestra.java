package ClasesVacias;

public enum TipoDeMuestra {
	
	// las primeras 3 son vinchucas
	Infestans, Sordida, Guasayana, Chinche_Foliada, Phtia_Chinche, Ninguna, Imagen_poco_clara;

	public boolean esVinchuca() {
		
		if (this == Infestans || this == Sordida || this == Guasayana) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esInfestans() {
		
		if (this == Infestans) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esSordida() {
		
		if (this == Sordida) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esGuasayana() {
		
		if (this == Guasayana) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esChinche_Foliada() {
		
		if (this == Chinche_Foliada) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esPhtia_Chinche() {
		
		if (this == Phtia_Chinche) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esNinguna() {
		
		if (this == Ninguna) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean imagen_poco_clara() {
		
		if (this == Imagen_poco_clara) {
			return true;
		} else {
			return false;
		}
	}
	
}
