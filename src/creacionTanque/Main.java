package creacionTanque;

public class Main {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto("Albert Llauradó", "General", 2500);
		Chasis chasis1 = new Chasis(235, "Obsidiana", 35000);
		Tanque panzer = new Tanque(piloto1, chasis1, 69694578, "17/09/25");
		
		panzer.mostrar();

	}

}
