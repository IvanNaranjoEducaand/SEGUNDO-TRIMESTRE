package tarea1;

import java.util.Scanner;

public class Texto {
	private int longitud;
	private StringBuffer sB;
	
	Texto(String Cadena, int longitud){
		sB = new StringBuffer(longitud);
		sB.append(Cadena);
		this.longitud = longitud;
	}
	
	public void addCadenaCaracteres(char Caracter) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba donde quiere añadir el caracter (1 = inicio, 2 = final): ");
		int opcion = sc.nextInt();
		switch (opcion){
		case 1:
			if(this.sB.length() < this.longitud) {
				StringBuffer sBTemp = new StringBuffer();
				sBTemp.append(Caracter);
				sBTemp.append(this.sB);
				this.sB = sBTemp;
			}
			System.out.println(this.sB.toString());
			break;
			
		case 2:
			if(this.sB.length() < this.longitud) {
				sB.append(Caracter);
			}
			System.out.println(this.sB.toString());
			break;
		
		default:
			System.out.println("Entrada erronea");
			break;
		}
	}

	public void addCadenaCadena(String Cadena2) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba donde quiere añadir la cadena (1 = inicio, 2 = final): ");
		int opcion = sc.nextInt();
		switch (opcion){
		case 1:
			if(this.sB.length() < this.longitud) {
				StringBuffer sBTemp = new StringBuffer();
				sBTemp.append(Cadena2);
				sBTemp.append(this.sB);
				this.sB = sBTemp;
			}
			System.out.println(this.sB.toString());
			break;
			
		case 2:
			if(this.sB.length() < this.longitud) {
				sB.append(Cadena2);
			}
			System.out.println(this.sB.toString());
			break;
		
		default:
			System.out.println("Entrada erronea");
			break;
		}
	}
	
	public int contarVocales(String Cadena) {
		int numVocales = 0;
		for(int i = 0; i < this.sB.length(); i++) {
			char Actual = this.sB.toString().toLowerCase().charAt(i);
			
			switch (Actual) {
			case 'a', 'e', 'i', 'o', 'u':
				numVocales++;
			break;
			}
		
			
		}
		return numVocales;
	}
}
