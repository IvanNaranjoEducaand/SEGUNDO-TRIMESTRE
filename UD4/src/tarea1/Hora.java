package tarea1;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	Hora(int hora, int minutos, int segundos){
		this.setHora(hora);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}
	
	public void sumaHora(int hora, int minutos, int segundos) {
		int totalSegundos = this.hora * 3600 + this.minutos * 60 + this.segundos;
        int horaFinal = (totalSegundos / 3600) % 24;
        int minutosFinal = (totalSegundos % 3600) / 60;
		
		System.out.println("La hora final es: "+horaFinal+":"+minutosFinal);
	}
	
    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora no válida. Debe estar entre 0 y 23.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinutos(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minutos = minuto;
        } else {
            System.out.println("Minuto no válido. Debe estar entre 0 y 59.");
        }
    }

    public int getMinuto() {
        return minutos;
    }

    public void setSegundos(int segundo) {
        if (segundo > 0 && segundo < 60) {
            this.segundos = segundo;
        } else {
            System.out.println("Segundo no válido. Debe estar entre 0 y 59.");
        }
    }

    public int getSegundo() {
        return segundos;
    }

	
}
