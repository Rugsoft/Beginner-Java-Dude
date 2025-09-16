package criaturasMutantes;

public class Main {

	public static void main(String[] args) {
		
		Criatura Gnomo = new Criatura("David", "Gnomo", 2);
		
		CriaturaVoladora Dragon = new CriaturaVoladora("Veratora", "Dragon", 9, 250);
		
		CriaturaSubterranea Enano = new CriaturaSubterranea("Gimli", "Enano", 5, 1500);
		
		System.out.printf("Antes del cambio\n");
		Gnomo.showStats();
		Dragon.showStats();
		Enano.showStats();
		
		Gnomo.setName("Gargamel");
		Dragon.setFlySpeed(325);
		Enano.setName("Gloin");
		Enano.setMaxDeep(2000);
		
		System.out.printf("\nDespues de algunas modificaciones con SET\n");
		Gnomo.showStats();
		Dragon.showStats();
		Enano.showStats();

	}

}
