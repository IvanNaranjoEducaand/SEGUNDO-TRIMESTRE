package tarea1.hora;

public class HoraExacta extends Hora{
	int segundos;
	
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.SetSegundos(segundos);
	}
	
	public void SetSegundos(int segundos){
		if(segundos < 0 || segundos > 59) {
			this.segundos = 0;
		} else {
			this.segundos = segundos;
		}
	}
	
	public void inc(){
		if(this.segundos == 59) {
			this.segundos = 0;
			this.minutos = this.minutos + 1;
		} else {
			this.segundos = this.segundos + 1;
		}
	}
	
	public String toString(){
		String HoraAString;
		String MinAString;
		String SegAString;
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
		
		if(this.segundos < 10) {
			SegAString = "0"+Integer.toString(segundos);	
		} else {
			SegAString = Integer.toString(segundos);
		}
		
		
		Resultado = HoraAString+":"+MinAString+":"+SegAString;	
		return Resultado;
	}
	
}
