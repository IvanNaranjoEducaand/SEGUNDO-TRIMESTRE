package prueba2;

public abstract class Animal {
	private String nombre;
	private int edad;
	static int vidas = 0;
	
	public abstract void comunicarse();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static void getVidas(){
		System.out.println("Vidas: "+vidas);
	}
}

abstract class Mamifero extends Animal{
	static int vidasMamifero = 0;
	
	public void reproducete(){
		System.out.println("Me estoy reproduciendo como Mamífero");
		vidas++;
		vidasMamifero++;
	}
	
	public static void getVidasMamifero(){
		System.out.println("Vidas de Mamifero: "+vidasMamifero);
	}
}

abstract class Oviparo extends Animal{
	static int vidasOviparo = 0;
	
	public void reproducete(){
		System.out.println("Me estoy reproduciendo como Ovíparo");
		vidas++;
		vidasOviparo++;
	}
	
	public static void getVidasOviparo(){
		System.out.println("Vidas de Oviparo: "+vidasOviparo);
	}	
}

class Perro extends Mamifero{
	private int patas;
	private boolean cola;
	int numeroChip;
	
	Perro(){
		vidas++;
		vidasMamifero++;
	}
	
	public int getPatas() {
	 return patas;	
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public boolean getCola() {
		return cola;
	}
	
	public void setCola(boolean cola) {
		this.cola = cola;
	}
	
	@Override
	public void comunicarse(){
		System.out.println("Guau Guau");
	}
	
	public void olfatear(){
		System.out.println("Snif Snif");
	}
}

class Reptil extends Oviparo {
	
	Reptil(){
		super();
		vidas++;
		vidasOviparo++;
	}

	@Override
	public void comunicarse() {
		
	}
}

class Ave extends Oviparo{
	private int patas;
	private int alas;
	
	Ave(){
		vidas++;
		vidasOviparo++;
	}
	
	public int getPatas() {
		 return patas;	
	}
		
	public void setPatas(int patas) {
			this.patas = patas;
	}
	
	
	public int getAlas() {
		 return alas;	
	}
		
	public void setAlas(int alas) {
			this.alas = alas;
	}
	
	@Override
	public void comunicarse(){
		System.out.println("Pio Pio");
	}
	
	public void crearNido(){
		System.out.println("Creando Nido...");
	}
}

class Pato extends Ave{
	
	Pato(){
		super();
	}
	
	@Override
	public void comunicarse(){
		System.out.println("Quack Quack");
	}
}

class Serpiente extends Reptil{
	
	public enum Especies{COBRA, VIBORA, PITON;}
	
	Serpiente(){
		super();
	}
	
	@Override
	public void comunicarse(){
		System.out.println("Sssss Sssss");
	}
	
	public void morder() {
		System.out.println("La serpiente muerde...");
	}
	
	public void muestraEspecies() {
		for(Especies esp: Especies.values() ) {
			System.out.print(esp.toString()+" ");
		}
	}
}
