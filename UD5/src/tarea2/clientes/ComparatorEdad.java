package tarea2.clientes;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Cliente>{
	@Override
	public int compare(Cliente o1, Cliente o2) {
		int respuesta = 0;
		
		if(o1.getEdad() > o2.getEdad()) {
			respuesta = 1;
		} else if(o1.getEdad() < o2.getEdad()){
			respuesta = -1;
		} else {
			respuesta = 0;
		}
		
		return respuesta;
	}
}
