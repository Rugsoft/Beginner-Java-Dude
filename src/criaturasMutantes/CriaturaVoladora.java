package criaturasMutantes;

public class CriaturaVoladora extends Criatura {
	
	public CriaturaVoladora(String name, String aDNType, int mutationLevel, int flySpeed) {
		
		super(name, aDNType, mutationLevel);
		this.flySpeed = flySpeed;
	}

	int flySpeed;

	public void showStats() {
		
		super.showStats();
		System.out.printf("Velocidad de vuelo: %d km/h\n", this.flySpeed);
	}
	
	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}
}
