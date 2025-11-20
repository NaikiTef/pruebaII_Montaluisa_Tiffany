package tmPkBiotech.tmnPkFanerozico;

public class tmTurtles extends tmReptil {
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
