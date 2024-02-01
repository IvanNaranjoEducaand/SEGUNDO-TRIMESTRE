package tarea1.hora;

public class Hora12 extends Hora{
	boolean tarde;
	
	public Hora12(int hora, int minutos) {
		super(hora, minutos);
	}
	
	public void CambioHora() {
		if (this.hora > 12) {
			this.tarde = true;
			this.hora = this.hora -12;
		} else {
			this.tarde = false;
		}
	}
	
	public String toString() {
		String HoraAString;
		String MinAString;
		String Resultado;
		
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
		
		if(this.tarde == true) {
			Resultado = HoraAString+":"+MinAString+" PM";	
		} else{
			Resultado = HoraAString+":"+MinAString +" AM";
		}
		
		return Resultado;
		
	}
	
	
}
