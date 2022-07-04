package funcionalidadExterna;

import organizacion.Organizacion;
import organizacion.ZonaDeCobertura;
import Muestra.Muestra;


public interface FuncionalidadExterna {
	public void nuevoEvento (Organizacion organizacion, ZonaDeCobertura zona, Muestra muestra);
}
