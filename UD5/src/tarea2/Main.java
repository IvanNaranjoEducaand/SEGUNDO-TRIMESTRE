package tarea2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import tarea2.clientes.Cliente;
import tarea2.clientes.ComparatorDNI;
import tarea2.clientes.ComparatorEdad;
import tarea2.clientes.ComparatorNombre;
import tarea2.clientes.ComparatorSaldo;
import tarea2.figura.Circulo;
import tarea2.figura.ComparatorLado;
import tarea2.figura.Cuadrado;
import tarea2.figura.Figura;
import tarea2.figura.Triangulo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué actividad desea realizar?: ");
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			
			//ACTIVIDAD 1
			
			break;
			
		case 2:
			
			//ACTIVIDAD 2
			Cliente cli1 = new Cliente("Maria", "65782233I", 27, 4311); 
			Cliente cli2 = new Cliente("Jesus", "68436790D", 54, 2416);
			Cliente cli3 = new Cliente("Pedro", "75390214R", 41, 3569);
			Cliente cli4 = new Cliente("Marco", "86503276J", 19, 2260);
			Cliente cli5 = new Cliente("Jorge", "14769025X", 33, 7628);
			
			//MÉTODO TOSTRING
			System.out.println(cli1.toString());
			
			//MÉTODO EQUALS
			System.out.println(cli1.equals(cli2));
			System.out.println(cli1.equals(cli1));
			
			//LISTA DE ARRAYS
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			
			clientes.add(cli1);
			clientes.add(cli2);
			clientes.add(cli3);
			clientes.add(cli4);
			clientes.add(cli5);
			
			System.out.println("\nTABLA ORIGINAL\n");
			for(Cliente elemento:clientes) {
				System.out.println(elemento);
			}
			
			System.out.println("\nORDENADO POR NOMBRE\n");
			clientes.sort(new ComparatorNombre());
			for(Cliente elemento:clientes) {
				System.out.println(elemento);
			}
			
			System.out.println("\nORDENADO POR EDAD\n");
			clientes.sort(new ComparatorEdad());
			for(Cliente elemento:clientes) {
				System.out.println(elemento);
			}

			System.out.println("\nORDENADO POR DNI\n");
			clientes.sort(new ComparatorDNI());
			for(Cliente elemento:clientes) {
				System.out.println(elemento);
			}
			
			System.out.println("\nORDENADO POR SALDO\n");
			clientes.sort(new ComparatorSaldo());
			for(Cliente elemento:clientes) {
				System.out.println(elemento);
			}
			
			break;
			
		case 3:
			
			//ACTIVIDAD 3
			
			Figura[] FigurasGeometricas = new Figura[5];
			FigurasGeometricas[0] = new Circulo();
			FigurasGeometricas[1] = new Cuadrado();
			FigurasGeometricas[2] = new Triangulo();
			FigurasGeometricas[3] = new Circulo(24.8, "Rojo");
			FigurasGeometricas[4] = new Cuadrado(33.98, "Amarillo");
			
			System.out.println("\n"+Arrays.toString(FigurasGeometricas)+"\n");
			
			
			Triangulo[] ArrayTriang = new Triangulo[4];
			
			ArrayTriang[0] = new Triangulo(65.7, 3.8, "Rojo");
			ArrayTriang[1] = new Triangulo(45.8, 22, "Verde");
			ArrayTriang[2] = new Triangulo(21.7, 44, "Amarillo");
			ArrayTriang[3] = new Triangulo(33.7, 11.67, "Blanco"); //El color cambia a azul
			
			
			System.out.println(Arrays.toString(ArrayTriang)+"\n");
			
			
			ComparatorLado ComparadorLado = new ComparatorLado();
			Arrays.sort(ArrayTriang, ComparadorLado);
			
			System.out.println(Arrays.toString(ArrayTriang)+"\n");
			break;
		}
		
		
		sc.close();
	}
}
