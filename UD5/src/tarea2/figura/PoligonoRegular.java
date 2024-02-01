package tarea2.figura;

public abstract class PoligonoRegular implements Figura {
	protected double lado;
	public String color;
	
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
}
