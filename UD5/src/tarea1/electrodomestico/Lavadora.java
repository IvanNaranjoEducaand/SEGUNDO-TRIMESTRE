package tarea1.electrodomestico;

public class Lavadora extends Electrodomestico {
	protected int carga;
	
	//CONSTRUCTORES
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = 5;
	}
	
	public Lavadora(int precio, int peso, color color, consumo consumo, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	
	//GETTER DEL ATRIBUTO CARGA
	public int getCarga() {
		return this.carga;
	}
	
	@Override
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
		
		if(this.carga > 30) { //Añadir precio según carga
			total+=50;
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		String cadenaCompleta = "PRECIO BASE: "+this.precioBase+"€ CONSUMO: "+this.consumo+" COLOR: "+this.color+" PESO: "+this.peso+"Kg"+" CARGA: "+this.carga+"Kg"+" TOTAL: "+this.precioTotal()+"€";
		return cadenaCompleta ;
		
	}
}
