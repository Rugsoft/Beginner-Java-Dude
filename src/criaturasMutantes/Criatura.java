package criaturasMutantes;

public class Criatura {
	
	public Criatura(String name, String aDNType, int mutationLevel) {

		this.name = name;
		this.aDNType = aDNType;
		this.mutationLevel = mutationLevel;
	}
	
	String name;
	String aDNType;
	int mutationLevel;
	
	public void showStats() {
		
		System.out.printf("\nNombre: %s\nADN: %s\nNivel de mutación: %d\n", this.name, this.aDNType, this.mutationLevel);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getaDNType() {
		return aDNType;
	}
	public void setaDNType(String aDNType) {
		this.aDNType = aDNType;
	}
	public int getMutationLevel() {
		return mutationLevel;
	}
	public void setMutationLevel(int mutationLevel) {
		this.mutationLevel = mutationLevel;
	}
	
}
