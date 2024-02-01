package tarea1.instrumento;

public class Campana extends Instrumento {
	public Campana() {
		super();
	}
	
	@Override
	public void interpretar() {
		int i = 0;
		while((this.notas[i]!=0)&&(i<this.notas.length)) {
			System.out.print(this.notas[i]+" ");
			i++;
		}
	}

}
