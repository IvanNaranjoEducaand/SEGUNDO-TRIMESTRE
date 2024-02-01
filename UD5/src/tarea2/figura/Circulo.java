package tarea2.figura;

public class Circulo implements Figura {
	public double radio;
	protected String color;
	
	public Circulo(double radio, String color) {
		this.radio = radio;
		comprobarColor(color);
	}
	
	public Circulo() {
		this.radio = 10;
		comprobarColor("Azul");
	}
	
	protected void comprobarColor(String color){
	 	String[] colores = {"Azul", "Rojo", "Verde", "Amarillo"};;
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){  
            if(colores[i].equals(color)){
                encontrado=true;
            }   
        }
        
        if(encontrado) {this.color=color;}
        else{ this.color="Azul";}

    }

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(radio, radio);
		return area;
	}
	
	@Override
	public String toString() {
		return "Círculo [Radio=" + this.radio + ", Color=" +this.color +". Area=" +this.getArea()+"]" ;
	}

}
