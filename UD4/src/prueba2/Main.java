package prueba2;

public class Main {
	public static void main(String[] args) {
		//CREACION DE ANIMALES
		Perro Perro1 = new Perro();
		Ave Pato1 = new Pato();
		Ave Ave1 = new Ave();
		Reptil Reptil1 = new Reptil();
		Serpiente Serpiente1 = new Serpiente();
		
		//PERRO
		System.out.println(Perro1.getClass().getSimpleName());
		Perro1.setCola(false);
		Perro1.setPatas(3);
		Perro1.comunicarse();
		Perro1.olfatear();
		Perro1.reproducete();
		System.out.println("Cola: "+Perro1.getCola());
		System.out.println("Patas: "+Perro1.getPatas()+"\n");
		
		//PATO
		System.out.println(Pato1.getClass().getSimpleName());
		Pato1.setAlas(2);
		Pato1.comunicarse();
		Pato1.reproducete();
		System.out.println("Alas: "+Pato1.getAlas()+"\n");
		
		//AVE
		System.out.println(Ave1.getClass().getSimpleName());
		Ave1.setAlas(1);
		Ave1.comunicarse();
		Ave1.crearNido();
		System.out.print("\n");
		
		//REPTIL
		System.out.println(Reptil1.getClass().getSimpleName());
		Reptil1.reproducete();
		System.out.print("\n");
		
		//SERPIENTE
		Serpiente1.muestraEspecies();
		System.out.print("\n");
		Serpiente1.morder();
		Serpiente1.comunicarse();
		
		System.out.print("\n");
		Mamifero.getVidasMamifero();
		Oviparo.getVidasOviparo();
		Animal.getVidas();
	}
}
