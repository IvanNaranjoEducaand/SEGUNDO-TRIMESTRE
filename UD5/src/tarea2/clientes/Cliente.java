package tarea2.clientes;

public class Cliente{
	private String nombre;
	private String dni;
	private int edad;
	private int saldo;
	
	public Cliente(String nombre, String dni, int edad, int saldo) {
		this.nombre = nombre;
		this.dni =  dni;
		this.edad = edad;
		this.saldo = saldo;
	}
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		String cadenaCompleta = "||Nombre: "+this.nombre+"||DNI: "+this.dni+"||Edad: "+this.edad+"||Saldo: "+this.saldo+"€||";
		return cadenaCompleta;
	}
	
	public boolean equals(Cliente cliente) {
		if (this.dni == cliente.dni) {return true;}
		if (cliente.dni == null) {return false;}
		
		return false;
	}
}
