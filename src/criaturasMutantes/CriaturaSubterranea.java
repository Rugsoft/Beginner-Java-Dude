package criaturasMutantes;

public class CriaturaSubterranea extends Criatura {
	
	public CriaturaSubterranea(String name, String aDNType, int mutationLevel, int maxDeep) {
		
		super(name, aDNType, mutationLevel);
		this.maxDeep = maxDeep;
	}

	int maxDeep;

	public void showStats() {
		
		super.showStats();
		System.out.printf("Profundidad Máxima: %d m\n", this.maxDeep);
	}
	
	public int getMaxDeep() {
		return maxDeep;
	}

	public void setMaxDeep(int maxDeep) {
		this.maxDeep = maxDeep;
	}
}
