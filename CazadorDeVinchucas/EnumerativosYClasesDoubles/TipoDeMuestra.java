package EnumerativosYClasesDoubles;

public enum TipoDeMuestra {
	
	// las primeras 3 son vinchucas
	Infestans, Sordida, Guasayana, Chinche_Foliada, Phtia_Chinche, Ninguna, Imagen_poco_clara;

	public boolean esVinchuca() {
		
		return (this == Infestans || this == Sordida || this == Guasayana);
	}
	
	public boolean esInfestans() {
		
		return (this == Infestans);
	}
	
	public boolean esSordida() {
		
		return (this == Sordida);
	}
	
	public boolean esGuasayana() {
		
		return (this == Guasayana);
	}
	
	public boolean esChinche_Foliada() {
		
		return (this == Chinche_Foliada);
	}
	
	public boolean esPhtia_Chinche() {
		
		return (this == Phtia_Chinche);
	}
	
	public boolean esNinguna() {
		
		return (this == Ninguna);
	}
	
	public boolean imagen_poco_clara() {
		
		return (this == Imagen_poco_clara);
	}
	
}
