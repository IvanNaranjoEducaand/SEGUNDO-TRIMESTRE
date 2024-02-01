package prueba1;

public class Principal {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Estudiante e3 = new Estudiante();
		
		
		System.out.println(e1.dameEdad());
		System.out.println("# de estudiante: " + e1.dameNumero());
		System.out.println("# de estudiante: " + e2.dameNumero());
		System.out.println("# de estudiante: " + e3.dameNumero());
		System.out.println("# de estudiantes: " + Estudiante.numEstudiante);
	}
}
