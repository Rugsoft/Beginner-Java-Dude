package creacionTanque;

public class Chasis {
	
	private int structurePoints;
	private String material;
	private double price;
	
	public Chasis(int structurePoints, String material, double price) {
		this.structurePoints = structurePoints;
		this.material = material;
		this.price = price;
	}

	public int getStructurePoints() {
		return structurePoints;
	}

	public void setStructurePoints(int structurePoints) {
		this.structurePoints = structurePoints;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
