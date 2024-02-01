package prueba1;

 class Estudiante {
	static int numEstudiante = 0;
	
	String nombre;
	private int edad;
	String direccion;
	
	Estudiante(){
		numEstudiante ++;
	}
	
	int dameNumero() {
		return numEstudiante;
	}
	
	int dameEdad() {
		return edad;
	}
}

