package tmPkBiotech.tmPkProterozoico;

import tmPkBiotech.tmnPkFanerozico.tmReptil;

public class tmTurtles extends tmPkBiotech.tmnPkFanerozico.tmReptil {
	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
    
	@Override
	public String comer() {
		return "La tortuga está comiendo vegetales.";
	}
}
