package numerosFicheros;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero leer = new LeerFichero();
		EscribirFichero escribir = new EscribirFichero();
		
		List <Integer> numeros = new ArrayList<Integer>(leer.lecturaFichero());
		
		int suma = 0;
		for (int numero : numeros) {
			
			suma += numero;
		}
		
		escribir.pasarAFichero(suma);
		

	}

}
