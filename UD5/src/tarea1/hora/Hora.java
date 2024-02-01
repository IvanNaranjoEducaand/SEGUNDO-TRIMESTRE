package tarea1.hora;

public class Hora {
	protected int hora;
	protected int minutos;
	
	public Hora(int hora, int minutos){
		this.SetHora(hora);
		this.SetMinutos(minutos);
	}
	
	public void inc(){
		if(this.minutos == 59) {
			this.minutos = 0;
			this.hora = this.hora + 1;
		} else {
			this.minutos = this.minutos + 1;
		}
	}
	
	public void SetMinutos(int minutos) {
		if(minutos < 0 || minutos > 59) {
			this.minutos = 0;
		} else {
			this.minutos = minutos;
		}
	}
	
	public void SetHora(int hora) {
		if(hora < 0 || hora > 23) {
			this.hora = 0;
		} else {
			this.hora = hora;
		}
	}
	
	public String toString() {
		String HoraAString;
		String MinAString;
		
		if(this.hora < 10) {
			HoraAString = "0"+Integer.toString(hora);	
		} else {
			HoraAString = Integer.toString(hora);
		}
		
		if(this.minutos < 10) {
			MinAString = "0"+Integer.toString(minutos);	
		} else {
			MinAString = Integer.toString(minutos);
		}
		
		
		String Resultado = HoraAString+":"+MinAString;
		return Resultado;
	}
}