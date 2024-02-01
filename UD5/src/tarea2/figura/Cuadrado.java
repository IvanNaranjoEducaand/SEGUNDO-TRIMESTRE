package tarea2.figura;

public class Cuadrado extends PoligonoRegular{
	
	public Cuadrado(double lado, String Color){
		this.lado = lado;
		comprobarColor(Color);
	}
	
	public Cuadrado() {
		this.lado = 10;
		comprobarColor("Azul");
	}
	
	@Override
	public String toString() {
		return "Cuadrado [Lado=" + this.lado + ", Color=" +this.color +". Area=" +this.getArea()+"]" ;
	}
	
	
	@Override
	public double getArea() {
		double area = Math.pow(this.lado, this.lado);
		return area;
	}
}
