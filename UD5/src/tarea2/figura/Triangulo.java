package tarea2.figura;

public class Triangulo extends PoligonoRegular{
	protected double altura;
	
	public Triangulo(double lado, double altura, String Color){
		this.lado = lado;
		this.altura = altura;
		comprobarColor(Color);
	}
	
	public Triangulo() {
		this.lado = 10;
		this.altura = 10;
		comprobarColor("Azul");
	}
	
	public double getLado() {
		return this.lado;
	}
	
	@Override
	public String toString() {
		return "Triangulo [Lado=" + this.lado + ", Altura=" + this.altura + ", Color=" +this.color +". Area=" +this.getArea()+"]" ;
	}
	
	@Override
	public double getArea() {
		double area = (this.altura * this.lado)/ 2;
		return area;
	}
	}
