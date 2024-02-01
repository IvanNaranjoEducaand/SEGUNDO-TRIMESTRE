package tarea2.clientes;

import java.util.Comparator;

public class ComparatorSaldo implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int respuesta = 0;
		
		if(o1.getSaldo() > o2.getSaldo()) {
			respuesta = 1;
		} else if(o1.getSaldo() < o2.getSaldo()){
			respuesta = -1;
		} else {
			respuesta = 0;
		}
		
		return respuesta;
	}

}
