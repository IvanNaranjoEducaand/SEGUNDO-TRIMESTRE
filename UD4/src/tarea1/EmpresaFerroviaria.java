package tarea1;

public abstract class EmpresaFerroviaria {

}

class Personal extends EmpresaFerroviaria {
	protected String nombre;
	
	public Personal(String nombre) {
	        this.nombre = nombre;
	}
	
	public void getInfoPersonal() {
	}
}

class Maquinista extends Personal{
	private String dni;
	private int sueldoMensual;
	private String rango;
	
	Maquinista(String nombre, String dni, int sueldo, String rango){
		super(nombre);
		this.dni = dni;
		this.sueldoMensual = sueldo;
		this.rango = rango;
	}

	@Override
	public void getInfoPersonal() {
		System.out.println("Nombre Completo: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		System.out.println("Sueldo Mensual: "+this.sueldoMensual);
		System.out.println("Rango: "+this.rango);
		
	}
}

class Mecanico extends Personal {
	private String tlfno;
	private String especialidad;
	
	public Mecanico(String nombre, String tlfno, String especialidad) {
		super(nombre);
		this.tlfno = tlfno;
		this.especialidad = especialidad;
	}

	@Override
	public void getInfoPersonal() {
		System.out.println("Nombre Completo: "+this.nombre);
		System.out.println("Télefono: "+this.tlfno);
		System.out.println("Especialidad: "+this.especialidad);
	}
}

class JefeEstación extends Personal {
	private String dni;
	
	public JefeEstación(String nombre, String dni){
		super(nombre);
		this.dni = dni;
	}

	@Override
	public void getInfoPersonal() {
		System.out.println("Nombre Completo: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		
	}
}

class Maquinaria extends EmpresaFerroviaria {
	public void getInfoMaquinaria() {
	}
}

class Vagones extends Maquinaria {
	private int cargaMax;
	private int capacidadActual;
	private String mercancia;
	
	Vagones(int cargaMax, int capacidadActual, String mercancia){
		this.cargaMax = cargaMax;
		this.capacidadActual = capacidadActual;
		this.mercancia = mercancia;
	}
	
	@Override
	public void getInfoMaquinaria() {
		System.out.println("Carga Maxima de la máquina: "+this.cargaMax+" kilos.");
		System.out.println("Capacidad actual de la máquina: "+this.capacidadActual);
		System.out.println("Tipo de mercancia: "+this.mercancia);
		
	}
	
}

class Locomotoras extends Maquinaria {
	private String matricula;
	private int potencia;
	private String anoFabricacion;
	private Mecanico mecanico;
	
	Locomotoras(String matricula, int potencia, String anoFabricacion, Mecanico mecanico){
		this.matricula = matricula;
		this.potencia = potencia;
		this.anoFabricacion = anoFabricacion;
		this.mecanico = mecanico;
	}
	
	@Override
	public void getInfoMaquinaria() {
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Potencia: "+this.potencia);
		System.out.println("Año de fabricación: "+this.anoFabricacion);
		this.mecanico.getInfoPersonal();
		
	}
	
}

class Tren extends Maquinaria{
	private Locomotoras locomotora;
	private Vagones[] vagones;
	private Maquinista maquinista;
	final int MAX_VAGONES = 5;

	public Tren(Locomotoras locomotora, Maquinista maquinista) {
		this.setLocomotora(locomotora);
	    this.setVagones(new Vagones[MAX_VAGONES]);
	    this.setMaquinista(maquinista);
	}
	
	public Vagones[] getVagones() {
		return vagones;
	}
	
	public void addVagon(Vagones vagones) {
		
	}
	
	public void setVagones(Vagones[] vagones) {
		this.vagones = vagones;
	}

	public Locomotoras getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotoras locomotora) {
		this.locomotora = locomotora;
	}

	@Override
	public void getInfoMaquinaria() {
		this.locomotora.getInfoMaquinaria();
		System.out.println("Vagones: "+getVagones());
		this.maquinista.getInfoPersonal();
		
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	
}

