package tarea1;

public class Sintonizador {
	private final int minMHz = 80;
	private final int maxMHz = 180;
	private float frecuencia;
	
	Sintonizador(){
		this.setFrecuencia(80);
	}

	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}

	public float up() {
		
		if(this.frecuencia < maxMHz) {
			this.frecuencia = (float) (frecuencia + 0.5); 
		} else {
			this.frecuencia = 80;
		}
		
		return frecuencia;
	}
	
	public float down() {
		
		if(this.frecuencia > minMHz) {
			this.frecuencia = (float) (frecuencia - 0.5); 
		} else {
			this.frecuencia = 180;
		}
		
		return frecuencia;
	}

	public float display() {
		return frecuencia;
	}
}
