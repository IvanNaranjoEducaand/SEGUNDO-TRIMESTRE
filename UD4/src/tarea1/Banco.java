package tarea1;

public class Banco {
	private String nombre;
	private int capital;
	private String direccionCentral;
	
	Banco(final String nombre, String direccionCentral){
		this.setNombre(nombre);
		this.setDireccionCentral(direccionCentral);
		this.setCapital(5200000);
	}

	public String getDireccionCentral() {
		return direccionCentral;
	}

	public void setDireccionCentral(String direccionCentral) {
		this.direccionCentral = direccionCentral;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
