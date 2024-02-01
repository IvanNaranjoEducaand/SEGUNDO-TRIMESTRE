package tarea1.instrumento;

public abstract class Instrumento {
	protected final int MAX_NOTAS = 100;
	protected int[] notas;
	
	public Instrumento() {
		this.notas = new int[MAX_NOTAS];
	}
	
	public abstract void interpretar();
	
	public void add() {
		int i=0;
		while((this.notas[i]!=0)&&(i<this.notas.length)) {
			i++;
		}
		this.notas[i]= (int) (Math.random()*8) + 1;
	};
}
