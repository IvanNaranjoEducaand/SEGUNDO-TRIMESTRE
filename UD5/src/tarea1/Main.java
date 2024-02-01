package tarea1;

import java.util.Scanner;

import tarea1.Caja.Caja;
import tarea1.Caja.CajaCarton;
import tarea1.electrodomestico.Electrodomestico;
import tarea1.electrodomestico.Lavadora;
import tarea1.electrodomestico.Electrodomestico.color;
import tarea1.electrodomestico.Electrodomestico.consumo;
import tarea1.hora.Hora;
import tarea1.hora.Hora12;
import tarea1.hora.HoraExacta;
import tarea1.instrumento.Campana;
import tarea1.instrumento.Piano;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué actividad desea realizar?: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			
			//ACTIVIDAD 1
			Hora hora1 = new Hora(12, 45);
			System.out.println(hora1.toString()+" HORA ORIGINAL");
			
			for(int i = 0; i < 14; i++) {
				hora1.inc();
			}
			
			System.out.println(hora1.toString()+" HORA INCREMENTADA");
			hora1.inc();
			System.out.println(hora1.toString()+" HORA INCREMENTADA PARA COMPROBAR EL CAMBIO DE HORAS");
			break;
			
		case 2:
			
			//ACTIVIDAD 2
			Hora12 hora2 = new Hora12(12, 45);
			System.out.println(hora2.toString()+" HORA ORIGINAL");
			
			for(int i = 0; i < 14; i++) {
				hora2.inc();
			}
			
			System.out.println(hora2.toString()+" HORA INCREMENTADA");
			hora2.inc();
			hora2.CambioHora();
			System.out.println(hora2.toString()+" HORA INCREMENTADA PARA COMPROBAR EL CAMBIO DE HORAS");
			break;
			
		case 3:
			
			//ACTIVIDAD 3
			HoraExacta hora3 = new HoraExacta(9, 23, 45);
			System.out.println(hora3.toString()+" HORA ORIGINAL");
			
			for(int i = 0; i < 14; i++) {
				hora3.inc();
			}
			
			System.out.println(hora3.toString()+" HORA INCREMENTADA");
			hora3.inc();
			System.out.println(hora3.toString()+" HORA INCREMENTADA PARA COMPROBAR EL CAMBIO DE MINUTOS");
			break;
			
		case 4:
			
			//ACTIVIDAD 1
			HoraExacta hora4 = new HoraExacta(9, 23, 45);
			System.out.println(hora4.toString()+" HORA ORIGINAL");
			
			for(int i = 0; i < 14; i++) {
				hora4.inc();
			}
			
			System.out.println(hora4.toString()+" HORA INCREMENTADA");
			hora4.inc();
			System.out.println(hora4.toString()+" HORA INCREMENTADA PARA COMPROBAR EL CAMBIO DE MINUTOS");
			break;
			
		case 5, 6:
			
			//ACTIVIDAD 5 y 6
			Campana campana1 = new Campana();
			Piano piano1 = new Piano();
			
			for(int i = 0; i < 48; i++) {
				campana1.add();
				piano1.add();
			}
			
			campana1.interpretar();
			System.out.println();
			piano1.interpretar();
			
			break;
		
		case 7:
			
			//ACTIVIDAD 7
			String unidades = "cm";
			Caja caja1 = new Caja(5.8, 4.2, 12.9, unidades);
			
			System.out.println("Volumen: "+caja1.getVolumen()+" m^3");
			System.out.println(caja1.toString());
			
			break;
			
		case 8:
			
			//ACTIVIDAD 8
			CajaCarton cajaC = new CajaCarton(6, 8, 7.5);
			
			System.out.println("Volumen: "+cajaC.getVolumen()+" m^3");
			System.out.println("Superficie: "+cajaC.getSuperficie()+" "+cajaC.getUnidades()+"^2");
			System.out.println(cajaC.toString());
			
			break;
			
		case 9:
			
			//ACTIVIDAD 9
			Electrodomestico elec1 = new Electrodomestico();
			Electrodomestico elec2 = new Electrodomestico(12, 34);
			Electrodomestico elec3 = new Electrodomestico(35, color.Rojo, consumo.A, 60);
			
			System.out.println("DATOS DE LOS ELCECTRODOMESTICOS\n");
			System.out.println(elec1.toString());
			System.out.println(elec2.toString());
			System.out.println(elec3.toString());
			
			
			
			Lavadora lava1 = new Lavadora();
			Lavadora lava2 = new Lavadora(56, 43);
			Lavadora lava3 = new Lavadora(23, 67, color.Negro, consumo.D, 37);
			
			System.out.println("\nDATOS DE LAS LAVADORAS\n");
			System.out.println(lava1.toString());
			System.out.println(lava2.toString());
			System.out.println(lava3.toString());
			
			break;
			
			
			
		default:
			break;
		}
		
		
		sc.close();
	}
}
