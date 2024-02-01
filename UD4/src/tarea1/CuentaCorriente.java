package tarea1;

public class CuentaCorriente {
	private int saldo;
	private int descubierto;
	private String nombre;
	private String DNI;
	static String Banco;
	
	CuentaCorriente(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
		this.saldo = 0;
		this.descubierto = -50;
		
	}
	
	CuentaCorriente(int saldo){
		this.saldo = saldo;
		this.descubierto = 0;
	}
	
	CuentaCorriente(int saldo, int descubierto, String DNI){
		this.saldo = saldo;
		this.descubierto = descubierto;
		this.DNI = DNI;
	}
	
	public boolean SacarDinero(int importe) {
		boolean estado = true;
		int saldoRestante = this.saldo - importe;
		
		if(saldoRestante < this.descubierto) {
			estado = false;
			return estado;
		}
		
		this.saldo = saldoRestante;
		return estado;
	}

	public int IngresarDinero(int importe) {
		int saldoTotal = this.saldo + importe;
		this.saldo = saldoTotal;
		
		return this.saldo;
	}

	public void MostrarInfo() {
		System.out.println(this.nombre);
		System.out.println(this.DNI);
		System.out.println(this.saldo);
		System.out.println(this.descubierto);
	}
	
	public String GetBanco() {
		return Banco;
	}
	
	public void SetBanco(String BancoSet) {
		Banco = BancoSet;
	}
}
