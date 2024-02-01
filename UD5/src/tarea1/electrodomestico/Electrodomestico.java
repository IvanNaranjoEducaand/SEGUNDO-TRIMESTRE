package tarea1.electrodomestico;

public class Electrodomestico {
	protected int precioBase;
	public enum color{Blanco, Rojo, Negro, Azul, Gris;}
	public enum consumo{A, B, C, D, E, F;}
	protected int peso;
	protected color color;
	protected consumo consumo;
	
	public Electrodomestico() { //Contructor con todos los valores por defecto.
		this.precioBase = 100;
		this.color = color.Blanco;
		this.consumo = consumo.F;
		this.peso = 5;
	}
	
	public Electrodomestico(int precio, int peso) { //Constructor con precio y peso.
		this.peso = peso;
		this.precioBase = precio;
		this.consumo = consumo.F;
		this.color = color.Blanco;
	}
	
	public Electrodomestico(int precio, color color, consumo consumo, int peso) {
		this.peso = peso;
		this.precioBase = precio;
		this.consumo = consumo;
		this.color = color;
	}
	
	public color getColor() {
		return this.color;
	}
	
	public consumo getConsumo() {
		return this.consumo;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public int getPrecio() {
		return this.precioBase;
	}
	
	public int precioTotal() {
		int total = this.precioBase;
		
		switch (consumo) { //Añadir precio según consumo
			case A:
				total += 100;
				break;
				
			case B:
				total += 100;
				break;
				
			case C:
				total += 100;
				break;
				
			case D:
				total += 100;
				break;
				
			case E:
				total += 100;
				break;
				
			case F:
				total += 100;
				break;
		}
		
		if(this.peso >= 0 && this.peso <= 29) { //Añadir precio según peso
			total += 10;
		} else if (this.peso >= 30 && this.peso <= 49){
			total += 60;
		} else if (this.peso >= 50 && this.peso <= 79){
			total += 80;
		} else if (this.peso >= 80){
			total += 100;
		}
		
		return total;
	}

	public String toString() {
		String cadenaTotal = "PRECIO BASE: "+this.precioBase+"€ CONSUMO: "+this.consumo+" COLOR: "+this.color+" PESO: "+this.peso+"Kg"+" TOTAL: "+this.precioTotal()+"€";
		return cadenaTotal;
	}
}

