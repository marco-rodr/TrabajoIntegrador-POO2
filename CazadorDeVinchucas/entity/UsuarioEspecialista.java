package entity;

import java.util.List;

import Muestra.Muestra;

public class UsuarioEspecialista extends Usuario {

	public UsuarioEspecialista(List<Verificacion> verificaciones, List<Muestra> muestras, String alias) {
		super(verificaciones, muestras, alias);
		
	}

	@Override
	public NivelUsuario getNivel() {
		
		return super.getNivel();
	}
	
}
