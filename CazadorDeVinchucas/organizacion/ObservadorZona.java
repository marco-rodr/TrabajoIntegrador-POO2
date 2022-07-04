package organizacion;

import Muestra.Muestra;

public interface ObservadorZona {
		public void muestraSubida(ZonaDeCobertura zona, Muestra muestra);
		public void muestraVerificada(ZonaDeCobertura zona, Muestra muestra);		
}
