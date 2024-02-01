package tarea2.figura;

import java.util.Comparator;

public class ComparatorLado implements Comparator<Triangulo>{
	@Override
	public int compare(Triangulo o1, Triangulo o2) {
		int respuesta = 0;
		
		if(o1.getLado() > o2.getLado()) {
			respuesta = 1;
		} else if(o1.getLado() < o2.getLado()){
			respuesta = -1;
		} else {
			respuesta = 0;
		}
		
		return respuesta;
	}
}
